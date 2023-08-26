package com.example.usos;

import com.example.usos.Model.CourseModel.YourCourse;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.usos.Model.CourseModel.Grade;

import java.util.LinkedList;


public class GradesController implements ChangeListener {

    // COURSE TABLE COMPONENTS //

    @FXML private TableView<YourCourse> courseTable;
    @FXML private TableColumn<YourCourse, String> courseNameColumn;
    @FXML private TableColumn<YourCourse, Boolean> obligatoryColumn;
    @FXML private TableColumn<YourCourse, String> statusColumn;

    // GRADES TABLE COMPONENTS //
    @FXML private TableView<Grade> gradesTable;
    @FXML private TableColumn<Grade, String> descriptionColumn;
    @FXML private TableColumn<Grade, Double> gradeColumn;

    private YourCourse selectedCourse;

    @FXML
    public void initialize()
    {
        initializeClassListTable();
        initializeGradesTable();
    }

    private void initializeClassListTable()
    {
        statusColumn.setCellValueFactory(new PropertyValueFactory("yourStatus"));
        courseNameColumn.setCellValueFactory(new PropertyValueFactory("courseName"));
        obligatoryColumn.setCellValueFactory(new PropertyValueFactory("obligatory"));
        courseTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        courseTable.getSelectionModel().selectedItemProperty().addListener((ChangeListener<? super YourCourse>) this);
        //courseTable.getItems().addAll(DataManagmentModule.getInstance().getYourCourseList());
    }

    private void initializeGradesTable()
    {
        gradesTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        gradeColumn.setCellValueFactory(new PropertyValueFactory("gradeValue"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory("description"));
    }


    @Override
    public void changed(ObservableValue observableValue, Object oldSelected, Object newSelected) {
        if(newSelected != null)
        {
            /*selectedCourse = courseTable.getSelectionModel().getSelectedItem();
            LinkedList<Grade> grades = selectedCourse.getGrades();
            gradesTable.getItems().clear();
            gradesTable.getItems().addAll(grades);*/
        }
    }

    @FXML
    void onSaveGradesClick()
    {
        /*int notWrited = 0;
        if( (notWrited = DataManagmentModule.getInstance().writeGradesToCSV(selectedCourse)) != 0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Something wrong occured while writing to file!\n" +
                    String.valueOf(notWrited) + "records has not been writed!");

        }*/
    }
}
