package com.rabbitmq.example.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.example.config.MessagingConfig;
import com.rabbitmq.example.dto.OrderStatus;

@Component
public class User {
	
	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("Message Received from queue: " + orderStatus);
	}

}
