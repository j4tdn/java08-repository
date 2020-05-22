package inheritance.aabstract;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	
        JButton buttonClick2 = new JButton();
        buttonClick2.addMouseListener(new MouseAdapter() {
		}); 
		
	JButton buttonEnter = new JButton();
	buttonEnter.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("Entering.......");
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	} );        
}
}
