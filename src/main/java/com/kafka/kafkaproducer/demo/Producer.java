package com.kafka.kafkaproducer.demo;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

/**
 * @Author hanyuhao
 * @PackageName com.kafka.kafkaproducer.demo
 * @Class SendMessage
 * @Date 2021/10/21 8:59
 */
//@Component
//@EnableScheduling
public class Producer {

//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void sendMsg(){
//        String msg = UUID.randomUUID().toString();
//        ListenableFuture future = kafkaTemplate.send("my_topic",msg);
//        future.addCallback(o-> System.out.println("seng-发送成功:"+msg),throwable -> System.out.println("消息发送失败："+msg));
//
//
//    }

}
