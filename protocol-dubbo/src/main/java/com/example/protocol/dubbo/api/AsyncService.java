package com.example.protocol.dubbo.api;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author 
 * @date 2023/7/15 17:23
 */
public interface AsyncService {

    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        CompletableFuture<String> future = CompletableFuture.completedFuture(sayHello(name));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return future;
    }

}
