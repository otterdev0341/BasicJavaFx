package chartExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScatterChartExample extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		NumberAxis xAxis = new NumberAxis();
		xAxis.setLabel("No of employees");
		
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Revenue per employee");
		
		ScatterChart scatterChart = new ScatterChart(xAxis,yAxis);
		
		XYChart.Series dataSeries1 = new XYChart.Series();
		dataSeries1.setName("2014");
		
		dataSeries1.getData().add(new XYChart.Data(1,567));
		dataSeries1.getData().add(new XYChart.Data(5,612));
		dataSeries1.getData().add(new XYChart.Data(10,800));
		dataSeries1.getData().add(new XYChart.Data(20,780));
		dataSeries1.getData().add(new XYChart.Data(40,810));
		dataSeries1.getData().add(new XYChart.Data(80,850));
		
		scatterChart.getData().add(dataSeries1);
		
		VBox vbox = new VBox(scatterChart);
		
		Scene scene = new Scene(vbox, 400, 200);
		primaryStage.setTitle("Scatter Chart Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
