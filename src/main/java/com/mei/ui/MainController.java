package com.mei.ui;

import com.mei.service.FindXYStrategy;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.inject.Inject;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by mario on 05/07/2016.
 */
public class MainController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ImageView imageView;

    FindXYStrategy findXYStrategy;
    private Stage stage;

    @Inject
    public MainController(FindXYStrategy messageGenerator) {
        this.findXYStrategy = messageGenerator;
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image");
        File file = fileChooser.showOpenDialog(stage);
        imageView.setImage(new Image(file.toURI().toString()));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public FindXYStrategy getFindXYStrategy() {
        return findXYStrategy;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}