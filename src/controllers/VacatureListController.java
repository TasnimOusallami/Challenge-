package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Bedrijf;
import models.Vacature;

public class VacatureListController {
    
    @FXML
    private ListView<Vacature> vacatureListView;
    
    private static Vacature selectedVacature;
    
    @FXML
    public void initialize() {
        Bedrijf bedrijf = BedrijfSelectieController.getSelectedBedrijf();
        
        ObservableList<Vacature> vacatures = FXCollections.observableArrayList();
        
        if (bedrijf != null && bedrijf.getNaam().equals("Microsoft")) {
            vacatures.add(new Vacature(
                "Software Engineer",
                "Open",
                "Amsterdam, Nederland",
                "40 uur per week",
                "Fulltime",
                "€4500 - €6500 per maand",
                "Microsoft"
            ));
            vacatures.add(new Vacature(
                "Technical Support",
                "Open",
                "Rotterdam, Nederland",
                "32-40 uur per week",
                "Fulltime/Parttime",
                "€3000 - €4000 per maand",
                "Microsoft"
            ));
        } else if (bedrijf != null) {
            vacatures.add(new Vacature(
                "Algemene functie",
                "Open",
                "Utrecht, Nederland",
                "40 uur per week",
                "Fulltime",
                "€3500 - €5000 per maand",
                bedrijf.getNaam()
            ));
        }
        
        vacatureListView.setItems(vacatures);
        vacatureListView.setCellFactory(param -> new VacatureCell());
        
        vacatureListView.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                selectedVacature = vacatureListView.getSelectionModel().getSelectedItem();
                if (selectedVacature != null) {
                    loadScene("/views/VacatureDetailView.fxml", null);
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
        loadScene("/views/BedrijfSelectieView.fxml", event);
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
    
    public static Vacature getSelectedVacature() {
        return selectedVacature;
    }
    
    private void loadScene(String fxmlPath, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage;
            if (event != null) {
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            } else {
                stage = (Stage) vacatureListView.getScene().getWindow();
            }
            stage.setScene(new Scene(root, 1000, 600));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private class VacatureCell extends ListCell<Vacature> {
        @Override
        protected void updateItem(Vacature vacature, boolean empty) {
            super.updateItem(vacature, empty);
            
            if (empty || vacature == null) {
                setGraphic(null);
            } else {
                VBox vbox = new VBox(5);
                vbox.setStyle("-fx-padding: 15; -fx-background-color: #e8e8e8; -fx-background-radius: 5;");
                
                Label functieLabel = new Label(vacature.getFunctieNaam());
                functieLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
                
                Label statusLabel = new Label("Status: " + vacature.getStatus());
                Label adresLabel = new Label("📍 " + vacature.getAdres());
                
                vbox.getChildren().addAll(functieLabel, statusLabel, adresLabel);
                setGraphic(vbox);
            }
        }
    }
}
