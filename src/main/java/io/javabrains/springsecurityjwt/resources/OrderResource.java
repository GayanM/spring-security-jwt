package io.javabrains.springsecurityjwt.resources;

import io.javabrains.springsecurityjwt.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class OrderResource {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message) {
        //kafkaTemplate.send(TOPIC, message);
        return "Published Message:" + message+ " Successfully";
    }

    @PostMapping("/publish")
    public String post(@RequestBody Order order) {
        kafkaTemplate.send(TOPIC, order.getId(), order);
        return "Order ID: " + order.getId() + " Published Successfully";
    }

}
