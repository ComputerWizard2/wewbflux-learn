package com.luckye.test.hander;

import com.luckye.test.service.UserService;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.lang.invoke.VarHandle;

public class UserHander {

    private final UserService userService;


    public UserHander(UserService userService) {
        this.userService = userService;
    }
    //根据id
    public Mono<ServerResponse> getUserById(ServerRequest request){
        int id = Integer.valueOf(request.pathVariable("id"));

        return null;

    }

    //添加所有的
    //添加
}
