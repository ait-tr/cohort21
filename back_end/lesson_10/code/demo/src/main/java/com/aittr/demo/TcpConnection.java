package com.aittr.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tcp")
@ConditionalOnProperty(
        value = "messenger.connection",
        havingValue = "tcp",
        matchIfMissing=true
)

public class TcpConnection implements Connection{
    public void init(){
        System.out.println("Init tcp connection");
    }
    public void send(){
        System.out.println("send ........");
    }

    public void close(){
        System.out.println("close tcp connection");
    }
}
