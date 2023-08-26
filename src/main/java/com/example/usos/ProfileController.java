package com.example.usos;

import com.example.usos.Model.StudentModel.Student;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProfileController {
    @FXML private TextField IDText;
    @FXML private TextField nameText;
    @FXML private TextField surnameText;
    @FXML private TextField fieldOfStudyText;
    @FXML private TextField facultyText;
    @FXML private ImageView profileImageView;

    private Student _profileData;

    @FXML
    void initialize()
    {
        Image img = new Image("C:\\Users\\piero\\IdeaProjects\\USOS\\Images\\default-profile.jpg");
        profileImageView.setImage(img);
        profileImageView.setFitHeight(200);
        profileImageView.setFitWidth(200);

        initialzieData();
    }

    private void initialzieData()
    {
      /*  _profileData = DataManagmentModule.getInstance().getPersonalData();

        nameText.setEditable(false);
        surnameText.setEditable(false);
        fieldOfStudyText.setEditable(false);
        facultyText.setEditable(false);
        IDText.setEditable(false);

        nameText.setText(_profileData.getName());
        surnameText.setText(_profileData.getSurname());
        fieldOfStudyText.setText(_profileData.getFiedlOfStudy());
        facultyText.setText((_profileData.getFaculty()));
        IDText.setText(_profileData.getID());*/
    }
}
