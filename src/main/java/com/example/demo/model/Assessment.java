package com.example.demo.model;

public class Assessment {
    private Integer id;
    private String name;
    private Integer courseId;

    public Assessment(Integer id, String name, Integer courseId) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
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
    
    
}
