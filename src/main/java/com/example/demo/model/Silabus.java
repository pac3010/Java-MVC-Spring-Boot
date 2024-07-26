package com.example.demo.model;

public class Silabus {
    private int id;
    private String name;
    private int course_id;

    public Silabus(int id, String name, int course_id) {
        this.id = id;
        this.name = name;
        this.course_id = course_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    
}
