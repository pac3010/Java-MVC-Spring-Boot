package com.example.demo.model;

public class AssessmentUser {
    private int assessment_id;
    private int user_id;
    private String name;
    private int score;

    public AssessmentUser(int assessment_id, int user_id, String name, int score) {
        this.assessment_id = assessment_id;
        this.user_id = user_id;
        this.name = name;
        this.score = score;
    }

    public int getAssessment_id() {
        return assessment_id;
    }

    public void setAssessment_id(int assessment_id) {
        this.assessment_id = assessment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    
}
