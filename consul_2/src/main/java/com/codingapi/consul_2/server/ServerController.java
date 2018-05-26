package com.codingapi.consul_2.server;

import com.codingapi.consul_2.feign.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServerController {


    @Autowired
    private ClientService  clientService;

//
//    @Value("${name}")
//    private String configName;



    private Logger logger = LoggerFactory.getLogger(ServerController.class);

    @RequestMapping(value = "/consul_2",method = RequestMethod.GET)
    public String welcome(@RequestParam("name") String name){
//        System.out.println( "consul 2 中:" + configName);
        name =  clientService.end(name);
        return  name + " , consul_2 成功 ,";
    }




}
