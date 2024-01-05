package com.example.spi;

import org.apache.dubbo.common.extension.Activate;

/**
 * @author 
 * @date 2023/7/15 15:58
 */
@Activate(group = {"online", "offline"})
public class CardPayOrder implements Order {
    @Override
    public void pay() {
        System.out.println("card");
    }
}
