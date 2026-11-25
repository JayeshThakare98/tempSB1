package com.collage.mapper;

import org.springframework.stereotype.Component;

import com.collage.entity.Student;
import com.collage.requestDTO.StudentRequestDto;
import com.collage.responseDTO.StudentResponseDto;

@Component
public class StudentMapper {

	    public Student toEntity(StudentRequestDto request) {

	        Student student = new Student();

	        student.setFirstName(request.getFirstName());
	        student.setLastName(request.getLastName());
	        student.setEmail(request.getEmail());
	        student.setPhoneNumber(request.getPhoneNumber());
	        student.setGender(request.getGender());
	        student.setDateOfBirth(request.getDateOfBirth());
	        student.setAddress(request.getAddress());
	        student.setCity(request.getCity());
	        student.setState(request.getState());
	        student.setCountry(request.getCountry());
	        student.setPostalCode(request.getPostalCode());
	        student.setAdmissionDate(request.getAdmissionDate());
	        student.setCourse(request.getCourse());
	        student.setDepartment(request.getDepartment());
	        student.setStatus(request.getStatus());

	        return student;
	    }

	    public StudentResponseDto toResponse(Student student) {

	        StudentResponseDto response = new StudentResponseDto();

	        response.setId(student.getId());
	        response.setFirstName(student.getFirstName());
	        response.setLastName(student.getLastName());
	        response.setEmail(student.getEmail());
	        response.setPhoneNumber(student.getPhoneNumber());
	        response.setGender(student.getGender());
	        response.setDateOfBirth(student.getDateOfBirth());
	        response.setAddress(student.getAddress());
	        response.setCity(student.getCity());
	        response.setState(student.getState());
	        response.setCountry(student.getCountry());
	        response.setPostalCode(student.getPostalCode());
	        response.setAdmissionDate(student.getAdmissionDate());
	        response.setCourse(student.getCourse());
	        response.setDepartment(student.getDepartment());
	        response.setStatus(student.getStatus());
	        response.setCreatedAt(student.getCreatedAt());
	        response.setUpdatedAt(student.getUpdatedAt());

	        return response;
	    }
	}
