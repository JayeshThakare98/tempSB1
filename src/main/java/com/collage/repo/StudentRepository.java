package com.collage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collage.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	

}
