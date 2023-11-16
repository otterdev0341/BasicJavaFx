package learnVBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("Button One");
		Button btn2 = new Button("Two");
		Button btn3 = new Button ("Button three");
		
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxWidth(Double.MAX_VALUE);
		//or setMaxWidth(90); also work
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(btn1,btn2,btn3);
//		vbox.setPadding(new Insets(10));
//		vbox.setSpacing(15);
		vbox.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(vbox,450,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
