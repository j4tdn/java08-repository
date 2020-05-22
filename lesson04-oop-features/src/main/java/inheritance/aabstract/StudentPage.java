package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton buttonClick = new JButton();
		buttonClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clicking...");
			}
		});

		JButton buttonEnter = new JButton();
		buttonClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entering...");
			}
		});
	}
}
