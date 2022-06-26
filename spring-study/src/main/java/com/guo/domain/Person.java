package com.guo.domain;

import lombok.Data;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;

/**
 * @Author gjyip
 * @Date 2022/6/18
 **/
@Data
public class Person {
    private String name;
    private Integer age;
    private BigDecimal money;

    public Person() {

    }

    @ConstructorProperties("age")
    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
