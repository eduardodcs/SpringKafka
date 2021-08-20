package br.com.eduardo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.model.Pedido;

@RestController
@RequestMapping("kafka")
public class PedidoResource {
	
	@Autowired
	private KafkaTemplate<String, Pedido> kafkaTemplate;
	private static final String TOPIC = "Kafka_Example";

	@GetMapping("/publish/{produto}")
	public String post(@PathVariable("produto") final String produto) {
		
		kafkaTemplate.send(TOPIC, new Pedido(produto, 125.1, 2L));
		return "Publish successfully";
	}
	
}
