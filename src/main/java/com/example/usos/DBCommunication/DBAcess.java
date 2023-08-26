package com.example.usos.DBCommunication;

import com.example.usos.Model.CourseModel.Course;
import com.example.usos.Model.CourseModel.Grade;
import com.example.usos.Model.CourseModel.Group;
import com.example.usos.Model.CourseModel.YourCourse;
import com.example.usos.Model.StudentModel.Student;
import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;


public class DBAcess implements DataAccessObject{

    static private DBAcess instance = null;
    private SessionFactory sessionFactory;

    private DBAcess()
    {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    static public DBAcess getInstance()
    {
        if(instance == null)
            instance = new DBAcess();
        return instance;
    }

    // // // //
    @Override
    public ArrayList<Student> getAllStudents() {
    Session session = sessionFactory.openSession();
    session.beginTransaction();

    session.save(new Student());
    List result = session.createQuery("from Student").list();

    session.getTransaction().commit();
    session.close();
    return null;
    }

    @Override
    public ArrayList<Course> getAllCourses() {
        return null;
    }

    @Override
    public ArrayList<Group> getAllGroups() {
        return null;
    }

    @Override
    public ArrayList<YourCourse> getAllYourCourses() {
        return null;
    }

    @Override
    public ArrayList<Grade> getAllGrades() {
        return null;
    }

    @Override
    public Student getStudent(String ID) {
        return null;
    }

    @Override
    public Course getCourse(String courseID) {
        return null;
    }

    @Override
    public Group getGroup(String groupID) {
        return null;
    }

    @Override
    public YourCourse getYourCourse(String courseID) {
        return null;
    }

    @Override
    public ArrayList<Grade> getCourseGrades(String courseId, String studentID) {
        return null;
    }

    @Override
    public Student updateStudent(String ID, String property, Object newValue) {
        return null;
    }

    @Override
    public Course updateCourse(String courseID, String property, Object newValue) {
        return null;
    }

    @Override
    public Group updateGroup(String groupID, String property, Object newValue) {
        return null;
    }

    @Override
    public YourCourse updateYourCourse(String courseID, String property, Object newValue) {
        return null;
    }

    @Override
    public Student addStudent(Student newStudent) {
        return null;
    }

    @Override
    public Course addCourse( Course newCourse) {
        return null;
    }

    @Override
    public Group addGroup(Group newGroup) {
        return null;
    }

    @Override
    public YourCourse addYourCourse(YourCourse newYourCourse) {
        return null;
    }

    @Override
    public int addAllStudent(List<Student> newStudents) {
        return 0;
    }

    @Override
    public int addAllCourse(List<Course> newCourses) {
        return 0;
    }

    @Override
    public int addAllGroup(List<Group> newGroups) {
        return 0;
    }

    @Override
    public int addAllYourCourse(List<YourCourse> newYourCourses) {
        return 0;
    }

    @Override
    public boolean deleteStudent(String ID) {
        return false;
    }

    @Override
    public boolean deleteCourse(String courseID) {
        return false;
    }

    @Override
    public boolean deleteGroup(String groupID) {
        return false;
    }

    @Override
    public boolean deleteYourCourse(String courseID) {
        return false;
    }
}
