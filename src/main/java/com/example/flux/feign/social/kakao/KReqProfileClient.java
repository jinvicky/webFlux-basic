package com.example.flux.feign.social.kakao;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kakaoProfile", url= "${kakao.api}")
public interface KReqProfileClient {
    
    // 프로필 조회용
    
}
