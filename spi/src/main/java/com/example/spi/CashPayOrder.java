package com.example.spi;

import org.apache.dubbo.common.extension.Activate;

/**
 * @author 
 * @date 2023/7/15 16:00
 */
@Activate(group = {"offline"})
public class CashPayOrder implements Order {
    @Override
    public void pay() {
        System.out.println("cash");
    }
}
