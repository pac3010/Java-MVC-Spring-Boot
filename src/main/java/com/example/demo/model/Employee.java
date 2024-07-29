package com.example.demo.model;

public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Integer deptHeadId;
    private Integer deptId;

    public Employee(Integer id, String name, String email, Integer deptHeadId, Integer deptId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.deptHeadId = deptHeadId;
        this.deptId = deptId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDeptHeadId() {
        return deptHeadId;
    }

    public void setDeptHeadId(Integer deptHeadId) {
        this.deptHeadId = deptHeadId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    
}
