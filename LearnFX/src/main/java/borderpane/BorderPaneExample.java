package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

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
		bp.setCenter(btn1);
		bp.setTop(btn2);
		bp.setBottom(btn3);
		bp.setLeft(btn4);
		bp.setRight(btn5);
		
		//add pane into scene
		Scene scene = new Scene(bp,400,350);
		
		// add scene into stage & show
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
