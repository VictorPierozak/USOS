package com.example.usos.Model.StudentModel;

import com.example.usos.Model.CourseModel.isSame;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable, isSame {

    private String ID;
    private String name;
    private String surname;
    private String fiedlOfStudy;
    private String faculty;
    private Date birthDate;

    public Student()
    {

    }

    public Student(String ID, String name, String surname, Date birthDate, String fiedlOfStudy, String faculty)
    {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.fiedlOfStudy = fiedlOfStudy;
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFiedlOfStudy() {
        return fiedlOfStudy;
    }

    public String getID() {
        return ID;
    }


    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getSurname() {
        return surname;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFiedlOfStudy(String fiedlOfStudy) {
        this.fiedlOfStudy = fiedlOfStudy;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean isSame(String id) {
        return (ID.compareTo(id)==0);
    }
}
