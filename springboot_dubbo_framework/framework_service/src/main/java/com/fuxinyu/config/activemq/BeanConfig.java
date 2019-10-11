//package com.fuxinyu.config.activemq;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.apache.activemq.RedeliveryPolicy;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.annotation.EnableJms;
//import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
//import org.springframework.jms.config.JmsListenerContainerFactory;
//
//import javax.jms.ConnectionFactory;
//
///**
// * @author： fuxinyu
// * Date: 2019/9/26
// * Time: 10:30
// * Description:
// */
//@Configuration
//@EnableJms
//public class BeanConfig {
//
//    @Bean
//    public RedeliveryPolicy redeliveryPolicy() {
//        RedeliveryPolicy redeliveryPolicy = new RedeliveryPolicy();
//        //是否在每次尝试重新发送失败后,增长这个等待时间
//        redeliveryPolicy.setUseExponentialBackOff(true);
//        //重发次数,默认为6次   这里设置为10次
//        redeliveryPolicy.setMaximumRedeliveries(1);
//        //重发时间间隔,默认为1秒
//        redeliveryPolicy.setInitialRedeliveryDelay(1);
//        //第一次失败后重新发送之前等待500毫秒,第二次失败再等待500 * 2毫秒,这里的2就是value
//        redeliveryPolicy.setBackOffMultiplier(2);
//        //是否避免消息碰撞
//        redeliveryPolicy.setUseCollisionAvoidance(false);
//        //设置重发最大拖延时间-1 表示没有拖延只有UseExponentialBackOff(true)为true时生效
//        redeliveryPolicy.setMaximumRedeliveryDelay(-1);
//        return redeliveryPolicy;
//    }
//
//    @Bean
//    public ActiveMQConnectionFactory activeMQConnectionFactory(@Value("${spring.activemq.broker-url}") String url, @Value("${spring.activemq.user}") String username, @Value("${spring.activemq.password}") String password, RedeliveryPolicy redeliveryPolicy) {
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(username, password, url);
//        activeMQConnectionFactory.setRedeliveryPolicy(redeliveryPolicy);
//        return activeMQConnectionFactory;
//    }
//
//    @Bean
//    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
//                                                    DefaultJmsListenerContainerFactoryConfigurer configurer) {
//
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        // This provides all boot's default to this factory, including the message converter
//        configurer.configure(factory, connectionFactory);
//
//        // You could still override some of Boot's default if necessary.
//        return factory;
//    }
//}
