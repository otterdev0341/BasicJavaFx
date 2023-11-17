package registrationForm;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label nameLabel = new Label("Name: ");
		TextField nameText = new TextField();
		
		Label dobLabel = new Label("Date of Birth");
		DatePicker datePicker = new DatePicker();
		
		ToggleGroup groupGender = new ToggleGroup();
		Label lblGender = new Label("Gender");
		RadioButton radioSex1 = new RadioButton("male");
		RadioButton radioSex2 = new RadioButton("female");
		radioSex1.setToggleGroup(groupGender);
		radioSex2.setToggleGroup(groupGender);
		
		Label lblTech = new Label("Technologies Knows");
		CheckBox ckTech1 = new CheckBox("Java");
		CheckBox ckTech2 = new CheckBox("DotNet");
		
		Label lblEduQuali = new Label("Education Qualification");
		ListView eduList = new ListView();
		eduList.getItems().add("Engineering");
		eduList.getItems().add("MCA");
		eduList.getItems().add("MBA");
		eduList.getItems().add("Gradution");
		eduList.getItems().add("MTech");
		
		Label lblLocation = new Label("Location");
		ChoiceBox chLocation = new ChoiceBox();
		chLocation.getItems().add("US");
		chLocation.getItems().add("TH");
		chLocation.getItems().add("FR");
		
		Button btnRegister = new Button("Register");
		
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(500, 500);
		gridPane.setPadding(new Insets(10,10,15,15));
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		
		
		//add none into gridpane
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(nameText, 1, 0);
		gridPane.add(dobLabel, 0, 1);
		gridPane.add(datePicker, 1, 1);
		gridPane.add(lblGender, 0, 2);
		gridPane.add(radioSex1, 1, 2);
		gridPane.add(radioSex2, 2, 2);
		gridPane.add(lblTech, 0, 3);
		gridPane.add(ckTech1, 1, 3);
		gridPane.add(ckTech2, 2, 3);
		gridPane.add(lblEduQuali, 0, 4);
		gridPane.add(eduList, 1, 4);
		gridPane.add(lblLocation, 0, 5);
		gridPane.add(chLocation, 1, 5);
		gridPane.add(btnRegister, 2, 6);
		//add into Scene
		Scene scene = new Scene(gridPane,650,450);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Registration Form");
		primaryStage.show();
				
		
	}

}
