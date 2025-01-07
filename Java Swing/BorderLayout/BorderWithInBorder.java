import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Dimension;

public class BorderWithInBorder {
    public static void main(String args[]) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("This Frame ");
        // SETTING THE LAYOUT MANAGER OF THE FRAME
        // SETTING THE SPACE BETWEEN BORDERED LAYOUT IN PIXELS
        frame.setLayout(new BorderLayout(10, 10)); // Also has the attribute of placing at centre

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // SETTING THE SIZE OF THE PANELS USING SETPREFFEREDSIZE METHOD

        panel1.setPreferredSize(new Dimension(50, 50));
        panel2.setPreferredSize(new Dimension(50, 50));
        panel3.setPreferredSize(new Dimension(50, 50));
        panel4.setPreferredSize(new Dimension(50, 50));
        panel5.setPreferredSize(new Dimension(50, 50));

        // SETTING THE BACKGROUND COLOR OF THE PANELS

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.ORANGE);

        // ADDING TO FRAME AND DECIDING THE POSITION


        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);


        // ------------------------SECOND BORDERED LAYOUT -------------------
        // THIS IS ACHEIVED BY ADDING A PANEL WIHTIN A PANEL
        JPanel panel6 = new JPanel();
        panel6.setPreferredSize(new Dimension(50, 50));
        panel6.setBackground(Color.PINK);

        // ADDING TO THE PREVIOUS CENTRE PANEL 
        panel5.add(panel6,BorderLayout.CENTER);

    }
}
