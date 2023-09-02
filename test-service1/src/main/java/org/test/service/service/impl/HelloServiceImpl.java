package org.test.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.service.entity.Apps;
import org.test.service.mapper.HelloMapper;
import org.test.service.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    HelloMapper mapper;

    @Override
    public Apps getById(String id) {
        return mapper.selectById(id);
    }
}
