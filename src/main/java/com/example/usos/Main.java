package com.example.usos;

import com.example.usos.DBCommunication.DBAcess;
import com.example.usos.Model.StudentModel.Student;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Student> s = DBAcess.getInstance().getAllStudents();
    }
}
