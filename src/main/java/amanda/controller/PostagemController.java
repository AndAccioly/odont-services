package amanda.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import amanda.entidades.Cliente;
import amanda.entidades.Postagem;

@RestController
public class PostagemController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	//acessa em http://localhost:8080/
	//postgresql-silhouetted-29706 as DATABASE_URL
	//postgres://tcvimbkejepuii:d2f265609fdcf58ff02fac30d44620681570c65dfdfee638655ead1238fdb7f4@ec2-52-203-118-49.compute-1.amazonaws.com:5432/d91j9h3ms9k5n1
	@RequestMapping("/")
	public Postagem greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Postagem(counter.incrementAndGet(), String.format(template, name));
	}
	
	@RequestMapping("")
	public Cliente clientePorId(@RequestParam(value = "cpf") String cpf) {
		return new Cliente(counter.incrementAndGet(), cpf, "João Testador");
	}
}
