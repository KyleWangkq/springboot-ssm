package cn.mytest.springbootssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @program: springboot-ssm
 * @description:  mybatis setting
 * @author: KyleWang
 * @create: 2019-04-09 22:48
 **/

@SpringBootConfiguration
@MapperScans(@MapperScan(basePackages = "cn.mytest.springbootssm.mapper"))
public class MybatisConfig {


}
