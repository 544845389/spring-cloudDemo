package com.codingapi.configcode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by 54484 on 2018/3/23.
 */
@RestController
public class TestController {



    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String welcome(){
        return "123-test";
    }



    public static void main(String[] args) throws InterruptedException, IOException {
        String strs [] = new String[]{};
        String str = "";
        strs =  str.split("\n");

        for(int i =0 ; i<strs.length;i++ ){
            Runtime rt = Runtime.getRuntime();
            Process p = null;
            int exitVal;
            p = rt.exec("docker rmi -f "+strs[i]);
            // 进程的出口值。根据惯例，0 表示正常终止。
            exitVal = p.waitFor();
            System.out.println(exitVal);
        }

    }










}
