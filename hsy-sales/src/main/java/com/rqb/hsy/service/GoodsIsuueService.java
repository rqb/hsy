package com.rqb.hsy.service;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Service("goodsIsuueService")
public class GoodsIsuueService {

    @Autowired
    ArapService arapService;

    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request){

        arapService.save(jsonObject,request);
        return 0l;
    }

}
