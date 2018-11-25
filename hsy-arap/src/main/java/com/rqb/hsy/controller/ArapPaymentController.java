package com.rqb.hsy.controller;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.rqb.hsy.services.ArapPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
@RequestMapping("/arap/Payment")
public class ArapPaymentController {
    private final static Random random = new Random();

    @Autowired
    ArapPaymentService arapPaymentService;

    @HystrixCommand(fallbackMethod = "saveFallBack",
            commandProperties=@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="100"))
    @PostMapping(value = "",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    public Long save(@RequestBody JSONObject jsonObject, HttpServletRequest request) throws InterruptedException {
        //模拟save服务执行超时，调用FallBack方法
        int time = random.nextInt(200);
        System.out.println("save cost time:"+time);
        Thread.sleep(time);

        arapPaymentService.save(jsonObject, request);
        return 0l;
    }

    public Long saveFallBack(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        System.out.println("return default value ......");

        return 9999l;
    }

}
