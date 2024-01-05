package com.example.spi.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author 
 * @date 2023/7/15 13:55
 */
@SPI("bydCar")
public interface Car {

    @Adaptive({"key1"})
    void make(URL url);

    @Adaptive
    void price(URL url);

}
