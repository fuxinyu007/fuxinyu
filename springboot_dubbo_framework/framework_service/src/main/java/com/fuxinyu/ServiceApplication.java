package com.fuxinyu;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author： fuxinyu
 * Date: 2019/9/24
 * Time: 10:18
 * Description:
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDubboConfiguration
@EnableJms
@EnableTransactionManagement(proxyTargetClass = true)
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }
}
