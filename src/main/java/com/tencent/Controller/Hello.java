package com.tencent.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

    @RequestMapping("/hello.do")
    public String hello() {
        System.out.println("hello()");
        return "hello";
    }

    @RequestMapping("/hello01")
    public String newAction() {
        System.out.println("当前点击新方法");
        return "hello01";
    }

}
