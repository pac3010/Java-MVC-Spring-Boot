package com.example.demo.model;

public class AssessmentUser {
    private Integer assessmentId;
    private Integer userId;
    private String name;
    private Integer score;

    public AssessmentUser(Integer assessmentId, Integer userId, String name, Integer score) {
        this.assessmentId = assessmentId;
        this.userId = userId;
        this.name = name;
        this.score = score;
    }

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    
}
