package com.fuxinyu.service.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * @author： fuxinyu
 * Date: 2019/9/26
 * Time: 13:35
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootActivemqApplicationTests {

    @Bean
    public ActiveMQQueue queue() {
        return new ActiveMQQueue("test");
    }

//    @Test
//    public void contextLoads(){
//        Destination destination = new ActiveMQQueue("message.queue");
//        messageProduce.sendMsg0(destination,"今天天气不错");
//    }
}
