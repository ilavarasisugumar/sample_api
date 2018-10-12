package com.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HomeController {
	
	@GetMapping(path="/hello/{name}")
	public String hello(@PathVariable String name) {
		return "<h1> Nice meeting you " + name + "</h1>";
	}

}
