package menuExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CustomMenu extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create menu bar
		MenuBar menuBar = new MenuBar();
		//create menu
		Menu menu = new Menu("File");
		//add item to menu
		MenuItem item1 = new MenuItem("New");
		MenuItem item2 = new MenuItem("Save");
		SeparatorMenuItem item3 = new SeparatorMenuItem();
		MenuItem item4 = new MenuItem("Exit");
		CustomMenuItem item5 = new CustomMenuItem(new Slider());
		menu.getItems().addAll(item1,item2,item3,item4,item5);
		//add menu to menu bar
		menuBar.getMenus().add(menu);
		//add menu to layout
		BorderPane bp = new BorderPane();
		bp.setTop(menuBar);
		//add layout to scene
		Scene scene = new Scene(bp,420,300);
		//set scene for the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Custome menu");
		//display
		primaryStage.show();
		
	}

}
