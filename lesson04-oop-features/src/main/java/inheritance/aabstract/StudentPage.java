package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton buttonClick = new JButton();
		buttonClick.addMouseListener(new MouseEven() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		JButton buttonEnter = new JButton();
		buttonEnter.addMouseListener(new MouseAdapter() {
		});
	}

}
