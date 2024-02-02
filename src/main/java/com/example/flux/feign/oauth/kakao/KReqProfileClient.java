package com.example.flux.feign.oauth.kakao;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "kakaoProfile", url= "${kakao.api}")
public interface KReqProfileClient {
    
    // 프로필 조회용
    
}
