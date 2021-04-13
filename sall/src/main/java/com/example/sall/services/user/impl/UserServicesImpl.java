package com.example.sall.services.user.impl;

import com.example.sall.mapper.user.UserMapper;
import com.example.sall.demo.User;
import com.example.sall.services.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author WWY
 * @version 1.0
 * @date 2021/2/7 15:03
 */
@Repository("userService")
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User readByUserId(String userId) {
        return this.userMapper.selectById(userId);
    }
}
