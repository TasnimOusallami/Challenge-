package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Gebruiker;

public class GebruikerDetailController {
    
    @FXML
    private Label naamLabel;
    
    @FXML
    private FlowPane selectedVacaturesPane;
    
    @FXML
    private Label vaardighedenLabel;
    
    @FXML
    private Label werkervaringLabel;
    
    @FXML
    private ListView<String> diplomaListView;
    
    @FXML
    private javafx.scene.control.TextArea berichtArea;
    
    @FXML
    public void initialize() {
        Gebruiker gebruiker = AantalGebruikersController.getSelectedGebruiker();
        
        if (gebruiker != null) {
            naamLabel.setText(gebruiker.getNaam());
        }
        
        Button btn1 = new Button("Software Engineer");
        Button btn2 = new Button("Technical Support");
        btn1.getStyleClass().add("selected-vacature-button");
        btn2.getStyleClass().add("selected-vacature-button");
        selectedVacaturesPane.getChildren().addAll(btn1, btn2);
        
        vaardighedenLabel.setText("C#, C++, PHP, Java, JavaScript, HTML, CSS");
        werkervaringLabel.setText("2016-2020 Odido (IT)\n2020-2025 Microsoft (Developer)");
        
        ObservableList<String> diplomas = FXCollections.observableArrayList(
            "Bachelor Computer Science - Universiteit van Amsterdam",
            "Master Software Engineering - TU Delft"
        );
        diplomaListView.setItems(diplomas);
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        loadScene("/views/AantalGebruikersView.fxml", event);
    }
    
    @FXML
    private void handleVerstuurBericht(ActionEvent event) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("Bericht");
        alert.setHeaderText(null);
        alert.setContentText("Bericht verstuurd");
        alert.showAndWait();
        
        if (berichtArea != null) {
            berichtArea.clear();
        }
    }
    
    @FXML
    private void handleProfiel(ActionEvent event) {
        loadScene("/views/CVView.fxml", event);
    }
    
    @FXML
    private void handleNFCKaart(ActionEvent event) {
        loadScene("/views/NFCKaartView.fxml", event);
    }
    
    @FXML
    private void handleLogout(ActionEvent event) {
        utils.SessionManager.logout();
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
