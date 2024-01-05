package com.example.spi.adaptive;

import org.apache.dubbo.common.URL;

/**
 * @author 
 * @date 2023/7/15 13:58
 */
public class AudiCar implements Car {
    @Override
    public void make(URL url) {
        System.out.println("Audi");
    }

    @Override
    public void price(URL url) {
        System.out.println("40w");
    }
}
