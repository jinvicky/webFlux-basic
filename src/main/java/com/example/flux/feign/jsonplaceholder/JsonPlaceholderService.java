package com.example.flux.feign.jsonplaceholder;


import org.springframework.stereotype.Service;

@Service
public class JsonPlaceholderService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public JsonPlaceholderService(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public String getJsonPlaceholder(Long id) {
        return jsonPlaceHolderClient.callJsonPlaceholder(id);
    }
}
