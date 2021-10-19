package application;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ch4PA1 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
		stage, " ", 600, 400 );
		
		//set base size
		final int DIAMETER = 150;
		final int X_START = 90;
		final int Y_ROW_1 = 100, Y_ROW_2 = 160;
		final int SPACER = 20;
		
		//draw coins
		gc.setFill(Color.LIGHTGRAY);
		gc.fillOval( X_START, Y_ROW_1, DIAMETER, DIAMETER );
		gc.fillOval( X_START + DIAMETER + SPACER, Y_ROW_1, .6 * DIAMETER,
		.6 * DIAMETER );
		gc.fillOval( X_START + 1.6 * DIAMETER + (2 * SPACER), Y_ROW_1, .8 * DIAMETER,
		.8 * DIAMETER );
		
		//outline coins
		gc.strokeOval( X_START, Y_ROW_1, DIAMETER, DIAMETER );
		gc.strokeOval( X_START + DIAMETER + SPACER, Y_ROW_1, .6 * DIAMETER,
		.6 * DIAMETER );
		gc.strokeOval( X_START + 1.6 * DIAMETER + (2 * SPACER), Y_ROW_1, .8 * DIAMETER,
		.8 * DIAMETER );
		
		//add text
		Font text = new Font (18);
		gc.setFont(text);
		gc.setFill(Color.BLACK);
		gc.fillText("$.25", X_START + (.4 * DIAMETER), Y_ROW_2);
		gc.fillText("Quarter", X_START + 30, Y_ROW_2 + DIAMETER);
		gc.fillText("$.10", (2 * X_START) + (.6 * DIAMETER + SPACER), Y_ROW_2 - 15);
		gc.fillText("Dime", (2 * X_START) + (.6 * DIAMETER + SPACER), Y_ROW_2 + DIAMETER);
		gc.fillText("$.05", X_START + (2 * DIAMETER + SPACER), Y_ROW_2);
		gc.fillText("Nickel", X_START + (2 * DIAMETER + SPACER), Y_ROW_2 + DIAMETER);

	}

	public static void main(String[] args) {
		launch(args);
	}

}
