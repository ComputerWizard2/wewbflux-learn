package com.luckye.test.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.luckye.test.enity.User;
import com.luckye.test.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
class UserController {
    @Autowired
    UserService userService;
    //id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable Integer id){

        return userService.getUserById(id);
    }
    //查询所有
    @GetMapping("/user/all")
    public Flux<User> getAllUser(){

        return userService.getAllUse();
    }

    //添加
    @PostMapping("/user/save")
    public Mono<Void> saveUser(@RequestBody User user){
        System.out.println(user.toString());
        Mono<User> just = Mono.just(user);
        return userService.saveUser(just);

    }
}
