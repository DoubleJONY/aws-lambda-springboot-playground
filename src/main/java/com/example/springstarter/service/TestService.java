package com.example.springstarter.service;

import com.example.springstarter.request.TestRequest;
import com.example.springstarter.response.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("testService")
public class TestService {

    public TestResponse test(TestRequest request) {

        return new TestResponse("Hello " + request.getName() + "!");
    }

    public TestResponse add(TestRequest request) {

        return new TestResponse(request.getA() + " + " + request.getB() + " = " + request.getA() + request.getB());
    }
}
