package com.macintoshuser2.gradetracker.ui;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UIBuilder {
	private String name;
	
	private Stage primaryStage = new Stage();
	private GridPane root = new GridPane();
	private Scene scene = new Scene(root);
	private TextField fp, secp, tp, fop, fip, sip, sevp, firstNameField, lastNameField, studentIDField, classOfField;
	
	private Button saveToFileButton;
	
	public UIBuilder() {
		this.name = "";
	}
	
	public UIBuilder(String name) {
		this.name = name;
	}
	
	public void buildUI(Stage stage) {
		this.primaryStage = stage;
		fp = new TextField();
		secp = new TextField();
		tp = new TextField();
		fop = new TextField();
		fip = new TextField();
		sip = new TextField();
		sevp = new TextField();
		firstNameField = new TextField();
		lastNameField = new TextField();
		studentIDField = new TextField();
		classOfField = new TextField();
		
		saveToFileButton = new Button("Save to Text file");
		
		root.add(new Label("1st Period: "), 0, 0);
		root.add(new Label("2nd Period: "), 0, 1);
		root.add(new Label("3rd Period: "), 0, 2);
		root.add(new Label("4th Period: "), 0, 3);
		root.add(new Label("5th Period: "), 0, 4);
		root.add(new Label("6th Period: "), 0, 5);
		root.add(new Label("7th Period: "), 0, 6);
		
		root.add(fp,    1, 0);
		root.add(secp,  1, 1);
		root.add(tp,    1, 2);
		root.add(fop,   1, 3);
		root.add(fip,   1, 4);
		root.add(sip,   1, 5);
		root.add(sevp,  1, 6);
		
		root.add(new Label("First Name: "), 2, 0);
		root.add(new Label("Last Name: "),  2, 1);
		root.add(new Label("LPS ID #: "),   2, 2);
		root.add(new Label("Grad Yr.: "),   2, 3);
		
		root.add(firstNameField, 3, 0);
		root.add(lastNameField,  3, 1);
		root.add(studentIDField, 3, 2);
		root.add(classOfField,   3, 3);
		
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(20, 20, 20, 20));
		
		for(Node n : root.getChildren()) {
			if(n instanceof Label) {
				((Label) n).setPadding(new Insets(5, 5, 5, 5));
			}
		}
		
		primaryStage.setScene(scene);
		primaryStage.setTitle(name);
		primaryStage.show();
	}
	
	private void showUI(Stage stage) {
		stage.show();
	}
}
