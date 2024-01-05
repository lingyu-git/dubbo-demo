package com.example.protocol.dubbo.provider;

import cn.hutool.core.date.DateUtil;
import com.example.protocol.dubbo.api.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author 
 * @date 2023/7/15 17:25
 */
@Slf4j
@DubboService
public class AsyncServiceImpl implements AsyncService {
    @Override
    public String sayHello(String name) {
        log.info("---------" + DateUtil.now() + " Hello " + name + " , request from consumer " + RpcContext.getServiceContext().getRemoteAddress());
        return "---------- Hello " + name + ", response from provider: " + RpcContext.getServiceContext().getLocalAddress();
    }

}
