package com.mohit.goat.springMaster.service;

import com.mohit.goat.springMaster.dto.AddStudentRequestDto;
import com.mohit.goat.springMaster.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long id);
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
    void deleteStudentById(Long id);
    StudentDto updateFullStudent(Long id, AddStudentRequestDto addStudentRequestDto);
    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
