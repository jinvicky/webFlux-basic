package com.example.flux.basic;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api/mono")
@RequiredArgsConstructor
public class MonoController {

    @GetMapping("/test")
    public Mono<Map<String, Object>> test (HttpServletRequest request, HttpServletResponse response) {
            return Mono.just(Map.of("test", "this is test from jinvicky"));
    }
}
