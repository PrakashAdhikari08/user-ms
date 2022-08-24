package com.rmit.userms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserMsApplication {

    @GetMapping("/hello")
    public String sayHello() {
        return  "Hello from First Api";
    }
    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }

}
