package com.fuxinyu.service.activemq.consume;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author： fuxinyu
 * Date: 2019/9/29
 * Time: 14:58
 * Description:
 */
@Component
public class MqConsumer {
    /**
     * 客户端消费
     * @param consumer
     */
    @JmsListener(destination = "test")
    public void receiveQueue(String consumer) {
        System.out.println(consumer+"消息已经消费了");
    }

//    @JmsListener(destination = "queueName")
//    public  void receiveQueue(String message){
//        System.out.println(message+"消息已经消费了");
//    }


}
