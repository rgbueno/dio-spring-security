package dio.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping
	public String welcome() {
		return "Bem vindo à minha API Spring boot!";
	}
	
	@GetMapping("/users")
	public String users() {
		return "Authorized user";
	}
	
	@GetMapping("/managers")
	public String managers() {
		return "Authorized manager";
	}

}
