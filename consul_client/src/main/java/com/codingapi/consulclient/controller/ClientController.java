package com.codingapi.consulclient.controller;


import com.codingapi.consulclient.feign.Server2Client;
import com.codingapi.consulclient.feign.ServerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by lorne on 2018/1/26
 */
@RestController
public class ClientController {


    private Logger logger = LoggerFactory.getLogger(ClientController.class);


    @Autowired
    private ServerClient serverClient;


    @Autowired
    private Server2Client server2Client;


    @RequestMapping("/client")
    public String hello(@RequestParam("name") String name){
        name = serverClient.consul_1(name);
        name =  server2Client.consul_2(name);
        return name;
    }



    @RequestMapping(value = "/end",method = RequestMethod.GET)
    public String end(@RequestParam("name") String name){
        return name + ", 这是end ";
    }


}
