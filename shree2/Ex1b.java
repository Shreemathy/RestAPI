package com.exer.day1.shree2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Ex1b {
	@GetMapping("wel")
public String get(@RequestParam String name)
{
	return "Welcome "+name+"!";
}
}
