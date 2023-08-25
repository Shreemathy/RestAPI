package com.exer.Day_5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exer.Day_5.entity.Book;
import com.exer.Day_5.repository.BookRepository;

import jakarta.persistence.EntityNotFoundException;


@Service
public class BookService {
	
	@Autowired
     
	BookRepository bookrepository;
	
	public Book saveDetails(Book book) {
		return bookrepository.save(book);
	}



	public List<Book> getDetails() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

	public Optional<Book> getById(int id) {
		// TODO Auto-generated method stub
		return getById(id);
	}

	public Book changeDetails(Book b) {
		// TODO Auto-generated method stub
		return bookrepository.saveAndFlush(b);
	}

	public void updateDetailsById(int id, Book b) {
		// TODO Auto-generated method stub
		Optional<Book> optionalBook = bookrepository.findById(id);
		
		
	if(optionalBook.isPresent())
	{
		Book existingBook=optionalBook.get();
		existingBook.setBname(b.getBname());
		existingBook.setBprice(b.getBprice());
		existingBook.setQuantity(b.getQuantity());
	}
	else
	{
		
		throw new EntityNotFoundException("Employee with ID "+id+"not found");
		
	}
	}

	public void deleteDetails(Book b) {
		// TODO Auto-generated method stub
		bookrepository.delete(b);
	}



	
	
	
	
	
	

}
