package practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxLayoutExample2 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("Button One");
		Button btn2 = new Button("Button Two");
		Button btn3 = new Button("Button Three");

		// Add control into Layout
		HBox hbox = new HBox();
		hbox.getChildren().addAll(btn1, btn2, btn3);
		hbox.setPadding(new Insets(20));
		hbox.setSpacing(10);
//		HBox.setMargin(btn1, new Insets(10,15,20,10));
		// Add layout into Scene
		Scene scene = new Scene(hbox, 500, 500);

		// Add the scene to the stage
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
