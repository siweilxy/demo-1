package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1")
public class Ct {
	@RequestMapping(value = "/2")
	public int test() {
		return 1;

	}
}