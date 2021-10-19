import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Container;

public class Ch4Lab3 extends JFrame {
	
	public Ch4Lab3() {
		
	 Container c = getContentPane();
	 c.setBackground(Color.RED);
	 setSize(400,400);
	 setTitle("Star");
	 setVisible(true);
	}

	public void paint(Graphics g) {
	
	super.paint(g);
	g.setColor(Color.BLUE);
	Polygon star = new Polygon();
	star.addPoint(125,125);
	star.addPoint(200,115);
	star.addPoint(225,50);
	star.addPoint(250,115);
	star.addPoint(325,125);
	star.addPoint(275,165);
	star.addPoint(285,230);
	star.addPoint(225,190);
	star.addPoint(165,230);
	star.addPoint(175,165);
	star.addPoint(125,125);
	g.fillPolygon(star);
	g.drawString("This is a star", 175, 265);
	}

	
	public static void main(String[] args) {
	
	new Ch4Lab3();
	}

}
