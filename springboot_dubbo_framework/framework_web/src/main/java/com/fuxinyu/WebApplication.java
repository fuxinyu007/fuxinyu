package com.fuxinyu;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author： fuxinyu
 * Date: 2019/9/24
 * Time: 10:49
 * Description:
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDubboConfiguration
@EnableTransactionManagement(proxyTargetClass = true)
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }

}
