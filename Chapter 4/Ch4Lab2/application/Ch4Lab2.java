package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ch4Lab2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Rhombus", 700, 400 );
		final int X = 350, Y = 175;
		final int X_LENGTH = 200, Y_LENGTH = 300;
		gc.setStroke( Color.NAVY );
		gc.strokeLine( X, Y - X_LENGTH / 2, X + Y_LENGTH / 2, Y );
		gc.strokeLine( X + Y_LENGTH / 2, Y, X, Y + X_LENGTH / 2 );
		gc.strokeLine( X, Y + X_LENGTH / 2, X - Y_LENGTH / 2, Y );
		gc.strokeLine( X - Y_LENGTH / 2, Y, X, Y - X_LENGTH / 2 );


	}

	public static void main(String[] args) {
		launch(args);

	}

}
