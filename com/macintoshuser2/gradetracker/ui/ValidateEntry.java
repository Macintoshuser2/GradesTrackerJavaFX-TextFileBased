package com.macintoshuser2.gradetracker.ui;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ValidateEntry {
	public static boolean validNumberOfClasses(String numberOfClasses) {
		try {
			if(!numberOfClasses.isEmpty()) {
				return true;
			} else {
				return false;
			}
		} catch(NumberFormatException ex) {
			Alert a = new Alert(AlertType.ERROR);
			a.setContentText("Invalid Number of classes! You did not enter a number!");
			a.showAndWait();
			return false;
		}
	}
}
