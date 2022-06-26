package com.guo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 这个会拦截每一个Bean的生命周期
 * @Author gjyip
 * @Date 2022/6/26
 **/
public class MyProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("05- BeanPostProcessor postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("08- BeanPostProcessor postProcessAfterInitialization");
        return bean;
    }
}
