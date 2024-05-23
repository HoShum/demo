package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：haoshen
 * @date ：2024-05-23
 * @description : Demo应用
 */
@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class);
        System.out.println("容器启动(*^▽^*)");
    }
}
