package com.study.yaroslavambrozyak.todo.entity.oauth;

import org.springframework.data.annotation.Id;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;

public class MongoRefreshToken {

    @Id
    private String id;

    private String tokenId;
    private OAuth2RefreshToken token;
    private String authentication;
}
