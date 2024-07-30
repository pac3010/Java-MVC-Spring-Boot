package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Assessment;
import com.example.demo.repository.AssessmentRepository;

import com.example.demo.service.AssessmentService;

@Service
public class AssessmentServiceImpl implements AssessmentService{
    @Autowired
    private AssessmentRepository assessmentRepository;

    @Override
    public List<Assessment> get() {
        return assessmentRepository.findAll();
    }

    @Override
    public Assessment get(Integer id) {
        return assessmentRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(Assessment entity) {
        assessmentRepository.save(entity);
        return assessmentRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        assessmentRepository.deleteById(id);
        return assessmentRepository.findById(id).isEmpty();
        
    }
    
}
