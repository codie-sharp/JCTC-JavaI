package application;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Ch4Lab1 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
		stage, "Olympic Rings", 700, 400 );
		
		final int DIAMETER = 100;
		final int X_START = 200;
		final int Y_ROW_1 = 100, Y_ROW_2 = 160;
		final int SPACER = 10;
		
		gc.setStroke( Color.BLUE );
		gc.strokeOval( X_START, Y_ROW_1, DIAMETER, DIAMETER );
		gc.setStroke( Color.BLACK );
		gc.strokeOval( X_START + DIAMETER + SPACER, Y_ROW_1, DIAMETER,
		DIAMETER );
		gc.setStroke( Color.RED );
		gc.strokeOval( X_START + 2 * ( DIAMETER + SPACER ), Y_ROW_1,DIAMETER,
		DIAMETER );
		gc.setStroke( Color.YELLOW );
		gc.strokeOval( X_START + DIAMETER / 2, Y_ROW_2, DIAMETER, DIAMETER );
		gc.setStroke( Color.GREEN );
		gc.strokeOval( X_START + DIAMETER / 2 + DIAMETER + SPACER, Y_ROW_2,
		DIAMETER, DIAMETER );
		gc.setFill( Color.BLUE );
		gc.fillText( "The Olympic Rings",X_START + DIAMETER,Y_ROW_2 + 1.5 *
		DIAMETER );
	}

	public static void main(String[] args) {
		launch(args);
	}

}
