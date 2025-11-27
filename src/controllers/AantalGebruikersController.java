package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Gebruiker;

public class AantalGebruikersController {
    
    @FXML
    private ListView<Gebruiker> gebruikersListView;
    
    private static Gebruiker selectedGebruiker;
    
    @FXML
    public void initialize() {
        ObservableList<Gebruiker> gebruikers = FXCollections.observableArrayList(
            new Gebruiker("12345678"),
            new Gebruiker("23456789"),
            new Gebruiker("34567890"),
            new Gebruiker("45678901"),
            new Gebruiker("56789012"),
            new Gebruiker("67890123"),
            new Gebruiker("78901234"),
            new Gebruiker("89012345"),
            new Gebruiker("90123456"),
            new Gebruiker("01234567")
        );
        
        gebruikersListView.setItems(gebruikers);
        gebruikersListView.setCellFactory(param -> new GebruikerCell());
        
        gebruikersListView.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                selectedGebruiker = gebruikersListView.getSelectionModel().getSelectedItem();
                if (selectedGebruiker != null) {
                    loadScene("/views/GebruikerDetailView.fxml", null);
                }
            }
        });
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        loadScene("/views/VacatureOverzichtView.fxml", event);
    }
    
    @FXML
    private void handleLogout(ActionEvent event) {
        utils.SessionManager.logout();
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleProfiel(ActionEvent event) {
        loadScene("/views/BedrijfsProfielView.fxml", event);
    }
    
    public static Gebruiker getSelectedGebruiker() {
        return selectedGebruiker;
    }
    
    private void loadScene(String fxmlPath, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage;
            if (event != null) {
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            } else {
                stage = (Stage) gebruikersListView.getScene().getWindow();
            }
            stage.setScene(new Scene(root, 1000, 600));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private class GebruikerCell extends ListCell<Gebruiker> {
        @Override
        protected void updateItem(Gebruiker gebruiker, boolean empty) {
            super.updateItem(gebruiker, empty);
            
            if (empty || gebruiker == null) {
                setGraphic(null);
            } else {
                HBox hbox = new HBox(10);
                hbox.setAlignment(Pos.CENTER_LEFT);
                hbox.setStyle("-fx-padding: 10; -fx-background-color: #d3d3d3; -fx-background-radius: 5;");
                
                Label idLabel = new Label("KlantenID: " + gebruiker.getKlantenID());
                idLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
                
                HBox spacer = new HBox();
                HBox.setHgrow(spacer, javafx.scene.layout.Priority.ALWAYS);
                
                Button editBtn = new Button("✏");
                editBtn.setStyle("-fx-background-color: transparent; -fx-font-size: 16px;");
                
                Button deleteBtn = new Button("🗑");
                deleteBtn.setStyle("-fx-background-color: transparent; -fx-font-size: 16px;");
                
                hbox.getChildren().addAll(idLabel, spacer, editBtn, deleteBtn);
                setGraphic(hbox);
            }
        }
    }
}
