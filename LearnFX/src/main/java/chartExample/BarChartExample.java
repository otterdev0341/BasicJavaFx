package chartExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarChartExample extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//create x y and create bar chart
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("Devices");
		
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Visits");
		
		BarChart barChart = new BarChart(xAxis,yAxis);
		
		XYChart.Series dataSerie1 = new XYChart.Series();
		dataSerie1.setName("2014");
		
		dataSerie1.getData().add(new XYChart.Data("Desktop",178));
		dataSerie1.getData().add(new XYChart.Data("Phone",65));
		dataSerie1.getData().add(new XYChart.Data("Tablet",23));
		
		barChart.getData().add(dataSerie1);
		
		VBox vbox = new VBox(barChart);
		
		Scene scene = new Scene(vbox,400,400);
		
		primaryStage.setTitle("Learn Bar Chart");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
