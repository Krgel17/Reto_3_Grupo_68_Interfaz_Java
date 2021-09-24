import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("/view/pantalla.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LECTOR DEL NIVEL DE LA CALIDAD DEL AGUA EN EL ATLÁNTICO");
        primaryStage.show();
        
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
