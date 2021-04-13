package com.example.sall.services.user;

import com.example.sall.demo.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author WWY
 * @version 1.0
 * @date 2021/2/7 15:02
 */
@CacheConfig(cacheNames = "user")
@Repository
public interface UserServices {
    @Cacheable(key = "#p0")
    public User readByUserId(String userId);
}
