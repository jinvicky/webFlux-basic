package com.example.flux.feign.social.kakao;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KakaoFeignController {

    private final KakaoFeignService kakaoFeignService;

    public KakaoFeignController(KakaoFeignService kakaoFeignService) {
        this.kakaoFeignService = kakaoFeignService;
    }

    @GetMapping("/feign/kakao")
    public String processKakao(@RequestParam("code") String code) {
        String accessToken = kakaoFeignService.requestAccessToken(code);
        return "카카오 엑세스 토큰은 : " + accessToken;
    }

}
