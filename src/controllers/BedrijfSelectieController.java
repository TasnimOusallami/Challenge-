package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import models.Bedrijf;

public class BedrijfSelectieController {
    
    private static Bedrijf selectedBedrijf;
    
    @FXML
    private void handleMicrosoft(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Microsoft", "Software Engineer, Technical Support, Sales, HR");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleMcDonalds(ActionEvent event) {
        selectedBedrijf = new Bedrijf("McDonalds", "Manager, Crew Member, Shift Leader");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleING(ActionEvent event) {
        selectedBedrijf = new Bedrijf("ING", "Financial Advisor, Developer, Risk Analyst");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handlePhilips(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Philips", "Engineer, Designer, Sales");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleNVIDIA(ActionEvent event) {
        selectedBedrijf = new Bedrijf("NVIDIA", "GPU Engineer, AI Researcher, Software Developer");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleGoogle(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Google", "Software Engineer, Product Manager, UX Designer");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleAmazon(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Amazon", "Software Developer, Operations Manager, Data Scientist");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleMeta(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Meta", "Software Engineer, Data Engineer, Product Designer");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleApple(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Apple", "iOS Developer, Hardware Engineer, Designer");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleHeineken(ActionEvent event) {
        selectedBedrijf = new Bedrijf("Heineken", "Brand Manager, Supply Chain, Sales Representative");
        loadScene("/views/VacatureListView.fxml", event);
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        loadScene("/views/LoginSollicitantView.fxml", event);
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
    
    public static Bedrijf getSelectedBedrijf() {
        return selectedBedrijf;
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
