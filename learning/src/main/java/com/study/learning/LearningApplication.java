package com.study.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication public class LearningApplication {

    public static void main(String[] args) {
        System.out.println("今天你学习了吗");
        SpringApplication.run(LearningApplication.class, args);
    }

}
