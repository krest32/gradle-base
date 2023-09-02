package org.test.service;

import org.base.common.CommonTool;
import org.base.common.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestService_1 {
    public static void main(String[] args) {
        CommonTool.out("krest");
        User user = User.builder().name("krest").age(18).build();
        System.out.println(user.toString());
        SpringApplication.run(TestService_1.class, args);
    }
}