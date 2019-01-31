package com.p2lp2.homework1.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.p2lp2.homework1.domain.Cource;
import com.p2lp2.homework1.domain.Student;
import com.p2lp2.homework1.repository.CourceRepository;
import com.p2lp2.homework1.repository.StudentRepository;

import java.util.Vector;

@RestController
public class StudentResource {

	@Autowired
	private StudentRepository repository;
	
	/*
	 *  GET methods
	 */
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> getOneStudent(@PathVariable("id") Integer id) {
		Optional<Student> student = repository.findById(id);
		if(repository.existsById(id)) {
			return new ResponseEntity<>(student, HttpStatus.OK);
		}
		return new ResponseEntity<>("Student id doesn't exist", HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/students/institution/{id}")
	public List<Student> getAllStudentsByInstitutionId(@PathVariable("id") Integer id){
		
		List<Student> students = new Vector<>();
		
		for(Student student: repository.findAll()) {
			if(student.getInstitution().getId() == id) {
				students.add(student);
			}
		}
		
		return students;
	}
	
	/*
	 * DELETE methods
	 */
	
	@DeleteMapping("/students/del") //localhost:8080/students/del?id='id'
	public ResponseEntity<?> deleteStudent(@RequestParam(value = "id") Integer id){
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return new ResponseEntity<>("Student deleted", HttpStatus.OK);
		}
		return new ResponseEntity<>("Student id doesn't exist", HttpStatus.NOT_ACCEPTABLE);
	}
	
	/*
	 * PUT methods
	 */
	
	@PutMapping("/students/{id}/cource/{course_id}/") 
	public ResponseEntity<?> changeStudentCource(@PathVariable Integer id, @PathVariable Integer courceId){
		return new ResponseEntity<>(repository.findById(id), HttpStatus.OK); 
	}
}
