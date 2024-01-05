package com.example.spi.wrapper;

import com.example.spi.Order;

/**
 * @author 
 * @date 2023/7/14 22:33
 */
public class OrderWrapper implements Order {

    private Order order;

    public OrderWrapper(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("---- before");
        this.order.pay();
        System.out.println("---- after");
    }
}
