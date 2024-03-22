package org.example.bmi_calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BMI_Calculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BMI_Calculator.class.getResource("BMI_frontend_withdropdown.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("BMI Calculator by Saathvik");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}