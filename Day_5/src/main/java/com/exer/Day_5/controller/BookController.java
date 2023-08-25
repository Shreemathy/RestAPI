package com.exer.Day_5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exer.Day_5.entity.Book;
import com.exer.Day_5.service.BookService;



@RestController
public class BookController {
	
	
	@Autowired
	BookService bookservice;
	
	@PostMapping("/addBook")
	public Book add(@RequestBody Book book) {
		return bookservice.saveDetails(book);
	}
	
	@GetMapping("/showDetails")
	public List<Book> show()
	{
		return bookservice.getDetails();
	}
	
	@GetMapping("/showDetailsById/{id}")
	public Optional<Book> showById (@PathVariable int id)
	{
		return bookservice.getById(id);
	}
	
	@PutMapping("/updateDetails")
	public Book update(@RequestBody Book b)
	{
		return bookservice.changeDetails(b);
	}
	
	@PutMapping("updateDetailsById{id}")
	public ResponseEntity<String> updateById(@PathVariable int id,@RequestBody Book b)
  {
		bookservice.updateDetailsById(id, b);
	  return ResponseEntity.ok("Updated Sucessfully");
  }
	
	@DeleteMapping("DeleteDetails")
	public String delete(@RequestBody Book b)
	{
		bookservice.deleteDetails(b);
		return "Deleted Sucessfully";
	}
  
	
	@DeleteMapping("deleteEmployeesbyId/{id}")
	public String deleteDetailsById(@PathVariable Book id)
	{
		bookservice.deleteDetails(id);
		return "Deleted by id sucessfully";
		
	}
	
	
}
