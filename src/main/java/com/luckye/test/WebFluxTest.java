package com.luckye.test;



import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WebFluxTest {

    public static void main(String[] args) {
        //reactor 的核心语法 声明
        Flux.just(1,2,3,4);
        Mono.just(1);
        //其他方法
        Integer[] array={1,2,3,4};
        Flux.fromArray(array);
        //集合
        List<Integer> integers = Arrays.asList(array);
        Flux.fromIterable(integers);
        Stream<Integer> stream = integers.stream();
        Flux.fromStream(stream);
        System.out.println("hello world !!");

    }

}
