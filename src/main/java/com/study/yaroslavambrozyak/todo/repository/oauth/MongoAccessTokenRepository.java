package com.study.yaroslavambrozyak.todo.repository.oauth;

import com.study.yaroslavambrozyak.todo.entity.oauth.MongoAccessToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MongoAccessTokenRepository extends MongoRepository<MongoAccessToken,String> {

    Optional<MongoAccessToken> findByTokenId(String tokenId);

}
