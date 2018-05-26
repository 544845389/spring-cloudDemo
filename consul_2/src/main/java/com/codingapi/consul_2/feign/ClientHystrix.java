package com.codingapi.consul_2.feign;

import org.springframework.stereotype.Component;

/**
 * create by lorne on 2018/1/26
 */
@Component
public class ClientHystrix implements ClientService{



    @Override
    public String end(String name ) {
        return name + "end 有错误！";
    }


}
