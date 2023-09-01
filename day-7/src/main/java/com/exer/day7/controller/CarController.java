package com.exer.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exer.day7.entity.CarEntity;
import com.exer.day7.service.CarService;

@RestController
@RequestMapping("apicar")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping(path="/savecar")
	public CarEntity saveCars(@RequestBody CarEntity c) {
		return carService.savecars(c);
	}
	
	   //JPQL
	
		@GetMapping("/getCarsUsingJPQL")
		public List<CarEntity> getAllCarsUsingJPQL(){
			return carService.getAllCarsUsingJPQL();
		}

	

}
