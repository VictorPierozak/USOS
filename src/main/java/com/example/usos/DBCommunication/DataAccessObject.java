package com.example.usos.DBCommunication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.usos.Model.CourseModel.Course;
import com.example.usos.Model.CourseModel.Grade;
import com.example.usos.Model.CourseModel.Group;
import com.example.usos.Model.CourseModel.YourCourse;
import com.example.usos.Model.StudentModel.Student;

public interface DataAccessObject {

    // GET ALL //
    ArrayList<Student> getAllStudents();
    ArrayList<Course> getAllCourses();
    ArrayList<Group> getAllGroups();
    ArrayList<YourCourse> getAllYourCourses();
    ArrayList<Grade> getAllGrades();

    // GET //

    Student getStudent(String ID);
    Course getCourse(String courseID);
    Group getGroup(String groupID);
    YourCourse getYourCourse(String courseID);
    ArrayList<Grade> getCourseGrades(String courseId, String studentID);

    // UPDATE //

    Student updateStudent(String ID, String property, Object newValue);
    Course updateCourse(String courseID,String property, Object newValue);
    Group updateGroup(String groupID, String property, Object newValue);
    YourCourse updateYourCourse(String courseID, String property, Object newValue);

    // ADD //

    Student addStudent(Student newStudent);
    Course addCourse(Course newCourse);
    Group addGroup(Group newGroup);
    YourCourse addYourCourse(YourCourse newYourCourse);

    // ADD ALL //

    int addAllStudent(List<Student> newStudents);
    int addAllCourse(List<Course> newCourses);
    int addAllGroup(List<Group> newGroups);
    int addAllYourCourse(List<YourCourse> newYourCourses);

    // DELETE //
    boolean deleteStudent(String ID);
    boolean deleteCourse(String courseID);
    boolean deleteGroup(String groupID);
    boolean deleteYourCourse(String courseID);

}
