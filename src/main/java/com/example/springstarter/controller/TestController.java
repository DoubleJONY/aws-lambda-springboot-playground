package com.example.springstarter.controller;

import com.example.springstarter.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity reloadSchema(HttpServletRequest request){
        Map<String, String> body = testService.test();
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
