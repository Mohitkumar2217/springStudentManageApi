package com.mohit.goat.springMaster.controller;

import com.mohit.goat.springMaster.dto.AddStudentRequestDto;
import com.mohit.goat.springMaster.dto.StudentDto;
import com.mohit.goat.springMaster.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }

//    @GetMapping("/{id}/{name}")
//    public StudentDto getStudentById(@PathVariable("id") Long studentId, @PathVariable String name) {
//        return studentService.getStudentById(studentId);
    // path params
//    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        try {
            StudentDto student = studentService.getStudentById(id);
            return ResponseEntity.ok(student);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<String> getStudentById(@RequestParam String name) {
        // request params
        return ResponseEntity.ok("Searching Name is: " + name);
    }

    @PostMapping("")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id) {
        try {
            studentService.deleteStudentById(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
