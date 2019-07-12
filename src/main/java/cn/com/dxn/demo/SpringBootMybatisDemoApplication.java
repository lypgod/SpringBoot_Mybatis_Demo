package cn.com.dxn.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("cn.com.dxn.demo.model.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class SpringBootMybatisDemoApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootMybatisDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisDemoApplication.class, args);
    }
}
