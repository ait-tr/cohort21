package com.aittr.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("udp")
@Scope("prototype")
@ConditionalOnProperty(
        value = "messenger.connection",
        havingValue = "udp",
        matchIfMissing=false
)
public class UdpConnection implements Connection{
    public void init(){
        System.out.println("Init udp connection");
    }
    public void send(){
        System.out.println("send ........");
    }

    public void close(){
        System.out.println("close udp connection");
    }


}
