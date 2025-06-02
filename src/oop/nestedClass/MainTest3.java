package oop.nestedClass;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainTest3 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NonInnerClassExample());
    }

}

class NonInnerClassExample extends JFrame {

    private String originalTitle = "Original Title";

    public NonInnerClassExample() {
        setTitle(originalTitle);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(new ExternalMouseEventHandler(this));

        setVisible(true);
    }

    public void updateTitle(String newTitle) {
        setTitle(newTitle);
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

}

class ExternalMouseEventHandler implements MouseListener {
    private NonInnerClassExample frame;

    public ExternalMouseEventHandler(NonInnerClassExample frame) {
        this.frame = frame;
    }

    public void mouseEntered(MouseEvent e) {
        frame.updateTitle("Mouse on");
    }

    public void mouseExited(MouseEvent e) {
        frame.updateTitle("Mouse off");
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}