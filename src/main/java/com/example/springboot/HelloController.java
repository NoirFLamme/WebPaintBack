package com.example.springboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Component;

@RestController
public class HelloController {

	

	@GetMapping("/{name}")
	public String hello(@PathVariable String name ) {
		return String.format("welcome %s to  paint", name);
	}
}