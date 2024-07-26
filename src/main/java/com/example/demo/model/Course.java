package com.example.demo.model;

import java.sql.Date;

public class Course {
    private int id;
    private String name;
    private Date begin;
    private Date end;
    
    public Course(int id, String name, Date begin, Date end) {
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
    public Date getBegin() {
        return begin;
    }
    public void setBegin(Date begin) {
        this.begin = begin;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }

    
}
