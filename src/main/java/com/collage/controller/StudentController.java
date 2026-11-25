package com.collage.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collage.requestDTO.StudentRequestDto;
import com.collage.responseDTO.StudentResponseDto;
import com.collage.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("sms/api")
public class StudentController {
	private StudentService studentService;

	@PostMapping("create")
	public ResponseEntity<StudentResponseDto> createStudent(@Valid @RequestBody StudentRequestDto studentRequestDto) {
		// busness logic madhun data fetch krene
		StudentResponseDto response = studentService.createStudents(studentRequestDto);
//		return to respnce Entity 
		ResponseEntity<StudentResponseDto> re = ResponseEntity.status(HttpStatus.CREATED).body(response);
		return re;
	}

	@GetMapping("getAll")
	ResponseEntity <List<StudentResponseDto>> getAllStudents(){
		// find first into the service 
		ResponseEntity<List<StudentResponseDto>> getAllRE = ResponseEntity.ok(studentService.getAllStudents());
		return getAllRE ;
	}
}
