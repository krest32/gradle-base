package org.test.service;

import lombok.extern.slf4j.Slf4j;
import org.base.common.CommonTool;
import org.base.common.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        CommonTool.out("krest");
        User user = User.builder().name("krest").age(18).build();
        System.out.println(user.toString());
        SpringApplication.run(Main.class, args);
    }
}