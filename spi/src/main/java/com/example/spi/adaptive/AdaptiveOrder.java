package com.example.spi.adaptive;

import com.example.spi.Order;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @author 
 * @date 2023/7/14 22:51
 */
@Adaptive
public class AdaptiveOrder implements Order {
    @Override
    public void pay() {
        System.out.println("adaptive pay");
    }
}
