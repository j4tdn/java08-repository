package java08.inheritance.aabstract;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentPage {
    public static void main(String[] args) {
        JButton buttonClick = new JButton();
        buttonClick.addMouseListener(new java08.inheritance.aabstract.MouseEvent() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        JButton buttonEnter = new JButton();
        buttonEnter.addMouseListener(new MouseAdapter() {
        });
    }
}
