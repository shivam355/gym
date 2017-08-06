package org.varrange.gym.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/authenticate")
	public String authenticate() {
		return "AUTH";
	}
}
