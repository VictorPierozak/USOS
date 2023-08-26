package com.example.usos.Model.CourseModel;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.courseID.compareTo(o2.courseID);
    }
}
