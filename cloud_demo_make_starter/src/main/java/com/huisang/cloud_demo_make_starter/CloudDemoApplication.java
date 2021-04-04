package com.huisang.cloud_demo_make_starter;

import com.huisang.cloud_demo_make_starter.annotation.EnableLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableLogFilter
public class CloudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoApplication.class, args);
    }

    @PostMapping("/simpletest")
    public String test(){
        return "this is a test fun";
    }

    @GetMapping("/test")
    public String annotationTest() {
        return "this is a demo boot.";
    }
}
