package com.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.api","com.db.schema"})//todo: check, if 1-st "com" package is needed
@Slf4j
public class ApiApplication {
    public static void main(String[] args) {SpringApplication.run(ApiApplication.class, args);}
}
