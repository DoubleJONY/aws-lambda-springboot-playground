package com.example.springstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("testService")
public class TestService {

    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();

        map.put("content", "Hello World!");

        return map;
    }
}
