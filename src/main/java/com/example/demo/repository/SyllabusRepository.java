package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Syllabus;

@Repository
public interface SyllabusRepository extends JpaRepository<Syllabus, Integer> {
    
}
