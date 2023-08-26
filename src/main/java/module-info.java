module com.example.usos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires mysql.connector.java;


    opens com.example.usos to javafx.fxml, org.hibernate.orm.core;
    opens com.example.usos.Model.CourseModel to javafx.base;
    opens com.example.usos.Model.StudentModel to javafx.base, org.hibernate.orm.core;
    exports com.example.usos;
}