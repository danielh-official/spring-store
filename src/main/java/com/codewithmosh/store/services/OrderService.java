package com.codewithmosh.store.services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    // Another way to inject code is by using a setter (e.g., setPaymentService).
    private final PaymentService paymentService;

    // Might see @Autowired annotation in older codebases
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        this.paymentService.processPayment(100);
    }
}
