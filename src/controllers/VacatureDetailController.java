package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import models.Vacature;

public class VacatureDetailController {
    
    @FXML
    private Label functieNaamLabel;
    
    @FXML
    private Label statusLabel;
    
    @FXML
    private Label adresLabel;
    
    @FXML
    private Label werkurenLabel;
    
    @FXML
    private Label dienstverbandLabel;
    
    @FXML
    private Label salarisLabel;
    
    @FXML
    public void initialize() {
        Vacature vacature = VacatureListController.getSelectedVacature();
        
        if (vacature != null) {
            functieNaamLabel.setText(vacature.getFunctieNaam());
            statusLabel.setText("Status: " + vacature.getStatus());
            adresLabel.setText("Adres: " + vacature.getAdres());
            werkurenLabel.setText("Werkuren: " + vacature.getWerkuren());
            dienstverbandLabel.setText("Dienstverband: " + vacature.getDienstverband());
            salarisLabel.setText("Salarisindicatie: " + vacature.getSalaris());
        }
    }
    
    @FXML
    private void handleSoliciteer(ActionEvent event) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("Sollicitatie");
        alert.setHeaderText(null);
        alert.setContentText("Je hebt gesoliciteerd");
        alert.showAndWait();
        
        loadScene("/views/BedrijfSelectieView.fxml", event);
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleLogout(ActionEvent event) {
        utils.SessionManager.logout();
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleProfiel(ActionEvent event) {
        loadScene("/views/CVView.fxml", event);
    }
    
    @FXML
    private void handleNFCKaart(ActionEvent event) {
        loadScene("/views/NFCKaartView.fxml", event);
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
