package com.javaguides.app.controller;

import com.javaguides.app.common.HttpResponse;
import com.javaguides.app.dto.UserDto;
import com.javaguides.app.rabbitmq.RabbitMQProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class MessageController {
    private RabbitMQProducer rabbitMQProducer;

    public MessageController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<HttpResponse> send(@RequestBody UserDto user) {
        rabbitMQProducer.sendMessage(user);
        HttpResponse response = new HttpResponse(HttpStatus.CREATED, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
