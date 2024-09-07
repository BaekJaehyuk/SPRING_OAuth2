package com.example.Spring_OAuth.jwt;

import org.springframework.data.repository.CrudRepository;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, String> {

    Boolean existsByRefresh(String refresh);

    void deleteByRefresh(String refresh);
}

