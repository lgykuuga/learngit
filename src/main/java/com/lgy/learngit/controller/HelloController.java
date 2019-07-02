package com.lgy.learngit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("name", "小甲鱼");
        map.put("age", "18");
        return "success";
    }

}
