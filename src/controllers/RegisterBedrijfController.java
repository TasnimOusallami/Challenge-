package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class RegisterBedrijfController {
    
    @FXML
    private TextField bedrijfsnaamField;
    
    @FXML
    private TextField emailField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private PasswordField confirmPasswordField;
    
    @FXML
    private TextArea beschrijvingArea;
    
    @FXML
    private void handleRegistreer(ActionEvent event) {
        // Sla bedrijfsnaam op
        String bedrijfsNaam = bedrijfsnaamField.getText();
        
        // In productie: sla op in database
        // Voor nu: direct inloggen
        utils.SessionManager.loginBedrijf(bedrijfsNaam);
        
        loadScene("/views/VacatureOverzichtView.fxml", event);
    }
    
    @FXML
    private void handleLoginLink(ActionEvent event) {
        loadScene("/views/LoginBedrijfView.fxml", event);
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
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
