package amanda.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import amanda.entidades.Postagem;

@RestController
public class PostagemController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	//acessa em http://localhost:8080/
	
	@RequestMapping("/")
	public Postagem greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Postagem(counter.incrementAndGet(), String.format(template, name));
	}
}
