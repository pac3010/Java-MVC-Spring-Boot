package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_m_assessment")
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer courseId;

    @OneToMany(mappedBy = "assessment")
    private List<AssessmentUser> assessmentUsers;


    public Assessment(Integer id, String name, Integer courseId, List<AssessmentUser> assessmentUsers) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
        this.assessmentUsers = assessmentUsers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public List<AssessmentUser> getAssessmentUsers() {
        return assessmentUsers;
    }

    public void setAssessmentUsers(List<AssessmentUser> assessmentUsers) {
        this.assessmentUsers = assessmentUsers;
    }

    
    
    
}
