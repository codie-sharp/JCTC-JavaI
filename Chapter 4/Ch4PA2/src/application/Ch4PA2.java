package application;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Ch4PA2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
		stage, "Brighter Circles", 600, 550 );
		
		final int DIAMETER = 50;
		final int X_START = 50;
		final int Y_START = 25;
		
		gc.setFill(Color.rgb(0,125,125));
		gc.fillOval(X_START, Y_START, 10 * DIAMETER, 10 * DIAMETER);
		gc.setFill(Color.rgb(25,150,150));
		gc.fillOval(X_START + DIAMETER, Y_START + DIAMETER, 8 * DIAMETER, 8 * DIAMETER);
		gc.setFill(Color.rgb(50,175,175));
		gc.fillOval(X_START + (2* DIAMETER), Y_START + (2 * DIAMETER), 6 * DIAMETER, 6 * DIAMETER);
		gc.setFill(Color.rgb(75,200,200));
		gc.fillOval(X_START + (3 * DIAMETER), Y_START + (3* DIAMETER), 4 * DIAMETER, 4 * DIAMETER);
		gc.setFill(Color.rgb(100,225,225));
		gc.fillOval(X_START + (4 * DIAMETER), Y_START + (4 * DIAMETER), 2 * DIAMETER, 2 * DIAMETER);

	
	}

	public static void main(String[] args) {
		launch(args);
	}

}
