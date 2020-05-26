package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class StudentPage {
	public static void main(String[] args) {
		JButton jButton = new JButton();
		jButton.addMouseListener(new inheritance.aabstract.MouseEvent() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JButton button = new JButton();
		button.addMouseListener(new MouseAdapter() {});
		
		JButton jButtonEnter =  new JButton();
		jButtonEnter.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("Enter click ...");
			}
		});
	}
}
