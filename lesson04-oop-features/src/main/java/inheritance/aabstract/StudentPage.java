package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton buttonClick = new JButton();
		buttonClick.addMouseListener(new inheritance.aabstract.MouseEvent() {

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * buttonClick.addMouseListener(new inheritance.aabstract.MouseEvent() { //
		 * MouseEvent la class con cua MouseListener -> truyen duoc
		 * 
		 * @Override public void mouseClicked(MouseEvent e) { // khong bat buoc // TODO
		 * Auto-generated method stub super.mouseClicked(e); } });
		 */

		JButton buttonEnter = new JButton();
		buttonEnter.addMouseListener(new MouseAdapter() {
		});
	}
}
