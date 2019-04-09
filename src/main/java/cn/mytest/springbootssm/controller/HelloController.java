package cn.mytest.springbootssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-ssm
 * @description: say hello!
 * @author: KyleWang
 * @create: 2019-03-31 19:55
 **/

@RequestMapping("/test")
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String Hello(){
        return "Hello World!";
    }
}
