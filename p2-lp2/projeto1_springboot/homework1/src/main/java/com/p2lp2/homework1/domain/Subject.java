package com.p2lp2.homework1.domain;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String code;
	
	private int workload;
	
	private String name;
	
	@OneToMany(mappedBy="subject", cascade=CascadeType.ALL)
	private Set<SubjectStudent> subjectStudents;
	
	@ManyToOne(optional = false)
	private Cource cource;
	
	public Subject() {}

	public Subject(String code, int workload, String name, Cource cource, SubjectStudent subjectStudents) {
		this.code = code;
		this.workload = workload;
		this.name = name;
		this.cource = cource;
		this.subjectStudents = Stream.of(subjectStudents).collect(Collectors.toSet());
		this.subjectStudents.forEach(x -> x.setSubject(this));
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cource getCource() {
		return cource;
	}

	public void setCource(Cource cource) {
		this.cource = cource;
	}
	
}
