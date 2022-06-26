package com.guo.domain;

import com.guo.service.IPersonService;
import com.guo.service.IUserService;
import org.junit.Test;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

/**
 * @Author gjyip
 * @Date 2022/6/18
 **/
public class PersonTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        userService.login("12313", "111");
        context.close();
    }

    /**
     * 测试JDK自带的动态代理
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //目标对象
        IPersonService target = context.getBean("personService", IPersonService.class);

        //代理对象
        //ClassLoader loader, Class[] interfaces, InvocationHandler h
        IPersonService personService = (IPersonService) Proxy.newProxyInstance(
                getClass().getClassLoader(),//类加载器
                target.getClass().getInterfaces(),//代理类需要实现的接口（目标类的接口）
                (Object proxy, Method method, Object[] args) -> {//附加代码，代理类的具体实现
                    //proxy: 代理对象
                    //method:目标方法
                    //args:目标方法的参数
                    System.out.println("日志。。。。。。。。1");
                    //调用目标对象的目标方法（核心业务代码）
                    Object result = method.invoke(target, args);
                    System.out.println("日志。。。。。。。。2");
                    return result;
                }
        );
        personService.run("12313");
        context.close();
    }
}
