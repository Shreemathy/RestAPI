package com.exer.day6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exer.day6.entity.ChildEntity;
import com.exer.day6.repository.ChildRepository;
//import com.exer.day6.repository.ChildRepository;
@Service
public class ChildService {
	
	@Autowired
private ChildRepository childrepository;
	
	
	

	public 	ChildEntity savechild(ChildEntity c) {
		return childrepository.save(c);
	}
	
	//Pagination and Sorting
	
	public Page<ChildEntity> getChildsByField(String field,int pageNo,int pageSize){
		Sort sort=Sort.by(field);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		return childrepository.findAll(pageable);
	}
	

}
