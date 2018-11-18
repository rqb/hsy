package com.rqb.hsy.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/arap/Payment")
public class ArapPaymentController {

    @PostMapping(value = "",consumes = "application/json;charset=UTF-8")
    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        return 0l;
    }

}
