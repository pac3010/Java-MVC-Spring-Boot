package com.example.demo.model;

public class CourseUserRole {
    private Integer userId;
    private Integer courseId;
    private Integer roleId;

    public CourseUserRole(Integer userId, Integer courseId, Integer roleId) {
        this.userId = userId;
        this.courseId = courseId;
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
