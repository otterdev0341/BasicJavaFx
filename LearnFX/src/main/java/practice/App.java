package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button myButton = new Button();
		myButton.setText("Hellow Meow!");
		BorderPane pane = new BorderPane();
		pane.setCenter(myButton);
		Scene scene = new Scene(pane,500,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
