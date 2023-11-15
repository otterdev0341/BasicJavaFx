package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCount2 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		Label lbl = new Label();
		BorderPane bp = new BorderPane();
		
		
		btn.setText("Click me!!");
		lbl.setText("You have not click the button.");
		//Button and Label now available
		//how to arrange it 
		//Use Layout Pane :(for now) BorderPane
		// add a control to borderpane
		bp.setTop(lbl);
		bp.setCenter(btn);
		//Create Scene to attach borderpane
		Scene scene = new Scene(bp,250,150);
		//add to Stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
