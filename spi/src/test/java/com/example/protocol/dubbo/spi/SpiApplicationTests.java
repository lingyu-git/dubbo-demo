package com.example.protocol.dubbo.spi;

import com.example.spi.SpiApplication;
import com.example.spi.adaptive.Car;
import org.apache.dubbo.rpc.model.ApplicationModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class SpiApplicationTests {

    @Test
    public void adaptive() {
        Car car = ApplicationModel.defaultModel().getDefaultModule().getExtensionLoader(Car.class).getAdaptiveExtension();
    }

}
