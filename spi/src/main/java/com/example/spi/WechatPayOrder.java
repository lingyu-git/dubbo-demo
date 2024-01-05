package com.example.spi;

import org.apache.dubbo.common.extension.Activate;

/**
 * @author 
 * @date 2023/7/14 15:42
 */
@Activate(group = {"online"})
public class WechatPayOrder implements Order {
    @Override
    public void pay() {
        System.out.println("wechat pay");
    }
}
