package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class HomeController {
    
    @FXML
    private void handleRegistreerSollicitant(ActionEvent event) {
        loadScene("/views/RegisterSollicitantView.fxml", event);
    }
    
    @FXML
    private void handleRegistreerBedrijf(ActionEvent event) {
        loadScene("/views/RegisterBedrijfView.fxml", event);
    }
    
    private void loadScene(String fxmlPath, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 1000, 600));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
