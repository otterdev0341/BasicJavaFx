package loginPage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginPage extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create controller
		Label lbl_email = new Label("Email");
		Label lbl_password = new Label("Password");
		TextField txt_email = new TextField();
		PasswordField txt_password = new PasswordField();
		Button btn_submit = new Button("Submit");
		Button btn_clear = new Button("Clear");
		// add in to pane
		GridPane gp = new GridPane();
		gp.setMinWidth(400);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.add(lbl_email, 0, 0);
		gp.add(txt_email, 1, 0);
		gp.add(lbl_password, 0, 1);
		gp.add(txt_password, 1, 1);
		gp.add(btn_submit, 0, 2);
		gp.add(btn_clear, 1, 2);
		gp.setAlignment(Pos.CENTER);
		//scene and stage
		Scene scene = new Scene(gp,450,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Page");
		primaryStage.show();
		
	}

}
