package com.song.demo.service;

import org.springframework.stereotype.Service;

// 비즈니스 로직 처리
@Service
public class TestService {

    public int car(int num1, int num2) {
        return num1 + num2;
    }

}
