package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PaneInsideAnotherPane extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("File");
		Button btn2 = new Button("Menu");
		Button btn3 = new Button("New");
		Button btn4 = new Button("Save");
		Button btn5 = new Button("Exit");
		
		BorderPane bp = new BorderPane();
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(btn1,btn2,btn3);
		hbox.setSpacing(5);
		
		HBox hbox2 = new HBox();
		hbox2.getChildren().addAll(btn4,btn5);
		
		bp.setTop(hbox);
		bp.setBottom(hbox2);
		
		Scene scene = new Scene(bp,400,350);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Double Pane Example");
		primaryStage.show();
	}

}
