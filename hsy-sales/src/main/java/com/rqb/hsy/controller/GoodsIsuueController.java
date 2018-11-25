package com.rqb.hsy.controller;


import com.alibaba.fastjson.JSONObject;
import com.rqb.hsy.service.GoodsIsuueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("sales/GoodsIsuue")
public class GoodsIsuueController {

    @Autowired
    GoodsIsuueService goodsIsuueService;

    @PostMapping(value = "",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        System.out.println("GoodsIsuue Save start......");

        goodsIsuueService.save(jsonObject,request);

        System.out.println("GoodsIsuue Save end......");
        return 0l;
    }

}
