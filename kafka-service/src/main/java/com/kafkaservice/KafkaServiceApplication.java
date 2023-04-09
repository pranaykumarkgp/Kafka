package com.kafkaservice;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Properties;

@SpringBootApplication
public class KafkaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaServiceApplication.class, args);
//        System.out.println("service started");
//        Properties props = new Properties();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.0.100:9092");
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//        // Create the Kafka producer instance
//        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
//
//        MessageDTO messageDTO = new MessageDTO("Hello World");
//        // Send a message to the Kafka topic
//       for(int i = 0 ; i < 10000 ; i++){
//           producer.send(new ProducerRecord<>("agent-state", messageDTO.getMessage() + " " + i));
//       }
//
//        // Close the producer instance
//        producer.close();
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
//        return args -> {
//            for(int i = 0; i < 10; i++){
//                kafkaTemplate.send("agent-state", "hello-kafka" + i);
//            }
//
//        };
//    }

}
