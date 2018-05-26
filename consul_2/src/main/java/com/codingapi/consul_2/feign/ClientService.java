package com.codingapi.consul_2.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 54484 on 2018/3/20.
 */
@FeignClient(value = "server3",fallback = ClientHystrix.class)
public interface ClientService {


    @RequestMapping(value = "/end",method = RequestMethod.GET)
    String end(@RequestParam("name") String name);


}
