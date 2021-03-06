package com.example.demo.client;

import com.example.demo.entity.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lorne on 2017/6/27.
 */
@FeignClient(value = "demo2",fallback = Demo2ClientHystric.class)
public interface Demo2Client {


    @RequestMapping(value = "/demo2/demo/list",method = RequestMethod.GET)
    List<Test> list();


    @RequestMapping(value = "/demo2/demo/save",method = RequestMethod.GET)
    int save();
}
