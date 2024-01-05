package com.example.triple.demo.provider;


import com.example.protocol.triple.api.Greeter;
import com.example.protocol.triple.api.GreeterReply;
import com.example.protocol.triple.api.GreeterRequest;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.concurrent.CompletableFuture;

/**
 * @author lingyu
 * @date 2024/1/2 11:40
 */
@DubboService
public class GreeterImpl implements Greeter {

    @Override
    public GreeterReply greet(GreeterRequest request) {
        System.out.println("received greet request " + request);
        return GreeterReply.newBuilder()
                .setMessage("hello," + request.getName())
                .build();
    }

    @Override
    public CompletableFuture<GreeterReply> greetAsync(GreeterRequest greeterRequest) {
        return CompletableFuture.completedFuture(this.greet(greeterRequest));
    }

}
