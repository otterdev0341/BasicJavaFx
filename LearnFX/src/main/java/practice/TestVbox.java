package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestVbox extends Application{

	public static void main(String[] args)  {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		Label lbn = new Label();
		Label lbn2 = new Label();
		
		btn.setText("Hi there!!");
		lbn.setText("This is inportant context.");
		lbn2.setText(" meow MeOw mEoW");
		
		HBox box = new HBox(btn,lbn);
		box.getChildren().add(lbn2);
		//Also use box.getChildren().addAll(btn,lbn,lbn2);
		
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
