package com.example.start_test; // 这里的包名不要动，保留你原来的

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 加上这个注解
public class StartTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartTestApplication.class, args);
    }

    @GetMapping("/health") // 加上这个注解
    public String health() {
        return "UP";
    }
}