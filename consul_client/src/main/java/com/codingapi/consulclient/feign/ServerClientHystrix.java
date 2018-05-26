package com.codingapi.consulclient.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * create by lorne on 2018/1/26
 */
@Component
public class ServerClientHystrix implements ServerClient{


    private Logger logger = LoggerFactory.getLogger(ServerClientHystrix.class);


    @Override
    public String consul_1(String name) {
        return name + " , consul_1 错误 ，";
    }



}
