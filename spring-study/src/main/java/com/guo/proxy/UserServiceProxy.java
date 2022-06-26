package com.guo.proxy;

import com.guo.service.IUserService;

/**
 * 静态代理的要求
 * 1.在不修改目标类方法代码的前提下，为目标方法增加额外的功能
 * a.在代理类也要有相同的目标方法
 * 代理类必须实现目标类同样的接口
 * b.若目标类没有实现接口，代理类继承目标类
 *
 * @Author gjyip
 * @Date 2022/6/26
 **/
public class UserServiceProxy implements IUserService {

    private IUserService target;

    public void setTarget(IUserService target) {
        this.target = target;
    }

    @Override
    public boolean login(String userName, String password) {
        System.out.println("日志。。。。。。。。1");
        boolean result = target.login(userName, password);
        System.out.println("日志。。。。。。。。2");
        return result;
    }
}
