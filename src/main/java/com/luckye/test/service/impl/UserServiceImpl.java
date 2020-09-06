package com.luckye.test.service.impl;

import com.luckye.test.enity.User;
import com.luckye.test.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {

    private final Map<Integer,User> map =new HashMap<>();
    public UserServiceImpl() {
        this.map.put(1,new User("jack","男","30"));
        this.map.put(2,new User("marry","女","30"));
        this.map.put(3,new User("jerry","男","20"));
        this.map.put(4,new User("tom","男","20"));


    }

    @Override
    public Mono<User> getUserById(Integer id) {

        return Mono.justOrEmpty(this.map.get(id));
    }
    //查询多个用户

    @Override
    public Flux<User> getAllUse() {
        return Flux.fromIterable(this.map.values());
    }

    @Override
    public Mono<Void> saveUser(Mono<User> userMono) {

        return userMono.doOnNext(person->{
            int len = map.size() + 1;
            map.put(len,person);
        }).thenEmpty(Mono.empty());
    }
}
