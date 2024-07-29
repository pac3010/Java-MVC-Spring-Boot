package com.example.demo.model;

import java.time.LocalDateTime;

public class Course {
    private Integer id;
    private String name;
    private LocalDateTime begin;
    private LocalDateTime end;
    
    public Course(int id, String name, LocalDateTime begin, LocalDateTime end) {
        this.id = id;
        this.name = name;
        this.begin = begin;
        this.end = end;
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

    
}
