package com.example.usos;

import com.example.usos.Model.CourseModel.*;
import com.example.usos.Model.StudentModel.Student;
import org.hibernate.ObjectDeletedException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import java.util.List;

public class DBConnector {

    private final String NULL_GROUP = "0000";
    private final int NOT_ASSIGNED = 0;

    SessionFactory sessionFactory;

    public DBConnector()
    {
        buildSessionFactory();
    }

    private void buildSessionFactory() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    // GET ALL //
    private <T> List<T> getAll(String className)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<T> allRows = session.createQuery("from " + className).list();
        session.getTransaction().commit();
        session.close();
        return  allRows;
    }

    public List<Student> getAllStudents()
    {
        List<Student> allRows = getAll("Student");
        return  allRows;
    }

    public List<Course> getAllCourses()
    {
        List<Course> allRows = getAll("Course");
        return allRows;
    }

    public List<Grade> getAllGrades()
    {
        List<Grade> allRows = getAll("Grade");
        return allRows;
    }

    public List<Group> getAllGroups()
    {
        List<Group> allRows = getAll("Group");
        return allRows;
    }

    public List<YourCourse> getAllYourCourses()
    {
        List<YourCourse> allRows = getAll("YourCourse");
        return allRows;
    }


    // GET SPECIFIC //

    public Student getStudent(String id)
    {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Student where ID=:id").setParameter("id", id);
        Student result = (Student) query.uniqueResult();
        session.close();
        return result ;
    }

    public Course getCourse(String ID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Course result = (Course) session.createQuery("from Course where courseID =:ID").setParameter("ID", ID).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public Group getGroup(String ID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Group result = (Group) session.createQuery("from Group where groupID =:ID").setParameter("ID", ID).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public Grade getGrade(String CID, String SID, String D)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Grade result = (Grade) session.createQuery("from Grade where courseID=:CID AND " +
                "studentID=:SID AND description=:D").setParameter("CID", CID).setParameter("SID",SID).setParameter(
                        "D", D).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public YourCourse getYourCourse(String CourseID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        YourCourse result = (YourCourse) session.createQuery("from YourCourse where courseID=:CID").setParameter(
                "CID", CourseID).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    // GET FILTERED //

    public List<Grade> getCourseGrades(String courseID, String studentID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Grade> result = session.createQuery("from Grade where courseID=:CID AND " +
                "studentID=:SID").setParameter("CID", courseID).setParameter("SID",studentID).list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public List<Student> getStudentsFromGroup(String groupID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Student> result = session.createSQLQuery("SELECT * FROM "+groupID+"sl").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    // CHANGE //

    public void changeGroup(String studentID, String prevGroup, String newGroup)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String query1 = "DELETE FROM " + prevGroup +"sl WHERE STUDENT_ID =\'" +studentID+"\'";
        String query2 = "INSERT INTO " + newGroup +"sl VALUES (\'" + studentID +"\')";

        session.createSQLQuery(query1).executeUpdate();
        session.createSQLQuery(query2).executeUpdate();

        session.getTransaction().commit();
        session.close();
    }

    // ASSIGN TO COURSE / LEAVE COURSE //

    public void leaveCourse(String studentID, String courseID, String groupID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String query1 = "DELETE FROM " + groupID +"sl WHERE STUDENT_ID =\'" +studentID+"\'";
        String query2 = "DELETE FROM grades WHERE COURSE_ID=" + "\'" + courseID+ "\'" + " AND STUDENT_ID = "
                + "\'" + studentID + "\'";

        session.createSQLQuery(query1).executeUpdate();
        session.createSQLQuery(query2).executeUpdate();

        YourCourse toUpdate = new YourCourse(courseID, studentID, 0);

        YourCourse toDelete = new YourCourse();
        toDelete.setCourseID(courseID);
        toDelete.setGroupID(groupID);

        session.delete(toDelete);

        toUpdate.setYourStatus(NOT_ASSIGNED);
        toUpdate.setGroupID(NULL_GROUP);

        session.save(toUpdate);

        session.getTransaction().commit();
        session.close();
    }

    public void enrollInCourse(String studentID, String courseID)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Group g0 = (Group) session.createQuery("from Group where courseID =:CID").setParameter("CID", courseID).list().get(0);

        YourCourse toDelete = new YourCourse(courseID,"0000");
        session.delete(toDelete);

        YourCourse yc0 = new YourCourse(courseID, g0.getGroupID(), 1);
        session.save(yc0);

        String query = "INSERT INTO " + g0.getGroupID() + "sl VALUES (\'" + studentID + "\')";
        session.createSQLQuery(query).executeUpdate();


        session.getTransaction().commit();
        session.close();
    }

    public void closeConnection()
    {
        this.sessionFactory.close();
    }
}
