package com.javatpoint.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.javatpoint.model.Product;

@Component
public class MessageReceiver
{
	private static final String MESSAGE_QUEUE = "order_queue";
	
	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Product product)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + product);
	}
	
}
