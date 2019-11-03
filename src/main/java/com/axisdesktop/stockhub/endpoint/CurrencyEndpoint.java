package com.axisdesktop.stockhub.endpoint;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Endpoint(id = "currency")
public class CurrencyEndpoint {

    @Autowired
    MeterRegistry meterRegistry;

    @ReadOperation
    public Gauge features() {
        return Gauge.builder("dededee", () -> new Random().nextDouble()).register(meterRegistry);
//    meterRegistry.gauge("dddddd", 44);
//        return Map.of("dedede", "eee");
    }
}
