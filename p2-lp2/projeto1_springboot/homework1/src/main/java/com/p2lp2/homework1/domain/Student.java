package com.p2lp2.homework1.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String registration;
	
	private String cpf;
	
	private String name;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@ManyToOne(optional = false)
	private Institution institution;
	
	@ManyToOne(optional = false)
	private Cource cource;
	
	@ManyToMany(mappedBy="students")
	private Set<Phone> phones = new HashSet<>();
	
	@OneToMany(mappedBy="student", cascade=CascadeType.ALL)
	private Set<SubjectStudent> subjectStudents = new HashSet<>();
	
	public Student() {}

	public Student(String registration, String cpf, String name, Date birthday, Institution institution, 
			Cource cource) {
		this.registration = registration;
		this.cpf = cpf;
		this.name = name;
		this.birthday = birthday;
		this.institution = institution;
		this.cource = cource;
	}
	
	public int getAge() {
		// Calculate the student age
		return 0;
	}

	public Integer getId() {
		return this.id;
	}
	
	public Institution getInstitution() {
		return institution;
	}

	public Cource getCource() {
		return cource;
	}

	public void setCource(Cource cource) {
		this.cource = cource;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Set<Phone> getPhones(){
		return this.phones;
	}
	
}
