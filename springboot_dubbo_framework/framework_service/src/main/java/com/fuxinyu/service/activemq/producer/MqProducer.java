package com.fuxinyu.service.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @author： fuxinyu
 * Date: 2019/9/29
 * Time: 14:57
 * Description:生产者
 */
@Component
@EnableScheduling
public class MqProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

//    @Scheduled(fixedDelay = 2000)    // 每2s执行1次
    public void send() {
        this.jmsMessagingTemplate.convertAndSend("test", "hello,activeMQ");
    }

//    public void send(String queueName,String message){
//        jmsMessagingTemplate.convertAndSend(queueName,message);
//    }


}
