package com.example.usos.Model.CourseModel;

import java.io.Serializable;
import java.util.ArrayList;

public class Course  implements Serializable, isSame {


    protected String courseName;

    protected String courseID;

    protected Boolean obligatory;

    protected String coordinator;

    protected Integer ECTS;

    protected Integer lectureHours;

    protected Integer classesHours;


    public Course()
    {

    }

    public Course(String courseID, String coursename, Boolean obligatory, String coordinator, Integer ects,
                  Integer lectureHours, Integer classesHours)
    {
        this.courseID = new String(courseID);
        this.courseName = new String(coursename);
        this.obligatory = obligatory;
        this.coordinator = coordinator;
        this.ECTS = ects;
        this.lectureHours = lectureHours;
        this.classesHours = classesHours;
    }
    public Course(String className, Boolean obligatory)
    {
        this.courseName = new String(className);
        this.obligatory = obligatory;
        this.coordinator = new String();
        this.ECTS = 0;
        this.lectureHours = 0;
        this.classesHours = 0;
    }

    Course(Course c0)
    {
        courseName = new String(c0.courseName);
        coordinator = new String(c0.coordinator);
        obligatory = c0.obligatory;
        ECTS = c0.ECTS;
        lectureHours = c0.lectureHours;
        classesHours = c0.classesHours;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public  String getCourseName()
    {
        return courseName;
    }

    public  Boolean getObligatory()
    {
        return obligatory;
    }
    public  String getCoordinator(){return coordinator;}
    public  Integer getECTS() {return ECTS;}
    public  Integer getLectureHours() {return lectureHours;}
    public  Integer getClassesHours(){return classesHours;}

    public void setCourseName(String newName)
    {
        courseName = newName;
    }
    public void setObligatory(Boolean ob)
    {
        obligatory = ob;
    }
    public void setCoordinator(String coordinator){ this.coordinator= coordinator;}
    public void setECTS(Integer ects){ ECTS = ects;}
    public void setLectureHours(Integer lh){ lectureHours = lh; }
    public void setClassesHours(Integer ch){ classesHours = ch; }

    public ArrayList<CourseProperty> getProperties()
    {
        ArrayList<CourseProperty> properties = new ArrayList<>();
        properties.add(new CourseProperty("Course name", courseName));
        properties.add(new CourseProperty("Coordinator", coordinator));
        properties.add(new CourseProperty("ECTS", Integer.toString(ECTS)));
        properties.add(new CourseProperty("Obligatory", Boolean.toString(obligatory)));
        properties.add(new CourseProperty("Lecture hours", Integer.toString(lectureHours)));
        properties.add(new CourseProperty("Classes hours", Integer.toString(classesHours)));
        return properties;
    }

    @Override
    public boolean isSame(String courseID)
    {
        return (this.courseID.compareTo(courseID)==0);
    }
}
