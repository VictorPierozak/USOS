package com.example.usos;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {

    // LOADED CONTENT
    @FXML private AnchorPane loadedContent;
    @FXML private Button profileButton;
    @FXML private Button gradesButton;
    @FXML private Button courseButton;

    private final String COURSE_VIEW = "groups-view.fxml";
    private final String GRADES_VIEW = "grades-view.fxml";
    private final String WELCOME_VIEW = "welcome-view.fxml";
    private final String PROFILE_VIEW = "profile.fxml";

    private Tooltip gradesToolTip;
    private Tooltip profileToolTip;
    private Tooltip groupsToolTip;


    @FXML
    public void initialize() {

        if(  false)
        {
            dataProviderFailed();
        }
        try{
          loadedContent.getChildren().clear();
          loadedContent.getChildren().add(FXMLLoader.load(getClass().getResource(WELCOME_VIEW)));
        }
        catch (IOException io)
        {
            System.out.println("ERROR");
        }

        gradesToolTip = new Tooltip("List of grades from assigned courses");
        profileToolTip = new Tooltip("Student account details");
        groupsToolTip = new Tooltip("Available groups");

        gradesButton.setTooltip(gradesToolTip);
        profileButton.setTooltip(profileToolTip);
        courseButton.setTooltip(groupsToolTip);
    }

    // BUTTONS //

    @FXML
    void onCourseGroupClick()
    {
        try{
            loadedContent.getChildren().clear();
            loadedContent.getChildren().add(FXMLLoader.load(getClass().getResource(COURSE_VIEW)));
        }
        catch (IOException io)
        {
            System.out.println(io.getMessage());
        }
    }

    @FXML
    void onGradesClick()
    {
        try{
            loadedContent.getChildren().clear();
            loadedContent.getChildren().add(FXMLLoader.load(getClass().getResource(GRADES_VIEW)));
        }
        catch (IOException io)
        {
            System.out.println(io.getCause());
        }
    }


    @FXML
    void onProfileClick()
    {
        try{
            loadedContent.getChildren().clear();
            loadedContent.getChildren().add(FXMLLoader.load(getClass().getResource(PROFILE_VIEW)));
        }
        catch (IOException io)
        {
            System.out.println(io.getCause());
        }
    }

    // ALERTS //

    void dataProviderFailed()
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Data provider has failed! Check data source files!");
        alert.showAndWait();
        System.exit(-1);

    }
}