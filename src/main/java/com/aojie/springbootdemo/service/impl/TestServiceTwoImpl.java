package com.aojie.springbootdemo.service.impl;

import com.aojie.springbootdemo.service.TestServiceOne;
import com.aojie.springbootdemo.service.TestServiceTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author aojie
 * @Function
 * @create 2023-02-08 19:50
 */
@Service
public class TestServiceTwoImpl implements TestServiceTwo {

//    @Resource
    private TestServiceOne testServiceOne;

    @Override
    public String methodTwo() {
        return "two";
    }
}
