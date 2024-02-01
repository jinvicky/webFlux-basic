package com.example.flux.feign.localhost;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "http://localhost:8089")
public interface TestFeignClient {

    // http://localhost:8089/testfeign로 호출을 해서
    // controller 단에서 "hello!"를 리턴하면 그걸 처리한다.
    @GetMapping("/test/get")
    String callTestString();

}
