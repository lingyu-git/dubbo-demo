package com.example.triple.demo.consumer;

import com.example.protocol.triple.api.Greeter;
import com.example.protocol.triple.api.GreeterReply;
import com.example.protocol.triple.api.GreeterRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

import java.util.Scanner;

/**
 * @author lingyu
 * @date 2024/1/2 14:03
 */
public class TripleConsumer {

    private Greeter greeter;

    private void start() {
        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        ReferenceConfig<Greeter> ref = new ReferenceConfig<>();
        ref.setInterface(Greeter.class);
        ref.setProtocol(CommonConstants.TRIPLE);
        ref.setTimeout(3000);
        bootstrap.registry(new RegistryConfig("nacos://localhost:8848?username=nacos&password=nacos"));
        bootstrap.application(new ApplicationConfig("tri-consumer"))
                .reference(ref)
                .start();
        this.greeter = ref.get();
    }

    public static void main(String[] args) {
        TripleConsumer tripleConsumer = new TripleConsumer();
        tripleConsumer.start();

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String text = scanner.nextLine();
            if ("q".equals(text)) {
                break;
            }
            GreeterReply reply = tripleConsumer.greeter.greet(
                    GreeterRequest
                            .newBuilder()
                            .setName(text)
                            .build());
            System.out.println("replay -> " + reply.getMessage());
        }
        scanner.close();
        DubboBootstrap.getInstance().stop();
    }

}
