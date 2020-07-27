package com.quanfangtongvip.springcloudplayground.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @GetMapping("/")
    public String get() {
        return "hello";
    }
}
