package com.example.triple.demo.provider;

import com.example.protocol.triple.api.Greeter;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

import java.io.IOException;

/**
 * @author lingyu
 * @date 2024/1/2 14:23
 */
public class TripleProvider {

    public void start() throws IllegalStateException {
        ServiceConfig<Greeter> service = new ServiceConfig<>();
        service.setInterface(Greeter.class);
        service.setRef(new GreeterImpl());

        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        bootstrap.application(new ApplicationConfig("tri-server"))
                .registry(new RegistryConfig("nacos://localhost:8848?username=nacos&password=nacos"))
                .protocol(new ProtocolConfig(CommonConstants.TRIPLE, 8080))
                .service(service)
                .start();
    }

    public static void main(String[] args) throws IOException {
        TripleProvider tripleProvider = new TripleProvider();
        tripleProvider.start();
        System.out.println("Dubbo triple stub server started, port=8080");
        System.in.read();
    }

}
