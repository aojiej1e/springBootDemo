package com.aojie.springbootdemo.service.impl;

import com.aojie.springbootdemo.service.TestServiceOne;
import com.aojie.springbootdemo.service.TestServiceTwo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author aojie
 * @Function
 * @create 2023-02-08 19:49
 */
@Service
public class TestServiceOneImpl implements TestServiceOne, ApplicationContextAware {

//    @Resource
    private TestServiceTwo testServiceTwo;

    @Override
    public String methodOne() {
        return "one";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBean("123");

    }
}
