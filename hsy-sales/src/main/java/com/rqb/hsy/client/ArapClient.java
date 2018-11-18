package com.rqb.hsy.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@FeignClient("hsy-arap")
public interface ArapClient {

    @PostMapping(value = "/arap/Payment",consumes = "application/json;charset=UTF-8")
    public Long save(@RequestBody JSONObject jsonObject, @RequestParam("request") HttpServletRequest request);

}
