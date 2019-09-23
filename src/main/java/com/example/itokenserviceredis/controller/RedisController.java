package com.example.itokenserviceredis.controller;

import com.example.itokenserviceredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping(value = "put")
    public String put(String key,String value,long seconds){

        redisService.put(key,value,seconds);
        return "ok";
    }

    @GetMapping(value = "get")
    public Object get(String key){

        Object o=redisService.get(key);
        if(o!=null){
            return String.valueOf(o);
        }
        return null;
    }
}
