package com.zqq.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
@Slf4j
public class ConsumerZkController {

    public static final String INVOKE_URL="http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("getPayment")
    public String getPaymentInfo(){
        String paymentInfo=restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return paymentInfo;
    }
}
