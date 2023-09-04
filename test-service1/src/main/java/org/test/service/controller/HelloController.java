package org.test.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.test.service.entity.Apps;
import org.test.service.service.HelloService;


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
