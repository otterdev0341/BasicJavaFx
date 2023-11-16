package groupExample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GroupExample extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button b1 = new Button("Button Number 1");
		Button b2 = new Button("Button 2");
		
		Group group = new Group();
		group.getChildren().add(b1);
		group.getChildren().add(b2);
		
		Scene scene = new Scene(group,400,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Group Example");
		primaryStage.show();
		
	}

}
