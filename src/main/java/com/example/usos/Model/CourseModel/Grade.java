package com.example.usos.Model.CourseModel;

import java.io.Serializable;

public class Grade implements Serializable {

    private String courseID;
    private String studentID;
    private String description;

    private Double gradeValue;

    // CONSTRUCTOR //

    public Grade() {

    }

    public Grade(String courseID, String studentID, String description, Double gradeValue) {
        this.courseID = courseID;
        this.studentID = studentID;
        this.description = description;
        this.gradeValue = gradeValue;
    }

    // GETTERS //

    public String getDescription()
    {
        return description;
    }

    public Double getGradeValue()
    {
        return gradeValue;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getStudentID() {
        return studentID;
    }


    // SETTERS //


    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGradeValue(Double gradeValue) {
        this.gradeValue = gradeValue;
    }
}
