package com.example.flux.feign.localhost;


import org.springframework.stereotype.Service;

@Service
public class TestFeignService {

    private final TestFeignClient testFeignClient;

    public TestFeignService(TestFeignClient testFeignClient) {
        this.testFeignClient = testFeignClient;
    }

    public String getTestFeign() {
        return testFeignClient.callTestString();
    }

}
