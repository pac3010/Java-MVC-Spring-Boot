package com.example.demo.model;

public class User {
    private Integer id;
    private String uname;
    private String pass;
    private Integer employeeId;

    public User(Integer id, String uname, String pass, Integer employeeId) {
        this.id = id;
        this.uname = uname;
        this.pass = pass;
        this.employeeId = employeeId;
    }

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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
