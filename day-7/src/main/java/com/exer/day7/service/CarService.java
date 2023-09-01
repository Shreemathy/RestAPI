package com.exer.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exer.day7.entity.CarEntity;

import com.exer.day7.repository.CarRepository;
@Service
public class CarService {
	@Autowired
	private CarRepository carrepository;
	
	
	

	public CarEntity savecars(CarEntity c) {
		return carrepository.save(c);
	}
	
	//jpql
	
	public List<CarEntity> getAllCarsUsingJPQL(){
		return carrepository.getAllCarsUsingJPQL();
	}
  

	
	}

