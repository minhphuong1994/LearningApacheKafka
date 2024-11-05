package com.phuongly.cab_driver.service;

import com.phuongly.cab_driver.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class CabLocationService {

    //this KafkaTemplate will help to publish data to Kafka (send data to Kafka)
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location){
        kafkaTemplate.send(KafkaConfig.CAB_LOCATION,location);
        return true;
    }
}
