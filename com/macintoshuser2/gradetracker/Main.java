package com.macintoshuser2.gradetracker;

import com.macintoshuser2.gradetracker.ui.UIBuilder;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {
	
	UIBuilder builder = new UIBuilder("Grade Tracker");

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			if(Double.parseDouble(System.getProperty("java.specification.version")) > 1.7) {
				builder.buildUI(primaryStage);
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("Sorry, You are not running Java 8. Your Java version is Java " + System.getProperty("java.specification.version").substring(2) + ". Please install Java 8 or later to run the application!");
				alert.showAndWait();
				alert.getButtonTypes().clear();
				alert.getButtonTypes().add(ButtonType.OK);
				alert.show();
				System.exit(-1);
			}
		} catch(NumberFormatException ex) {
			System.exit(-1);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
