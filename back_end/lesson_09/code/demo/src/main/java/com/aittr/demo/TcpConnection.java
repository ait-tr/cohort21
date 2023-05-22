package com.aittr.demo;

import org.springframework.stereotype.Component;

@Component("tcp")
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
