import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import com.leapmotion.leap.*;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		JFrame window = new JFrame();
		window.setTitle("Piano");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setUndecorated(true);
		window.setVisible(true);
		
		JLayeredPane lp = window.getLayeredPane();
		
		BackGround backGround = new BackGround();
		backGround.setBounds(new Rectangle(0, 0, window.getWidth(), window.getHeight()));
		
		lp.add(backGround, new Integer(1));
		
		RectPanel panel = new RectPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color(0,0,0,0));
		panel.setBounds(new Rectangle(0, 0, window.getWidth(), window.getHeight()));
		lp.add(panel, new Integer(2));
		
		
		SampleListener listener = new SampleListener(panel);
		Controller controller = new Controller();
		
		controller.addListener(listener);
		
		
		System.out.println("Press Enter To End");
		
		try{
			System.in.read();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		controller.removeListener(listener);
	}
}
