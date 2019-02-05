package com.p2lp2.homework1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Institution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String code;
	
	private String name;
	
	private String city;
	
	public Institution() {}
	
	public Institution(String code, String name, String city) {
		this.code = code;
		this.name = name;
		this.city = city;
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String cod) {
		this.code = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
