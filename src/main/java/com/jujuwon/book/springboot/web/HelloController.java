package com.jujuwon.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller 를 JSON 반환 Controller 로 만들어줌
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
