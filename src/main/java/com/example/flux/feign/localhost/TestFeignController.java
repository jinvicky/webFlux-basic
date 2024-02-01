package com.example.flux.feign.localhost;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestFeignController {

    private final TestFeignService testFeignService;

    public TestFeignController(TestFeignService testFeignService) {
        this.testFeignService = testFeignService;
    }

    @GetMapping("/")
    public String getTest() {
        return testFeignService.getTestFeign();
    }

    @GetMapping("/test/get")
    public String getTestFeign() {
        return "hello jinvicky!";
    }
}
