package com.exer.Day_4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exer.Day_4.day4.Day4;
import com.exer.Day_4.repository.Repository;

@Service
public class Student {
  @Autowired
  
  Repository rep;

public Day4 changeDetails(Day4 e) {
	// TODO Auto-generated method stub
	return rep.saveAndFlush(e);
}

public void updateDetailsById(int id, Day4 e) {
	// TODO Auto-generated method stub
	Optional<Day4> optionalDay4 = rep.findById(id);
}

public void deleteDetails(int id) {
	// TODO Auto-generated method stub
	rep.deleteById(id);
}


public Day4 saveDetails(Day4 eE) 
{
	// TODO Auto-generated method stub
	return rep.save(eE);
}


  

}
