package com.example.protocol.dubbo.consumer;

import cn.hutool.core.date.DateUtil;
import com.example.protocol.dubbo.api.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * @author 
 * @date 2023/12/14 22:06
 */
@Slf4j
@Component
public class AsyncConsumer {

    @DubboReference
    private AsyncService asyncService;

    public void hello(String name) {
        CompletableFuture<String> future = asyncService.sayHelloAsync(name);
        future.thenAccept(result -> log.info(DateUtil.now() + result));
        log.info("--------- end");
    }

}
