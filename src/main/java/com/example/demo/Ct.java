package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping(value = "2")
public class Ct {
	//@RequestMapping(method = RequestMethod.GET,value = "2")
	@GetMapping("3")
	public String test() {
		return "my-app/index";
	}
}