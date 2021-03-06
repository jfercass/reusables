package com.reusable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan(basePackages = "com.reusable.web")
@SpringBootApplication(scanBasePackages = {"com.reusable.web", "com.reusable.rest", "com.reusable.domain"})
public class JpaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JpaApplication.class, args);
    }
}
