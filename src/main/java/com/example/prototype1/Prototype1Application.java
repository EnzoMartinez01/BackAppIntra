package com.example.prototype1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
@EnableAutoConfiguration
public class Prototype1Application {

    public static void main(String[] args) {
        SpringApplication.run(Prototype1Application.class, args);
    }

}
