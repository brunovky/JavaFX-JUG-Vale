package com.jugvale.login.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("com/jugvale/login/fxml/login.fxml"));
		stage.setScene(new Scene(parent));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
