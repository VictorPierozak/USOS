package com.example.usos.Model.CourseModel;


import java.io.Serializable;

public class YourCourse implements Serializable {
    private String courseID;
    private String groupID;
    private int yourStatus;

    // CONSTRUCTORS //


    public YourCourse() {
    }

    public YourCourse(String courseID, String groupID)
    {
        this.courseID = courseID;
        this.groupID = groupID;
    }

    public YourCourse(String courseID, String groupID, int yourStatus) {
        this.courseID = courseID;
        this.groupID = groupID;
        this.yourStatus = yourStatus;
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

    public int getYourStatus() {
        return yourStatus;
    }

    public void setYourStatus(int yourStatus) {
        this.yourStatus = yourStatus;
    }
}
