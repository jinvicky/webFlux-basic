package com.example.flux.basic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;
import java.util.Map;

@SpringBootTest
class WebFluxBasicTests {

    @Test
    void contextLoads() {
    }

    @Test
    void justString () {
        Mono<String> monoString = Mono.just("hello").log();
        monoString.subscribe(System.out::println);
    }

    @Test
    void justStringError () {
        Mono<?> monoString = Mono.just("hello world")
                .then(Mono.error(new RuntimeException("Exception occured")))
                .log();
        monoString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
    }

    @Test
    void justStringList () {
        Flux<String> fluxString = Flux.just("hello", "world", "AWS").log()
                .concatWithValues("AWS") // fluxString 다음으로 concat할 값을 적을 때 (마지막에 출력된다.)
                .concatWith(Flux.error(new RuntimeException("error in flux"))) // 에러를 강제로 발생, 이후 따라오는 concatWith들은 사용되지 않는다.
                .log();
        fluxString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
    }

    @Test
    void range () {
        Flux<Integer> fluxInteger = Flux.range(1, 5).log();
        fluxInteger.subscribe(System.out::println);
    }

    @Test
    void using () {
        Mono<String> resourceMono = Mono.using(
                () -> "jinvicky load...",
                resource -> Mono.just(resource + " data"),
//                resource -> Mono.error(new RuntimeException("Exception occured")), // 예외 발생시  error -> 호출
                resource -> Mono.just(resource + " cleaned")
        );

        resourceMono.subscribe(
                result -> System.out.println("리소스 결과값: " + result), // 두번째 함수 결과 출력
                error -> System.err.println("에러 발생: " + error),
                () -> System.out.println("클린업 함수 완료, 파람으로 resource를 받는 건 안되더라")
        );
    }

    @Test
    void take () {
        Flux<Map<String, Integer>> coffeeAndPrice = Flux.just(
                Map.of("juice", 5500, "icecream", 3500, "coffee", 1000, "latte", 2000, "americano", 1500)).log();

        coffeeAndPrice
                .flatMapIterable(menu -> menu.entrySet()) // Map을 메뉴 항목으로 변환
                .collectSortedList(Map.Entry.comparingByValue()) // 가격으로 정렬
                .flatMapMany(entries -> Flux.fromIterable(entries).take(2)) // 처음 2개 항목 선택
                .subscribe(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

}
