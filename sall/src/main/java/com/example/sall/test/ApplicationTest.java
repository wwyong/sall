package com.example.sall.test;

import com.example.sall.SallApplication;
import com.example.sall.demo.User;
import com.example.sall.services.user.UserServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WWY
 * @version 1.0
 * @date 2021/2/7 19:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SallApplication.class)
public class ApplicationTest {
    @Autowired
    private UserServices userServices;

    @Test
    public void test1() {
        User user1 = this.userServices.readByUserId("1");
        System.out.println("用户名" + user1.getUsername());

        User user2 = this.userServices.readByUserId("1");
        System.out.println("用户名" + user2.getUsername());
    }

    @Test
    public void test2() throws Exception {
        User user1 = this.userServices.readByUserId("1");
        System.out.println("用户名" + user1.getUsername());

//        user1.setName("康康");
//        this.studentService.update(student1);

        User user2 = this.userServices.readByUserId("1");
        System.out.println("用户名" + user2.getUsername());
    }
}
