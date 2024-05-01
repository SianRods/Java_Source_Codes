
/*
 * In java panels are GUI components which are used to store others components
 * 
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.ImageIcon;

public class BasicsPanel {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("Panels in SWING ");
        // Adding all the JPANELS to the Frame as they are also a Component of SWING

        JLabel redLabel = new JLabel();
        redLabel.setText("This is Red Label ");

        JLabel greenLabel = new JLabel();
        redLabel.setText("This is green Label ");

        JLabel blueLabel = new JLabel();
        redLabel.setText("This is blue Label ");

        // Creating a Panel

        JPanel redPanel = new JPanel();
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setBackground(Color.RED);
        redPanel.add(redLabel);

        JPanel greenPanel = new JPanel();
        greenPanel.add(greenLabel);
        greenPanel.setBounds(250, 0, 250, 250);
        greenPanel.setBackground(Color.GREEN);

        JPanel bluePanel = new JPanel();
        bluePanel.add(blueLabel);
        bluePanel.setBounds(0, 250, 500, 500);
        bluePanel.setBackground(Color.blue);

        frame.add(greenPanel);
        frame.add(redPanel);
        frame.add(bluePanel);

        

    }
}
