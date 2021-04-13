package com.example.sall.controller;

import com.example.sall.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WWY
 * @version 1.0
 * @date 2021/2/7 16:54
 */
@Controller
public class IndexController {
    @RequestMapping("/user")
    public String index(Model m) {
        List<User> list = new ArrayList<User>();
        list.add(new User("e10adc3949ba59abbe56e", "超级管理员", "17777777777"));
        list.add(new User("e10adc3949ba59abbe56e", "管理员", "13444444444"));
        list.add(new User("e10adc3949ba59abbe56e","运维人员","18666666666"));
        list.add(new User("e10adc3949ba59abbe56e", "清算人员", "19999999999"));
        m.addAttribute("userList",list);
        System.out.println("user");
        return "user";
    }
}
