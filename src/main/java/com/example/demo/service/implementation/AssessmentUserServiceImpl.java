package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AssessmentUser;
import com.example.demo.repository.AssessmentUserRepository;
import com.example.demo.service.AssessmentUserService;

@Service
public class AssessmentUserServiceImpl implements AssessmentUserService{
    @Autowired
    private AssessmentUserRepository assessmentUserRepository;

    @Override
    public List<AssessmentUser> get() {
        return assessmentUserRepository.findAll();
    }

    @Override
    public AssessmentUser get(Integer id) {
        return assessmentUserRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean save(AssessmentUser entity) {
        assessmentUserRepository.save(entity);
        return assessmentUserRepository.findById(entity.getId()).isPresent();
    }

    @Override
    public Boolean delete(Integer id) {
        assessmentUserRepository.deleteById(id);
        return assessmentUserRepository.findById(id).isEmpty();
        
    }
}
