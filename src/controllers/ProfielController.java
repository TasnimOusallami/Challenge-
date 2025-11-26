package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.File;

public class ProfielController {
    
    @FXML
    private TextField naamField;
    
    @FXML
    private TextField emailField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private TextArea vaardighedenArea;
    
    @FXML
    private TextArea werkervaringArea;
    
    @FXML
    private ListView<String> diplomaListView;
    
    private ObservableList<String> diplomaList = FXCollections.observableArrayList();
    
    @FXML
    public void initialize() {
        diplomaListView.setItems(diplomaList);
        
        // Dummy data
        naamField.setText("Mohammed El-Mansouri");
        emailField.setText("m.mansouri@gmail.com");
        passwordField.setText("************");
        vaardighedenArea.setText("C#, C++, PHP, Java, JavaScript, HTML, CSS");
        werkervaringArea.setText("2016-2020 Odido (IT)\n2020-2025 Microsoft (Developer)");
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
        loadScene("/views/LoginSollicitantView.fxml", event);
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
