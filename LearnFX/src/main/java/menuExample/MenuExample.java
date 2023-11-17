package menuExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// create the menu
		MenuBar menuBar = new MenuBar();
		//File -> Web -> SQL
		Menu fileMenu = new Menu("File");
		Menu webMenu = new Menu("Web");
		Menu sqlMenu = new Menu("SQL");
		// add item to menu
		MenuItem menuItem = new MenuItem("New");
		MenuItem saveMenuItem = new MenuItem("Save");
		MenuItem exitMenuItem = new MenuItem("Exit");
		
		CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
		htmlMenuItem.setSelected(true);
		CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
		cssMenuItem.setSelected(true);
		
		RadioMenuItem mySqlItem = new RadioMenuItem("MySQL");
		RadioMenuItem oracleItem = new RadioMenuItem("Oracle");
		ToggleGroup tGroup = new ToggleGroup();
		mySqlItem.setToggleGroup(tGroup);
		oracleItem.setToggleGroup(tGroup);
		
		Menu tutorial = new Menu("Tutorial");
		MenuItem m1 = new MenuItem("Java");
		MenuItem m2 = new MenuItem("JavaFX");
		MenuItem m3 = new MenuItem("Swing");
		
		//add items to menu
		fileMenu.getItems().addAll(menuItem,saveMenuItem,exitMenuItem);
		webMenu.getItems().addAll(htmlMenuItem,cssMenuItem);
		tutorial.getItems().addAll(m1,m2,m3);
		sqlMenu.getItems().addAll(mySqlItem,oracleItem,tutorial);
		// add menus to the menu bar
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(webMenu);
		menuBar.getMenus().add(sqlMenu);
		//add menu bar to border pane
		BorderPane bp = new BorderPane();
		bp.setTop(menuBar);
		//add layout to the scene
		Scene scene = new Scene(bp,400,300);
		//set scene on the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Test Menu");
		primaryStage.show();
		
	}

}
