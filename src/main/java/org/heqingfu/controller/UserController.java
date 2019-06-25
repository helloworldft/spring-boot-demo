package org.heqingfu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heqingfu on 2019/6/25.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {


    @RequestMapping("/sayHello")
    public String sayHelloWorld() {
        System.out.println("say hello");
        return "hello, world!";
    }
}
