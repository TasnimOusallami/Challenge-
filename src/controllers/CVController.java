package controllers;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.File;

public class CVController {
    
    @FXML
    private TextArea vaardighedenArea;
    
    @FXML
    private TextArea werkervaringArea;
    
    @FXML
    private ListView<String> diplomaListView;
    
    private ObservableList<String> diplomaList = FXCollections.observableArrayList();
    
    @FXML
    private Label klantenIDLabel;
    
    @FXML
    public void initialize() {
        diplomaListView.setItems(diplomaList);
        
        // Haal data op uit SessionManager
        klantenIDLabel.setText("KlantenID: " + utils.SessionManager.getKlantenID());
        vaardighedenArea.setText(utils.SessionManager.getVaardigheden());
        werkervaringArea.setText(utils.SessionManager.getWerkervaring());
    }
    
    @FXML
    private void handleOpslaan(ActionEvent event) {
        // Sla aangepaste gegevens op in SessionManager
        utils.SessionManager.setVaardigheden(vaardighedenArea.getText());
        utils.SessionManager.setWerkervaring(werkervaringArea.getText());
        
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("Opgeslagen");
        alert.setHeaderText(null);
        alert.setContentText("Wijzigingen opgeslagen");
        alert.showAndWait();
    }
    
    @FXML
    private void handleUploadDiploma(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Diploma");
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
            new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        
        if (file != null) {
            diplomaList.add(file.getName());
        }
    }
    
    @FXML
    private void handleVerder(ActionEvent event) {
        loadScene("/views/BedrijfSelectieView.fxml", event);
    }
    
    @FXML
    private void handleHome(ActionEvent event) {
        loadScene("/views/HomeView.fxml", event);
    }
    
    @FXML
    private void handleBack(ActionEvent event) {
        if (utils.SessionManager.getUserType().equals("sollicitant")) {
            loadScene("/views/BedrijfSelectieView.fxml", event);
        } else {
            loadScene("/views/VacatureOverzichtView.fxml", event);
        }
    }
    
    @FXML
    private void handleProfiel(ActionEvent event) {
        // Already on CV page
    }
    
    @FXML
    private void handleLogout(ActionEvent event) {
        utils.SessionManager.logout();
        loadScene("/views/HomeView.fxml", event);
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
