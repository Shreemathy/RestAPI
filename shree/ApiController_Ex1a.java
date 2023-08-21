package com.exer.day1.shree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex1a {
@GetMapping("welcome")
public String Welcome() {
	return "Welcome";
}
}
