package com.rqb.hsy.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/arap/Payment")
public class ArapPaymentController {

    @PostMapping(value = "",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        System.out.println("Payment Save start......");

        System.out.println("Payment Save end......");
        return 0l;
    }

}
