package com.example.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author 
 * @date 2023/7/14 15:41
 */
@SPI
public interface Order {

    void pay();



}
