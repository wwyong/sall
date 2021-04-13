package com.example.sall.controller.user;

import com.example.sall.demo.User;
import com.example.sall.services.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WWY
 * @version 1.0
 * @date 2021/2/7 15:04
 */
@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserServices userServices;

    @RequestMapping("/getUsers")
    public String GetUser() {
        return userServices.readByUserId("1").toString();
    }

    @GetMapping("/aaa")
    public void test1() {
        User user1 = this.userServices.readByUserId("1");
        System.out.println("用户名" + user1.getUsername());

        User user2 = this.userServices.readByUserId("1");
        System.out.println("用户名" + user2.getUsername());
    }
}
