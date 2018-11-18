package com.rqb.hsy.service;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Service("goodsIsuueService")
public class GoodsIsuueService {

    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request){

        return 0l;
    }

}
