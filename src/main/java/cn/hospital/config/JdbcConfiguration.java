package cn.hospital.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration//声明一个类为Java配置类（相当于xml文件）
@PropertySource("classpath:jdbc.properties")//读取资源文件
public class JdbcConfiguration {//连接池配置
    //定义属性来接收资源文件
    @Value("${jdbc.driverClassName}")//注入属性(从spring 容器中获取)
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
@Bean//把方法的返回值注入spring容器
    public DataSource dataSource(){//注入一个连接池
        DruidDataSource dataSource= new DruidDataSource();
        dataSource.setDriverClassName(this.driverClassName);//this调取，来区分局部和全局。
        dataSource.setUrl(this.url);
        dataSource.setUsername(this.username);
        dataSource.setPassword(this.password);
        return dataSource;
    }
}
