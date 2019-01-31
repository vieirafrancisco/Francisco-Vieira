package com.p2lp2.homework1.domain;

import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String phone;
	
	@ManyToMany
	@JoinTable(name="phone_student",
			joinColumns = @JoinColumn(name="phone_id", referencedColumnName="id"),
			inverseJoinColumns = @JoinColumn(name="student_id", referencedColumnName="id"))
	private Set<Student> students;
	
	public Phone() {}

	public Phone(String phone, Student students) {
		this.phone = phone;
		this.students = Stream.of(students).collect(Collectors.toSet());
		this.students.forEach(x -> x.getPhones().add(this));
	}

	public Integer getId() {
		return this.id;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
