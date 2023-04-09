package com.kafkaservice.controller;


import com.kafkaservice.dto.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/message")
public class KafkaProducerController {

    private Logger logger = LoggerFactory.getLogger(KafkaProducerController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void publish(@RequestBody Product product) {
        try {
            for(int i=0; i<1;i++){
                logger.info("publishing KafkaProductEvent into topic: {} ", "product-topic ");
                kafkaTemplate.send("product-topic", product.toString() + " " + i);
            }
        } catch (Exception e) {
            logger.error("Exception occurred while publishing KafkaProductEvent into topic: {} ", "product-topic");
        }
    }

}
