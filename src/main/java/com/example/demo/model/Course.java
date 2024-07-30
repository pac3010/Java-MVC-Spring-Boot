package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_m_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private LocalDateTime begin;

    @Column
    private LocalDateTime end;

    @OneToMany(mappedBy = "course")
    private List<Syllabus> syllabuses;

    @OneToMany(mappedBy = "course")
    private List<CourseUserRole> courseUserRoles;

    public Course(Integer id, String name, LocalDateTime begin, LocalDateTime end, List<Syllabus> syllabuses,
            List<CourseUserRole> courseUserRoles) {
        this.id = id;
        this.name = name;
        this.begin = begin;
        this.end = end;
        this.syllabuses = syllabuses;
        this.courseUserRoles = courseUserRoles;
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

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public List<Syllabus> getSyllabuses() {
        return syllabuses;
    }

    public void setSyllabuses(List<Syllabus> syllabuses) {
        this.syllabuses = syllabuses;
    }

    public List<CourseUserRole> getCourseUserRoles() {
        return courseUserRoles;
    }

    public void setCourseUserRoles(List<CourseUserRole> courseUserRoles) {
        this.courseUserRoles = courseUserRoles;
    }

}
