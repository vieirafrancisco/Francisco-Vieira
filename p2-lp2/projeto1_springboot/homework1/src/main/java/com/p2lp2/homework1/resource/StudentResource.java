package com.p2lp2.homework1.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.p2lp2.homework1.domain.Student;
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
	
	@DeleteMapping("/students/{id}") 
	public ResponseEntity<?> deleteStudent(@PathVariable Integer id){
		
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return new ResponseEntity<>("Student deleted", HttpStatus.OK);
		}
		
		return new ResponseEntity<>("Student id doesn't exist", HttpStatus.NOT_ACCEPTABLE);
	}
	
	/*
	 * POST methods
	 */
	
	@PostMapping("/students")
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		student = repository.save(student);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().path("/{id}").buildAndExpand(student.getId()).toUri();
		
		return ResponseEntity.created(uri).
				body(String.format("student %s have been created", student.getName()));
	}
	
	/*
	 * PUT methods
	 */
	
	@PutMapping("/students/{id}")
	public ResponseEntity<?> updateStudent(@RequestBody Student student, @PathVariable Integer id){
		Optional<Student> studentOp = repository.findById(id);
		
		if(!studentOp.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		student.setId(id);
		repository.save(student);
		
		return ResponseEntity.noContent().build();
	}
	
	
}
