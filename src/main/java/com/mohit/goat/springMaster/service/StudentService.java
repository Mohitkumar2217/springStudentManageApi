package com.mohit.goat.springMaster.service;

import com.mohit.goat.springMaster.dto.AddStudentRequestDto;
import com.mohit.goat.springMaster.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long id);
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
    void deleteStudentById(Long id);
}
