package com.codingapi.consulclient.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * create by lorne on 2018/1/26
 */
@Component
public class Server2ClientHystrix implements Server2Client{


    private Logger logger = LoggerFactory.getLogger(Server2ClientHystrix.class);


    @Override
    public String consul_2(String name ) {
        return name + " , consul_2 项目错误 ， ";
    }
}
