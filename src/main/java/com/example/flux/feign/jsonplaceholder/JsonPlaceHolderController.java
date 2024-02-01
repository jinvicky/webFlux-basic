package com.example.flux.feign.jsonplaceholder;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jsonplaceholder")
public class JsonPlaceHolderController {

    private final JsonPlaceholderService jsonPlaceholderService;

    public JsonPlaceHolderController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    @GetMapping("/posts/{id}")
    public String getJsonPostById(@PathVariable Long id) {
        return jsonPlaceholderService.getJsonPlaceholder(id);
    }

}
