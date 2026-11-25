package com.collage.serivceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collage.entity.Student;
import com.collage.mapper.StudentMapper;
import com.collage.repo.StudentRepository;
import com.collage.requestDTO.StudentRequestDto;
import com.collage.responseDTO.StudentResponseDto;
import com.collage.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository ; 
	private StudentMapper studentMapper ; 

	@Override
	public StudentResponseDto createStudents(StudentRequestDto requestDto) {
// adhi requs -> DB paryant jail (Mapper chya madatine)
//aleli info we have to save -> DB (repo leyer / JPA )
// je kahi save kelai te respnce chya rupat yave (Mapper / fromentity to response)
		Student student = studentMapper.toEntity(requestDto); // yes 
		Student stuSave = studentRepository.save(student) ; // yes
		StudentResponseDto sturesponse = studentMapper.toResponse(stuSave);
		return sturesponse;
	}

	@Override
	public List<StudentResponseDto> getAllStudents() {
// DB madhil sagle fetch karun anane
		List<Student> allStudent = studentRepository.findAll(); // 1st done 
//		List chya rupat darshavine  
		List<StudentResponseDto> responseList = new ArrayList<>() ; 
//		show karne with help of mapper
		for (Student st : allStudent) {
			responseList.add(studentMapper.toResponse(st));	
		}
		return responseList;
	}

	
}
