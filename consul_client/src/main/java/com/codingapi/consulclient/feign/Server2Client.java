package com.codingapi.consulclient.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by lorne on 2018/1/26
 */
@FeignClient(value = "server2",fallback = Server2ClientHystrix.class)
public interface Server2Client {



    @RequestMapping(value = "/consul_2",method = RequestMethod.GET)
    String consul_2(@RequestParam("name") String name);

}
