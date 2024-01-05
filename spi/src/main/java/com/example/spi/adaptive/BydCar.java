package com.example.spi.adaptive;

import org.apache.dubbo.common.URL;

/**
 * @author 
 * @date 2023/7/15 13:55
 */
public class BydCar implements Car {
    @Override
    public void make(URL url) {
        System.out.println("BYD");
    }

    @Override
    public void price(URL url) {
        System.out.println("20w");
    }
}
