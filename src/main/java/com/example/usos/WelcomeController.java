package com.example.usos;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WelcomeController {

    @FXML
    private ImageView imageView;

    @FXML
    void initialize()
    {
        Image welcomeImage = new Image("C:\\Users\\piero\\IdeaProjects\\USOS\\Images\\agh.jpg");
        imageView.setImage(welcomeImage);
        imageView.setFitHeight(600);
        imageView.setFitWidth(800);
    }
}
