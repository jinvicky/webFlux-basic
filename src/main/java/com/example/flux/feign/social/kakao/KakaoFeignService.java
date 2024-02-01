package com.example.flux.feign.social.kakao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class KakaoFeignService {

    private final KReqTokenClient KReqTokenClient;

    private static final String GRANT_TYPE = "authorization_code";

    @Value("${kakao.api}")
    private String apiUrl;

    @Value("${kakao.redirectUri}")
    private String redirectUri;

    @Value("${kakao.clientId}")
    private String clientId;

    public KakaoFeignService(KReqTokenClient KReqTokenClient) {
        this.KReqTokenClient = KReqTokenClient;
    }

    public String requestAccessToken(String code) {
        return KReqTokenClient.requestAccessToken(GRANT_TYPE, clientId, redirectUri, code).getAccessToken();
    }
}
