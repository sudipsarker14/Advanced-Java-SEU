package com.example.lab_task_seven.Repository;


import com.example.lab_task_seven.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
