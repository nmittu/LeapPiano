import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackGround extends JPanel {
	Image img;

	ArrayList<Integer> cX = new ArrayList<>();
	ArrayList<Integer> cY = new ArrayList<>();

	public BackGround() {
		try {
			img = ImageIO.read(RectPanel.class.getResourceAsStream("resources/Piano.jpg")).getScaledInstance(
					(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
					(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight(), Image.SCALE_SMOOTH);
		} catch (HeadlessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
	}

	public void paint(Graphics g) {
		try {
			g.drawImage(img, 0, 0, null);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < cX.size(); i++) {
			g.setColor(Color.green);
			g.fillOval(cX.get(i), cY.get(i), 50, 50);
		}
	}

	public void addCircle(int x, int y) {
		cX.add(x);
		cY.add(y);
	}

	public void removeCircle(int x, int y) {
		cX.remove(cX.indexOf(x));
		cY.remove(cY.indexOf(y));
	}
}
