package ch.fabiankurt.ka;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
 
public class Filechooser extends Application {
 
  public static void main(String[] args) {
     Application.launch(args);
  }
 
  @Override
  public void start(Stage stage) {
      stage.setTitle("Javafxtuts.com");
      Label label =new Label("A File Chooser");
      FileChooser fileChooser = new FileChooser();
      fileChooser.setTitle("Choose a File");
      ExtensionFilter extensionFilter=new ExtensionFilter("JPG", "*.jpg");
      File file=fileChooser.showOpenDialog(stage);
      label.setText("You have opend a file "+file);
      BorderPane root = new BorderPane();
      root.setCenter(label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
  }
}
