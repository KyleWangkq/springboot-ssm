package cn.mytest.springbootssm.service;

import cn.mytest.springbootssm.pojo.User;

import java.util.List;

/**
 * @program: springboot-ssm
 * @description: User service interface
 * @author: KyleWang
 * @create: 2019-04-05 21:14
 **/

public interface UserService {
    List<User> findAll();
}
