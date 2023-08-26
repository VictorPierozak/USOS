package com.example.usos.Model.CourseModel;

public class ConvertToCourse implements ConvertFromCSV{
    @Override
    public Object convertFromCSV(String[] row) {
        return new Course(row[0], row[1], Boolean.parseBoolean(row[3]), row[2], Integer.parseInt(row[4]),
                Integer.parseInt(row[5]), Integer.parseInt(row[6]));
    }
}
