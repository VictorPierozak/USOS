package com.example.usos.Model.CourseModel;

import java.io.Serializable;
import java.util.Objects;

public class GradeID implements Serializable {
    private String courseID;
    private String studentID;
    private String description;

    public GradeID() {
    }

    public GradeID(String courseID, String studentID, String description) {
        this.courseID = courseID;
        this.studentID = studentID;
        this.description = description;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeID gradeID = (GradeID) o;
        return Objects.equals(courseID, gradeID.courseID) && Objects.equals(studentID, gradeID.studentID) && Objects.equals(description, gradeID.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseID, studentID, description);
    }
}
