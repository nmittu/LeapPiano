import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class RectPanel extends JPanel {
	private int x[];
	private int y[];
	private boolean first;

	public RectPanel() {
		x = new int[0];
		y = new int[0];
		first = true;
		repaint();
	}

	public void paint(Graphics g) {
		g.setColor( new Color(0,0,0,0) );
        g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
		for (int i = 0; i < x.length; i++) {
			g.setColor(Color.red);
			g.drawRect(x[i], y[i], 10, 10);
		}
	}

	public void setCoord(int x[], int y[]) {
		this.x = x;
		this.y = y;
	}
}
