package controllers;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

import models.Gebruiker;
import javafx.scene.control.TextArea;

public class SollicitatieController {
    
    @FXML
    private FlowPane selectedVacaturesPane;
    
    @FXML
    private Label vaardighedenLabel;
    
    @FXML
    private Label werkervaringLabel;
    
    @FXML
    private ListView<String> diplomaListView;
    
    @FXML
    private TextArea berichtArea;
    
    @FXML
    public void initialize() {
        Gebruiker gebruiker = AantalGebruikersController.getSelectedGebruiker();
        
        if (gebruiker != null) {
            Button btn1 = new Button("Software Engineer");
            Button btn2 = new Button("Technical Support");
            btn1.getStyleClass().add("selected-vacature-button");
            btn2.getStyleClass().add("selected-vacature-button");
            selectedVacaturesPane.getChildren().addAll(btn1, btn2);
        }
        
        vaardighedenLabel.setText("C#, C++, PHP, Java, JavaScript, HTML, CSS");
        werkervaringLabel.setText("2016-2020 Odido (IT)\n2020-2025 Microsoft (Developer)");
        
        javafx.collections.ObservableList<String> diplomas = javafx.collections.FXCollections.observableArrayList(
            "Bachelor Computer Science - Universiteit van Amsterdam",
            "Master Software Engineering - TU Delft"
        );
        diplomaListView.setItems(diplomas);
    }
    
    @FXML
    private void handleVerstuur(ActionEvent event) {
        loadScene("/views/AantalGebruikersView.fxml", event);
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        loadScene("/views/AantalGebruikersView.fxml", event);
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
