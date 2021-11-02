package com.kafka.kafkaproducer.controller;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author hanyuhao
 * @PackageName com.kafka.kafkaproducer.controller
 * @Class KafkaController
 * @Date 2021/10/22 16:35
 */
@RequestMapping("/kafka")
@RestController
@EnableScheduling
public class KafkaController {

    private Log log = LogFactory.getLog(KafkaController.class);
    private final KafkaTemplate kafkaTemplate;

    public KafkaController(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/produce")
    @Scheduled(cron = "0 */1 * * * ?")
    public void produce() {
        Map<String, Object> map = new HashMap<>();
        map.put("sendTime","2021-09-08 17:43:47");
        map.put("facNo","1");
        map.put("tableZiduan","2622纵联差动投入软压板(PCS-9613)");
        map.put("idKey","954");
        map.put("messageType","告知");
        map.put("dateTime","2021-09-08 17:43:47");
        map.put("stationOid","a2a7e86ac1ff8080816767d3f70167a2a718047653");
        map.put("pointNo","715");
        map.put("waterLevelAlarmStatus","-1");
        for (int i = 0;i<10;i++){
        this.sendMsg(JSON.toJSONString(map));
        }
        //this.sendMsg("hyh");

    }

    private void sendMsg(String stringMap) {
        this.kafkaTemplate.send("my_topic", stringMap);
        //this.kafkaTemplate.send("IdTenSecondWarning",stringMap);
        log.info("发送消息" + stringMap);
    }

    @GetMapping("/consumer")
    @KafkaListener(topics = {"my_topic1"})
    public void consumer(String msg) {
        System.out.println("消费消息" + msg);
    }
}
