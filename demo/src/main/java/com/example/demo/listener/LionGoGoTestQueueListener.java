package com.example.demo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.rabbitmq.MqDto;

@Component
@RabbitListener(queues={"liongogo.test.queue"})
public class LionGoGoTestQueueListener {

    @RabbitHandler
    public void receive(MqDto mqDto) {
        System.out.println("從queue中接收到消息:"+mqDto.getBody());
    }
}