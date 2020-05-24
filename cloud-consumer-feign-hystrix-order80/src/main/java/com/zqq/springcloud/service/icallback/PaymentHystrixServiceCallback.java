package com.zqq.springcloud.service.icallback;

import com.zqq.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceCallback implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentHystrixServiceImpl,--paymentInfo_OK-------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentHystrixServiceImpl,--paymentInfo_TimeOut------";
    }
}
