package chartExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PieChartExample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//create piechart
		PieChart pc = new PieChart();
		//init data
		PieChart.Data slice1 = new PieChart.Data("Desktop",213);
		PieChart.Data slice2 = new PieChart.Data("Phone", 67);
		PieChart.Data slice3 = new PieChart.Data("Tablet", 38);
		PieChart.Data slice4 = new PieChart.Data("Microwave", 10);
		// add data to chart
		pc.getData().add(slice1);
		pc.getData().add(slice2);
		pc.getData().add(slice3);
		pc.getData().add(slice4);
		
		// add to pane
		VBox vbox = new VBox(pc);
		//set to scene
		Scene scene = new Scene(vbox,400,350);
		//show
		primaryStage.setTitle("Practice PieChart");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
}
