package io.javabrains.springsecurityjwt.listener;

import io.javabrains.springsecurityjwt.models.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /*@KafkaListener(topics = "Kafka_Example",groupId = "group_id")
    public void consume(Order order) {
        System.out.println("Order id: " + order.getId());
        System.out.println("Description : " + order.getDescription());
    }*/
}
