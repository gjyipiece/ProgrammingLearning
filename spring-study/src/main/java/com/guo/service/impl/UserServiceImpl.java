package com.guo.service.impl;

import com.guo.service.IUserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author gjyip
 * @Date 2022/6/26
 **/
public class UserServiceImpl implements IUserService,
        BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    /**
     * spring 生命周期
     * #执行构造方法
     * 01- 构造方法
     *
     * #执行属性注入
     * 02- 属性注入
     *
     * #让你知道下Bean的名字
     * 03-BeanNameAware setBeanName
     *
     * #让你知道下Bean的applicationContext
     * 04-ApplicationContextAware ApplicationContext
     *
     * #初始化方法调用之前调用
     * 05- BeanPostProcessor postProcessBeforeInitializatio
     *
     * #构造、注入完毕之后调用①（初始化，加载其他资源）
     * 06- InitializingBean afterPropertiesSet Method
     *
     * #构造、注入完毕之后调用②（初始化，加载其他资源）
     * 07- init-method
     *
     * #初始化方法调用之后调用
     * 08- BeanPostProcessor postProcessAfterInitialization
     *
     * #业务方法
     * "09- UserServiceImpl login method
     *
     * #销毁方法①
     * 10- DisposableBean destroy Method
     *
     * #销毁方法②
     * 11- destroy Method
     */
    private Integer age;


    public UserServiceImpl() {
        System.out.println("01- 构造方法");
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("02- 属性注入");
    }

    @Override
    public boolean login(String userName, String password) {
        System.out.println("09- UserServiceImpl login method");
        return false;
    }

    public void init() {
        System.out.println("07- init Method");
    }

    public void dealloc() {
        System.out.println("11- destroy Method");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("03-BeanNameAware setBeanName" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("04-ApplicationContextAware ApplicationContext" + applicationContext);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10- DisposableBean destroy Method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("06- InitializingBean afterPropertiesSet Method");
    }
}
