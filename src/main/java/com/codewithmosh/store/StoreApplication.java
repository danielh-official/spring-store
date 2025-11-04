package com.codewithmosh.store;

import com.codewithmosh.store.services.OrderService;
import com.codewithmosh.store.services.StripePaymentService;
import com.codewithmosh.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class); // PHP equivalent for the argument would be OrderService::class
        orderService.placeOrder();
        var service =  context.getBean(UserService.class);
        service.fetchPaginatedProducts(0, 10);

        // I have the option of turning this into a console application by commenting out the above code.
//        var orderService = new OrderService(new StripePaymentService());
//        orderService.placeOrder();

    }
}
