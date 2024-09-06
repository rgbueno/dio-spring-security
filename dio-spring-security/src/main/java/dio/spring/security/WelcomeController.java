package dio.spring.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping
	public String welcome() {
		return "Bem vindo à minha API Spring boot!";
	}
	
	@GetMapping
	@PreAuthorize("hasAnyRole('managers', 'users'")
	public String users() {
		return "Authorized user";
	}
	
	@GetMapping
	@PreAuthorize("hasRole('managers')")
	public String managers() {
		return "Authorized manager";
	}

}
