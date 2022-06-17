package com.eaiesb.training.students;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eaiesb.training.students.studentsRepository;



@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class studentsController {
	@Autowired
	private studentsRepository stuRepo;
	
	@GetMapping("/students")
	public List <students> getAllstudents()
	{
		return stuRepo.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Optional<students> getstudentsbyid(@PathVariable String id)
	{
		return stuRepo.findById(id);
	}
	
	@PostMapping("/students")
	public students saveStudent( @RequestBody students student)
	
	{
		
		return stuRepo.save(student);
		
	}
	
	@PutMapping("/students/{id}")
	public students updateStudent( @RequestBody students student, @PathVariable String id)
	
	{
		students currentStudent;
		currentStudent = stuRepo.findById(id).get();
		currentStudent.setFirstName(student.getFirstName());
		currentStudent.setLastName(student.getLastName());
		currentStudent.setStudentNumber(student.getStudentNumber());
		return stuRepo.save(currentStudent);
		
	}
	@DeleteMapping("/students/{id}")
	public void deletestudentsbyid(@PathVariable String id)
	{
		stuRepo.deleteById(id);
	}
}
