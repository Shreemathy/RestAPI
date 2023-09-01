package com.exer.day6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exer.day6.entity.ChildEntity;
import com.exer.day6.service.ChildService;
@RestController
@RequestMapping(path="/api")
public class ChildController 
{
	
	@Autowired
	private ChildService childservice;
	

	@PostMapping(path="/savechild")
	public ChildEntity savechild(@RequestBody ChildEntity c) {
		return childservice.savechild(c);
	}

	@GetMapping(path="/getpage")
	public ResponseEntity<Page<ChildEntity>> getFlightsByField(@RequestParam String field,@RequestParam int pageNo,@RequestParam int pageSize){
		Page<ChildEntity> flights=childservice.getChildsByField(field, pageNo, pageSize);
		return ResponseEntity.ok(flights);
	}
	
}
