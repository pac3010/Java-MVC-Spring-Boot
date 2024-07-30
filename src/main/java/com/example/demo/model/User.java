package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_m_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "username")
    private String uname;

    @Column
    private String pass;

    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @OneToMany(mappedBy = "user")
    private List<CourseUserRole> courseUserRoles;

    @OneToMany(mappedBy = "user")
    private List<AssessmentUser> assessmentUsers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<CourseUserRole> getCourseUserRoles() {
        return courseUserRoles;
    }

    public void setCourseUserRoles(List<CourseUserRole> courseUserRoles) {
        this.courseUserRoles = courseUserRoles;
    }

    public List<AssessmentUser> getAssessmentUsers() {
        return assessmentUsers;
    }

    public void setAssessmentUsers(List<AssessmentUser> assessmentUsers) {
        this.assessmentUsers = assessmentUsers;
    }

    

    
}
