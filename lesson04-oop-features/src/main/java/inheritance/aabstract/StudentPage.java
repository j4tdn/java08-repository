package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton buttonClick = new JButton();
		buttonClick.addMouseListener(new inheritance.aabstract.MouseEvent() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton buttonEnter = new JButton();
		buttonEnter.addMouseListener(new MouseAdapter(){
		});
	}
}
