package com.p2lp2.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p2lp2.homework1.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
