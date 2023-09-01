package com.exer.day7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exer.day7.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity,Integer>{


//jpql

	@Query("select c from CarEntity c")
	public List<CarEntity>getAllCarsUsingJPQL();
	//@Modifying
//  @Transactional
//  @Query("update car_entity set carname=?1 where carid=?2")
//  public int updateinfo(String newtype,int oldid);
}