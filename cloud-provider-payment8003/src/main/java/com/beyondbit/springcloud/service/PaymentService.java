package com.beyondbit.springcloud.service;

import com.beyondbit.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lfx
 * @version 1.0
 * @date 2020/6/30 13:32
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
