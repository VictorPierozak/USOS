package com.example.usos;

import com.example.usos.Model.Another.Messenger;
import com.example.usos.Model.CourseModel.*;
import com.example.usos.Model.StudentModel.Student;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
/*
public class GroupsController implements ChangeListener {


    @FXML private Button enrollInButton;
    @FXML private Button leaveButton;

    private Tooltip enrollInToolTip;
    private Tooltip leaveToolTip;

    private final String ENROLL_IN_TOOLTIP = "Enroll in a course";

    private final String LEAVE_TOOLTIP = "Leave course";

    @FXML
    void initialize()
    {
        enrollInToolTip = new Tooltip(ENROLL_IN_TOOLTIP);
        leaveToolTip = new Tooltip(LEAVE_TOOLTIP);
        enrollInButton.setTooltip(enrollInToolTip);
        leaveButton.setTooltip(leaveToolTip);

        initalizeCoursesTable();
        initializeDescripitonTable();
        initializeGroupTable();
    }

    // TABLE COURSES //

    @FXML private TableView<YourCourse> courseTable;

    @FXML private TableColumn<YourCourse, String> courseNameColumn;
    @FXML private TableColumn<YourCourse, String> coordinatorColumn;
    @FXML private TableColumn<YourCourse, Boolean> obligatoryColumn;
    @FXML private TableColumn<YourCourse, String> yourStatusColumn;

    @FXML
    void initalizeCoursesTable()
    {
        courseNameColumn.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        coordinatorColumn.setCellValueFactory(new PropertyValueFactory<>("coordinator"));
        obligatoryColumn.setCellValueFactory(new PropertyValueFactory<>("obligatory"));
        yourStatusColumn.setCellValueFactory(new PropertyValueFactory<>("yourStatus"));

        courseTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        courseTable.getSelectionModel().selectedItemProperty().addListener(this);


        courseTable.getItems().addAll(DataManagmentModule.getInstance().getYourCourseList());
    }

    @Override
    public void changed(ObservableValue observableValue, Object oldSelection, Object newSelection) {
        if(newSelection != null)
        {
            YourCourse selected = courseTable.getSelectionModel().getSelectedItem();
            descriptionTable.getItems().clear();
            groupTable.getItems().clear();
            if(selected.getYourStatus() == StudentStatus.NOT_ASSIGNED_TO_GROUP)
            {
                leaveButton.setDisable(true);
                enrollInButton.setDisable(false);
            }
            else
            {
                leaveButton.setDisable(false);
                enrollInButton.setDisable(true);

                ArrayList<CourseProperty> properties = selected.getCourse().getProperties();
                descriptionTable.getItems().clear();
                descriptionTable.getItems().addAll(properties);

                groupTable.getItems().clear();
                groupTable.getItems().addAll(selected.getGroup().getStudentList());
            }
        }
    }

    // DESCRIPTION TABLE //
    @FXML private TableView<CourseProperty> descriptionTable;
    @FXML private TableColumn<CourseProperty, String> propertyColumn;
    @FXML private TableColumn<CourseProperty, String> descriptionColumn;

    private void initializeDescripitonTable()
    {
        propertyColumn.setCellValueFactory(new PropertyValueFactory<>("propertyName"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        descriptionTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

    // STUDENT TABLE //
    @FXML private TableView<Student> groupTable;
    @FXML private TableColumn<Student, String> nameColumn;
    @FXML private TableColumn<Student, String> surnameColumn;

    private void initializeGroupTable()
    {
        groupTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));
    }

    //

    @FXML
    void onLeaveClick()
    {
        YourCourse selected = courseTable.getSelectionModel().getSelectedItem();
        selected.getGroup().removeStudent(DataManagmentModule.getInstance().getPersonalData().getID());
        selected.getGrades().clear();
        selected.setYourStatus(StudentStatus.NOT_ASSIGNED_TO_GROUP);
        descriptionTable.getItems().clear();
        groupTable.getItems().clear();
        courseTable.refresh();
    }

    @FXML
    void onEnrollInClick()
    {
        YourCourse selected = courseTable.getSelectionModel().getSelectedItem();
        if(selected.getGroup().getSize() < selected.getGroup().getCapacity()) {
            selected.getGroup().addStudent(DataManagmentModule.getInstance().getPersonalData().getID());
            selected.setYourStatus(StudentStatus.ASSIGNED_TO_GROUP);
            courseTable.refresh();

            ArrayList<CourseProperty> properties = selected.getCourse().getProperties();
            descriptionTable.getItems().clear();
            descriptionTable.getItems().addAll(properties);

            groupTable.getItems().clear();
            groupTable.getItems().addAll(selected.getGroup().getStudentList());
        }
    }

    @FXML
    void onSaveClick()
    {
        int notWrited = 0;
        if( (notWrited = DataManagmentModule.getInstance().writeCoursesToCSV()) != 0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Something wrong occured while writing to file!\n" +
                    String.valueOf(notWrited) + "records has not been writed!");

        }
    }
}
*/