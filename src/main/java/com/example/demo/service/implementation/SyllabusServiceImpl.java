package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Syllabus;
import com.example.demo.repository.SyllabusRepository;
import com.example.demo.service.SyllabusService;

@Service
public class SyllabusServiceImpl implements SyllabusService{
    @Autowired
    private SyllabusRepository syllabusRepository;

    @Override
    public List<Syllabus> get() {
        return syllabusRepository.findAll();
    }

    @Override
    public Syllabus get(Integer id) {
        return syllabusRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Syllabus entity) {
        syllabusRepository.save(entity);
        return syllabusRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        syllabusRepository.deleteById(id);
        return syllabusRepository.findById(id).isEmpty();
        
    }
    
}
