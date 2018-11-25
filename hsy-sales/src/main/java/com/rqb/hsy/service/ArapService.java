package com.rqb.hsy.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Feign 客户端，value值（"hsy-arap"）为调用的服务的名称
 */
@FeignClient("hsy-arap")
public interface ArapService {

    @PostMapping(value = "/arap/Payment",consumes = "application/json;charset=UTF-8")
    public Long save(@RequestBody JSONObject jsonObject, @RequestParam("request") HttpServletRequest request);

}
