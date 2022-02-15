package com.sudip;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer://simpleTimer?period=10000")
                .setBody(simple("Hello from timer at ${header.firedTime}"))
                .log("${body}")
                ;

    }


}
