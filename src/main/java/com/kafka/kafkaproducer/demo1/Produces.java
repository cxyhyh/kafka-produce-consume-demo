package com.kafka.kafkaproducer.demo1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author hanyuhao
 * @PackageName com.kafka.kafkaproducer.demo1
 * @Class Produce
 * @Date 2021/10/21 9:57
 */
@Component
//@EnableScheduling
public class Produces {

//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void SendMessage() {
//        String message = "韩宇豪发送kafka";
//        ListenableFuture listenableFuture = kafkaTemplate.send("my_topic",message);
//        System.out.println("发送消息成功："+listenableFuture);
//
//
//    }
//    private Log log = LogFactory.getLog(Produces.class);
//    private final KafkaTemplate kafkaTemplate;
//
//    @Autowired
//    public Produces(KafkaTemplate kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//        for (int i = 0; i <= 100; i++){
//            this.SendMsg("HYH"+ i);
//        }
//    }
//
//    private void SendMsg(String msg) {
//        log.info("发送消息"+msg);
//        this.kafkaTemplate.send("my_topic",msg);
//    }

}
