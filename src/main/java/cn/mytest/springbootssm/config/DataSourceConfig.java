package cn.mytest.springbootssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @program: springboot-ssm
 * @description: mysql datasource
 * @author: KyleWang
 * @create: 2019-04-08 21:40
 **/


//@SpringBootConfiguration
public class DataSourceConfig {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.driver-class-name}")
     private String driver;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource createDataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        System.out.println(dataSourceBuilder.toString());
        dataSourceBuilder.driverClassName(this.driver);
        dataSourceBuilder.url(this.url);
        dataSourceBuilder.username(this.username);
        dataSourceBuilder.password(this.password);

        return dataSourceBuilder.build();
    }


}
