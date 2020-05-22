package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton buttonClick = new JButton();// new 1 nut trong java
		
		buttonClick.addMouseListener(new inheritance.aabstract.MouseEvent() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});// tao su kien cho nut

		JButton buttonEnter = new JButton();
		buttonEnter.addMouseListener(new MouseAdapter() {
		});
	}
}
