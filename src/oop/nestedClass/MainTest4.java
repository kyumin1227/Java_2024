package oop.nestedClass;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainTest4 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InnerClassExample());
    }

}

class InnerClassExample extends JFrame {

    private String originalTitle = "Original Title";

    public InnerClassExample() {
        setTitle(originalTitle);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(new MouseEventHandler());

        setVisible(true);
    }

    class MouseEventHandler implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            setTitle("Mouse on");
        }

        public void mouseExited(MouseEvent e) {
            setTitle("Mouse off");
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // No action needed
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // No action needed
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // No action needed
        }
    }

}
