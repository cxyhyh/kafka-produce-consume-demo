package com.kafka.kafkaproducer.demo2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * @Author hanyuhao
 * @PackageName com.kafka.kafkaproducer.demo2
 * @Class ProduceSend
 * @Date 2021/10/21 16:36
 */
@Component
public class ProduceSend {

    private Log log = LogFactory.getLog(ProduceSend.class);
    private final KafkaTemplate kafkaTemplate;



    public ProduceSend(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        Map<String, Object> map = new HashMap<>();
//        map.put("sendTime","2021-09-08 17:43:47");
//        map.put("facNo","1");
//        map.put("tableZiduan","2622纵联差动投入软压板(PCS-9613)");
//        map.put("idKey","954");
//        map.put("messageType","告知");
          map.put("dateTime","2021-09-08 17:43:47");
          map.put("stationOid","a2a7e86ac1ff8080816767d3f70167a2a718047653");
          map.put("pointNo","715");
          map.put("waterLevelAlarmStatus","-1");

//        for (int i = 0;i<10;i++){
            this.sendMsg(JSON.toJSONString(map));
        //}

    }

    private void sendMsg(String stringMap) {
        this.kafkaTemplate.send("test",stringMap);
        //this.kafkaTemplate.send("IdTenSecondWarning",stringMap);
        log.info("发送消息"+stringMap);
    }
}
