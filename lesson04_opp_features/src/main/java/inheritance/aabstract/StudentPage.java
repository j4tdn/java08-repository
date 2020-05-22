package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton btnClick = new JButton();
		btnClick.addMouseListener(new inheritance.aabstract.MouseEvent() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		JButton btnEnter = new JButton();
		btnEnter.addMouseListener(new MouseAdapter() {
			
		});

	}
}
