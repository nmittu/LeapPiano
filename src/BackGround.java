import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackGround extends JPanel {
	Image img;
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
	}
}
