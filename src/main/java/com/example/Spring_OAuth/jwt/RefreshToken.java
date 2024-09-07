package com.example.Spring_OAuth.jwt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Getter
@RedisHash(value = "refreshToken", timeToLive = 8640000L)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RefreshToken {

    @Id
    private Long id;

    @Indexed
    private String username;

    @Indexed
    private String refresh;

    @Indexed
    private String expiration;
}
