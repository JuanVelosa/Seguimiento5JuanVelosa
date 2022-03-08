package main;

import java.io.IOException;

import control.WindowA;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String [] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage){
		
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/WindowA.fxml"));
			loader.setController(new WindowA());
			
			Parent parent = null;
			try {
				parent = (Parent) loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Stage stage = new Stage();
			
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			
			stage.show();
			
		
		
		
	}

	
}
