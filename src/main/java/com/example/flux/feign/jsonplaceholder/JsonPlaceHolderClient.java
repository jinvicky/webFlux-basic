package com.example.flux.feign.jsonplaceholder;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//controller의 requestMapping과 동일한 url 속성임.
@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolderClient {

    @GetMapping("/posts/{id}")
    String callJsonPlaceholder(@PathVariable("id") Long id);
}
