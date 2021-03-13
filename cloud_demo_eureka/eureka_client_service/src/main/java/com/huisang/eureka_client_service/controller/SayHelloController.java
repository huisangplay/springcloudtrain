package com.huisang.eureka_client_service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/9 18:23
 */
@RestController
public class SayHelloController {
    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello, ".concat(name).concat("!");
    }
}
