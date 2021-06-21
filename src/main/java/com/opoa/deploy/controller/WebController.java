package com.opoa.deploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: deploy->WebController
 * @description:
 * @author: opoa
 * @create: 2021-06-21 11:43
 **/
@RestController
public class WebController {

    @RequestMapping("/hi")
    public String sayHello() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(date);
        return "Hello, this is test by opoa. Time: " + now;
    }

}
