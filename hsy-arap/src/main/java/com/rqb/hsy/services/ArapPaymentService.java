package com.rqb.hsy.services;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Service("arapPaymentService")
public class ArapPaymentService {


    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        System.out.println("Payment Save Service start ......");

        System.out.println("Payment Save Service end......");
        return 0l;
    }

}
