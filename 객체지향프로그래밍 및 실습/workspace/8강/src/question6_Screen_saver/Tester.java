package question6_Screen_saver;
import java.awt.Graphics;

import javax.swing.JFrame;
public class Tester {
	public static void main(String args[])
	{
		JFrame My_frame = new JFrame();
		My_frame.setSize(500, 500);
		My_frame.setTitle("Screen Saver");
		My_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Screen_saver saver = new Screen_saver();
		My_frame.add(saver);
		My_frame.setVisible(true);
	}
}
