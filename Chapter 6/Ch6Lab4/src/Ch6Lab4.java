import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Ch6Lab4 extends JFrame {

	public static void main(String[] args) {
		Ch6Lab4 frame = new Ch6Lab4();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setTitle("Spiraling circles");
	}
	
	public void paint(Graphics g) {
		int x = 300, y = 300;
		Circle c;
		Color toggleColor = Color.BLACK;
		
		for(int diameter = 300; diameter >= 10; diameter -= 10)
		{
			c = new Circle(x - diameter/2, y - diameter/2,diameter,toggleColor);
			c.draw(g);
			x = x -20;
			y = y - 20;
			diameter = diameter - 10;
			if(toggleColor.equals(Color.BLACK))
			toggleColor = Color.GREEN;
			else if(toggleColor.equals(Color.GREEN))
			toggleColor = Color.BLUE;
			else if(toggleColor.equals(Color.BLUE))
			toggleColor = Color.RED;
			else
			toggleColor = Color.BLACK;
		}
	}
}
