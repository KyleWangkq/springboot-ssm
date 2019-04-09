package cn.mytest.springbootssm.service.impl;

import cn.mytest.springbootssm.mapper.UserMapper;
import cn.mytest.springbootssm.pojo.User;
import cn.mytest.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-ssm
 * @description: Implement the user sercvice
 * @author: KyleWang
 * @create: 2019-04-05 21:15
 **/

@Service
public class UserServiceImpl implements UserService {


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {


        return userMapper.findAll();
    }
}
