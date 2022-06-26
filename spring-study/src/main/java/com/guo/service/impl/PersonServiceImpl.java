package com.guo.service.impl;

import com.guo.service.IPersonService;

/**
 * @Author gjyip
 * @Date 2022/6/26
 **/
public class PersonServiceImpl implements IPersonService {

    @Override
    public boolean run(String name) {
        System.out.println("PersonServiceImpl run :" + name);
        return false;
    }
}
