package com.study.yaroslavambrozyak.todo.repository.oauth;

import com.study.yaroslavambrozyak.todo.entity.oauth.MongoRefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRefreshTokenRepository extends MongoRepository<MongoRefreshToken,String> {
}
