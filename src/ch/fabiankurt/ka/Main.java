package ch.fabiankurt.ka;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static ArrayList<String> monat = new ArrayList<String>();
	public static Stage mainStage;
	
	public static void main(String[] args) {

		launch(args);
	}
	
	//Filechouser

	
	//Programm Grundeinstellungen
	public void start(Stage primaryStage) throws Exception{
		mainStage = primaryStage;
		/*primaryStage.setMinHeight(531);
		primaryStage.setMinWidth (349);
		primaryStage.setMaxHeight(531);
	    primaryStage.setMaxWidth (349);*/
		spiel();
	}
	
	public static void spiel() throws IOException{
		Parent root = FXMLLoader.load(Main.class.getResource("kalender.fxml"));
		Scene scene = new Scene(root);
		mainStage.setTitle("Kalender v1.0");
		mainStage.centerOnScreen();
		mainStage.setScene(scene);
		mainStage.show();
		
		//Monate
		monat.add("");
		monat.add("Januar");
		monat.add("Februar");
		monat.add("März");
		monat.add("April");
		monat.add("Mai");
		monat.add("Juni");
		monat.add("Juli");
		monat.add("August");
		monat.add("September");
		monat.add("Oktober");
		monat.add("November");
		monat.add("Dezember");

	}
}
