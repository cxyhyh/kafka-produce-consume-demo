package com.kafka.kafkaproducer.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author hanyuhao
 * @PackageName com.kafka.kafkaproducer.demo
 * @Class Consumer
 * @Date 2021/10/21 9:31
 */
//@Component
public class Consumer {

//   @KafkaListener(topics = {"my_topic"})
//    public void receiveMsg(String msg){
//       System.out.println("消费消息"+msg);
//   }
}
