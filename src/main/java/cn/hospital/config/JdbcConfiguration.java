package cn.hospital.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfiguration {//连接池配置
    public DataSource dataSource(){
        DruidDataSource dataSource= new DruidDataSource();
        dataSource.setDriverClassName();
        dataSource.setUrl();
        dataSource.setUsername();
        dataSource.setPassword();
    }
}
