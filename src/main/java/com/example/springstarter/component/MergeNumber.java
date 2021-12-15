package com.example.springstarter.component;

import com.example.springstarter.request.MergeNumberRequest;
import com.example.springstarter.response.MergeNumberResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MergeNumber implements Function<MergeNumberRequest, MergeNumberResponse> {
    @Override
    public MergeNumberResponse apply(MergeNumberRequest request) {
        int a = request.getA();
        int b = request.getB();

        return new MergeNumberResponse(a + " + " + b + " = " + (a+b) + " 입니다.");
    }
}

