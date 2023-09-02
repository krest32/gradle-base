package org.test.service.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.test.service.entity.Apps;
import org.test.service.service.HelloService;
import org.test.service.tool.BeanUtilsTool;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@RestController
@RequestMapping
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("getById")
    public Apps getById(@RequestParam String id) {
        return helloService.getById(id);
    }
}
