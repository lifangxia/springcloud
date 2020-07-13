package com.beyondbit.springcloud.service.impl;

import com.beyondbit.springcloud.dao.PaymentDao;
import com.beyondbit.springcloud.entities.Payment;
import com.beyondbit.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author lfx
 * @version 1.0
 * @date 2020/6/30 13:37
 */
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
