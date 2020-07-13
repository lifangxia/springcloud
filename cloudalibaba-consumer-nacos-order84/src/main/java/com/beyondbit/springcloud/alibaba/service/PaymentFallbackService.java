package com.beyondbit.springcloud.alibaba.service;

import com.beyondbit.springcloud.entities.CommonResult;
import com.beyondbit.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author lfx
 * @version 1.0
 * @date 2020/7/10 14:35
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

