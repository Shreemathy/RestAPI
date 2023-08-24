package com.exer.Day_4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exer.Day_4.day4.Day4;

import com.exer.Day_4.service.Student;

@RestController
public class Controller {
	
@Autowired
Student ser;

@PostMapping("addDetail")
public Day4 add(@RequestBody Day4 EE)
{
	return ser.saveDetails(EE);
}


@PutMapping("updateDetails")
public Day4 update(@RequestBody Day4 E)
{
	return ser.changeDetails(E);
}
@PutMapping("updateDetailsById/{id}")

	public ResponseEntity<String> updateById(@PathVariable int id,@RequestBody Day4 E)
	{
		ser.updateDetailsById(id,E);
		return ResponseEntity.ok("Updated Successfully");
	}
//@DeleteMapping("deletedetails")
//public String delete(@RequestBody Day4 E)
//{
//	ser.deleteDetails(E);
//	return "Deleted Sucessfully";
//}
@DeleteMapping("deletedetailsById/{id}")
public String deleteDetailsById(@PathVariable int id)
{
	ser.deleteDetails(id);
	return "Deleted by id sucessfully";
	
}
}
