import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Gameinterface extends JFrame {
	public static Container c = null;
	public static JFrame jf = null;
	public static Image img = null;
	public static JLabel food = null;
	public static SThread xc = null;

	public static void main(String args[]) {
		Gameinterface.jf = new JFrame();
		Gameinterface.c = Gameinterface.jf.getContentPane();
		new Gameinterface();
		Gameinterface.c.setLayout(null);
		Gameinterface.jf.setBounds(300, 100, 608, 629);
		Gameinterface.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gameinterface.jf.setResizable(false);
		Gameinterface.jf.setIconImage(img);
		Gameinterface.jf.addKeyListener(new MyKeyListener());
		Gameinterface.c.add(food);
		
		new Initial();
		
		Gameinterface.jf.setVisible(true);
		
		xc=new SThread();
		xc.start();
	}

	public Gameinterface() {
		java.net.URL imgURL = Frame.class.getResource("/chi.png");
		ImageIcon imgIcon = new ImageIcon(imgURL);
		img = imgIcon.getImage();

		Graphic gp = new Graphic(false);
		food = new JLabel(gp);
	}
}
