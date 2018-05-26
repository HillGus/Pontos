package main;

import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pontos {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.setSize(316, 339);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lbl = new JLabel();
		lbl.setBounds(0, 0, 300, 300);
		
		frame.add(lbl);
		
		frame.setVisible(true);
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {}
		
		Graphics2D g = (Graphics2D) lbl.getGraphics();
		
		g.drawLine(150,  150, 150 - getCA(100, 0), 150 - getCO(100, 0));
		g.drawLine(150,  150, 150 - getCO(100, 0), 150 + getCA(100, 0));	
		g.drawLine(150,  150, 150 + getCO(100, 0), 150 - getCA(100, 0));
		g.drawLine(150,  150, 150 + getCA(100, 0), 150 + getCO(100, 0));
		g.drawLine(150,  150, 150 - getCA(100, 45), 150 - getCO(100, 45));
		g.drawLine(150,  150, 150 - getCO(100, 45), 150 + getCA(100, 45));	
		g.drawLine(150,  150, 150 + getCO(100, 45), 150 - getCA(100, 45));
		g.drawLine(150,  150, 150 + getCA(100, 45), 150 + getCO(100, 45));
	}
	
	private static int getCO(int hypot, int ang) {
		
		return (int) (hypot * Math.sin(Math.toRadians(ang)));
	}
	
	private static int getCA(int hypot, int ang) {
		
		return (int) (hypot * Math.cos(Math.toRadians(ang)));
	}
	
}
