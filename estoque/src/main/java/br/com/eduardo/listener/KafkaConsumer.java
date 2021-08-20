package br.com.eduardo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.eduardo.model.Pedido;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}
	
	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
			containerFactory = "produtoListenerFactory")
	public void consumeJson(Pedido produto) {
		System.out.println("Consumed JSON message: " + produto);
	}
	
}
