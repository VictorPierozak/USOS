package com.example.usos.Model.StudentModel;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    private static final int ID = 0;
    private static final int NAME = 1;
    private static final int SURNAME = 2;
    private static final int FIELD_OF_STUDY = 3;
    private static final int FACULTY = 4;
    private static final int BIRTH_DATE = 5;

    private int mode;

    public StudentComparator(int mode)
    {
        this.mode = mode;
    }

    static public int findInArrayList(ArrayList<Student> list, String ID)
    {
        int index = -1;
        for(int i = 0; i < list.size(); i++)
        {
            if(ID.compareTo(list.get(i).getID()) == 0)
            {
                index = i;
                break;
            }
        }
        return index;
    }


    @Override
    public int compare(Student o1, Student o2) {
        int result = 0;
        switch(mode)
        {
            case ID:
            result = o1.getID().compareTo(o2.getID());
                break;

            case NAME:
            result = o1.getName().compareTo(o2.getName());
                break;

            case SURNAME:
            result = o1.getSurname().compareTo(o2.getSurname());
                break;

            case FIELD_OF_STUDY:
            result = o1.getFiedlOfStudy().compareTo(o2.getFiedlOfStudy());
                break;

            case FACULTY:
            result = o1.getFaculty().compareTo(o2.getFaculty());
                break;

            case BIRTH_DATE:
            result = o1.getBirthDate().compareTo(o2.getBirthDate());
                break;
            default:
                break;
        }

        return result;
    }
}
