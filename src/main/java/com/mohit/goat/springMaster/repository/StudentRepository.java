package com.mohit.goat.springMaster.repository;

import com.mohit.goat.springMaster.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
