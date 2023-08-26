package com.example.usos.Model.CourseModel;

import java.util.Objects;

public class YourCourseID {
    private String courseID;
    private String groupID;

    public YourCourseID() {
    }

    public YourCourseID(String courseID, String groupID) {
        this.courseID = courseID;
        this.groupID = groupID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YourCourseID that = (YourCourseID) o;
        return Objects.equals(courseID, that.courseID) && Objects.equals(groupID, that.groupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseID, groupID);
    }
}
