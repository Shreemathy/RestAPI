package com.exer.day1.shree3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1c {
	@GetMapping("col")
	public String getMyfav(@RequestParam String colour)
	{
		return "My Favourite Colour is: "+colour;
	}

}
