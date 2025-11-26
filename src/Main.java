import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    private static Stage primaryStage;
    
    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        primaryStage.setTitle("Recruitment Portal");
        showHomeScreen();
        primaryStage.show();
    }
    
    public static void showHomeScreen() {
        loadScene("/views/HomeView.fxml", 1000, 600);
    }
    
    public static void loadScene(String fxmlPath, int width, int height) {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource(fxmlPath));
            Scene scene = new Scene(root, width, height);
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
