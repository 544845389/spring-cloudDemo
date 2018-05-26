package com.codingapi.consulclient.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by lorne on 2018/1/26
 */
@FeignClient(value = "server1",fallback = ServerClientHystrix.class)
public interface ServerClient {

    @RequestMapping(value = "/consul_1",method = RequestMethod.GET)
    String consul_1(@RequestParam("name") String name);


}
