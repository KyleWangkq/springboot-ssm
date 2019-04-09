package cn.mytest.springbootssm.controller;

import cn.mytest.springbootssm.pojo.User;
import cn.mytest.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @program: springboot-ssm
 * @description: User bean controller
 * @author: KyleWang
 * @create: 2019-04-05 21:12
 **/

@RequestMapping("/user")
@RestController
public class UserController {


    @Autowired
   private  UserService userService;



    @GetMapping(value = "/getUserInfo")
    public List<User> getAllUser(){
        return userService.findAll();
    }
}