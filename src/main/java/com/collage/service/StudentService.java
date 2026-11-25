package com.collage.service;

import java.util.List;

import com.collage.requestDTO.StudentRequestDto;
import com.collage.responseDTO.StudentResponseDto;

public interface StudentService {
// create Student 
	StudentResponseDto createStudents(StudentRequestDto requestDto);
// read alll students
	List<StudentResponseDto> getAllStudents();
//	Get All Students
// update Student 
// Delete Student

}
