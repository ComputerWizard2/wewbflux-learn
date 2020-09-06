package com.luckye.test.service;

import com.luckye.test.enity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    //根据id查询用户
    Mono<User> getUserById(Integer id);


    //查询所有的用户
    Flux<User> getAllUse();
    //添加用户
    Mono<Void> saveUser(Mono<User> user);

}
