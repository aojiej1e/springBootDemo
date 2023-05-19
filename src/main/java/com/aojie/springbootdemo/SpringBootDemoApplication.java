package com.aojie.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 17671
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        //first
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
