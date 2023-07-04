package example.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ルート
 */
@RestController
@RequestMapping("/")
public class RootController {
	@GetMapping
	public void root() {
		return;
	}

	RootController() {
	}
}
