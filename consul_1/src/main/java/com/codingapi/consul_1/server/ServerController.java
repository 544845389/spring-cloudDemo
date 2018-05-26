package com.codingapi.consul_1.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class ServerController {


    private Logger logger = LoggerFactory.getLogger(ServerController.class);


//    @Value("${name}")
    private String configName;


    @RequestMapping(value = "/consul_1",method = RequestMethod.GET)
    public String welcome(@RequestParam("name") String name){
//        System.out.println("这是配置中心的name:"+configName);
        return  name + " , consul_1 成功 ,";
    }



}
