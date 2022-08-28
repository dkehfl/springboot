package com.song.demo.controller;

import com.song.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController     // 요청 최초로 받음
@RequestMapping("/test")
public class TestController {


   /*private final TestService testService;

    // 생성자 주입
 //   TestController(TestService testService) {
 //       this.testService = testService;
  //  }

   @GetMapping("/test")
    public int testCarPathVariable(@RequestParam int num1, @RequestParam int num2) {
        int result = testService.car(num1, num2);
        return result;
    }

    @GetMapping("/carPathVariable/brand")
    public int testCarPathVariable(@PathVariable int num1, @PathVariable int num2) {
        int result = testService.car(num1, num2); */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/onePlusOne")
    public int onePlusOne() {
        return 1 + 1;
    }

    @GetMapping("/calculateRequestParam")
    public int calculateRequestParam(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }

    @GetMapping("/calculatePathVariable")
    public int calculatePathVariable(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }


}


