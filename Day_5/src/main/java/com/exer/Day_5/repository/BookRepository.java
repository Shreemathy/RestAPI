package com.exer.Day_5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exer.Day_5.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {


}
