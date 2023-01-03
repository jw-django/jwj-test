package jwj.jwjtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControllerV1 {

	@ResponseBody
	@GetMapping
	public String hello() {
		return "hello world!";
	}
	
	@PostMapping
	public String helloPost() {
		return "redirect:/basic/hello";
	}
}
