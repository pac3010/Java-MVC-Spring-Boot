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
@Table(name = "tbl_m_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "role")
    private List<CourseUserRole> courseUserRoles;

    public Role(Integer id, String name, List<CourseUserRole> courseUserRoles) {
        this.id = id;
        this.name = name;
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

    public List<CourseUserRole> getCourseUserRoles() {
        return courseUserRoles;
    }

    public void setCourseUserRoles(List<CourseUserRole> courseUserRoles) {
        this.courseUserRoles = courseUserRoles;
    }

    
  
}
