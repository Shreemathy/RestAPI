package com.exer.day_2.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2Ex1 {
	@Value("${varname}")
	private String name;
	@GetMapping("day")
	public String display() {
	return name;
	}
}