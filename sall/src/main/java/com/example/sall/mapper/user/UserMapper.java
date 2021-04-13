package com.example.sall.mapper.user;

import com.example.sall.demo.User;
import org.springframework.stereotype.Repository;

/**
 * @author WWY
 * @version 1.0
 * @date 2021/2/7 14:57
 */
@Repository
public interface UserMapper {
    public User selectById(String userId);
}
