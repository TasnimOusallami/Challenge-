package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import models.Bedrijf;

public class BedrijfDetailController {
    
    @FXML
    private Label bedrijfNaamLabel;
    
    @FXML
    private Label bedrijfDescriptionLabel;
    
    @FXML
    private FlowPane vacaturesPane;
    
    @FXML
    public void initialize() {
        Bedrijf bedrijf = BedrijfSelectieController.getSelectedBedrijf();
        
        if (bedrijf != null) {
            bedrijfNaamLabel.setText(bedrijf.getNaam());
            
            if (bedrijf.getNaam().equals("Microsoft")) {
                bedrijfDescriptionLabel.setText("Microsoft is een technologiebedrijf dat een breed scala aan " +
                    "computergerelateeerde producten en diensten ontwikkelt, licentieert en ondersteunt. Het bedrijf is vooral bekend van het " +
                    "besturingssysteem Windows en het Office-pakket (met onder andere Word, Excel en PowerPoint), maar verkoopt tegenwoordig " +
                    "ook veel met clouddiensten zoals Microsoft Azure. Daarnaast produceert Microsoft hardware zoals Xbox-spelconsoles en " +
                    "Surface-apparaten en is het eigenaar van platforms zoals LinkedIn en GitHub.");
            } else {
                bedrijfDescriptionLabel.setText(bedrijf.getNaam() + " is een toonaangevend bedrijf in de sector.");
            }
            
            String[] vacatures = bedrijf.getVacatures().split(", ");
            for (String vacature : vacatures) {
                Button btn = new Button(vacature);
                btn.getStyleClass().add("vacature-button");
                btn.setOnAction(e -> handleVacatureClick(e));
                vacaturesPane.getChildren().add(btn);
            }
        }
    }
    
    private void handleVacatureClick(ActionEvent event) {
        loadScene("/views/SollicitatieView.fxml", event);
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
