package cn.mytest.springbootssm.mapper;

import cn.mytest.springbootssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

   List<User> findAll();
}
