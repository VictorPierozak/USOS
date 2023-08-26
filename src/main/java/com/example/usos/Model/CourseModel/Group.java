package com.example.usos.Model.CourseModel;

import java.io.Serializable;

public class Group implements Serializable{

    protected String groupName;
    protected String groupID;
    protected String courseID;
    protected String groupCoordinator;
    protected Integer capacity;
    protected Integer size;
    protected String studentsListTable;

    // CONSTRUCTORS //

    public Group()
    {

    }
    public Group(String groupID, String courseID, String groupName, String groupCoordinator, Integer capacity,
                 String studentsListTable)
    {
        this.groupID = new String(groupID);
        this.courseID = new String(courseID);
        this.groupName = new String(groupName);
        this.groupCoordinator = new String(groupCoordinator);
        this.capacity = capacity.intValue();
        this.studentsListTable = studentsListTable;
        this.size = 0;
    }

    // GETTERS //

    public String getGroupName() {
        return groupName;
    }

    public String getGroupCoordinator() {
        return groupCoordinator;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getSize() {
        return size;
    }
    public String getGroupID() {
        return groupID;
    }

    public String getStudentsListTable() {
        return studentsListTable;
    }

    public String getCourseID() {
        return courseID;
    }


    // SETTERS //
    public void setStudentsListTable(String studentsListTable) {
        this.studentsListTable = studentsListTable;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setGroupCoordinator(String groupCoordinator) {
        this.groupCoordinator = groupCoordinator;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

}
