import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.plaf.TreeUI;

// Implementing the JFrame using inheritance 
public class reviseLabel {
    public static void main(String args[]) {

        JFrame myFrame = new JFrame();
        myFrame.setTitle("C++ Tutorials :");
        myFrame.setVisible(true);
        myFrame.setSize(420, 420);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        // ImageIcon logo = new ImageIcon("Git-")

        JLabel label = new JLabel();
        label.setText("Welcome to First Class : OOPS !");
        /*
         * When we use label --> it also does the work of combining two or more
         * components together in Swing hence
         */
        ImageIcon panelimage = new ImageIcon("Cat.jpg");

        // Creating an Image using the ImageIcon Component
        // Adding it to Label so to display it on the Screen
        label.setIcon(panelimage);

        // Adding the label to the Frame
        // add() --> is the method which is used to add Componenets to the Frame of
        // SWING

        myFrame.add(label);
        
        // In order to Align only TEXT part of the Label use :-
        label.setVerticalTextPosition(label.VERTICAL);
        label.setHorizontalTextPosition(label.CENTER);


        // In order to properly align all the Components in the Label w.r.t 
        //  resizing

        label.setHorizontalAlignment(label.CENTER);

        // Changing the Font Styles 
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setFont(new Font("San Serif", Font.BOLD, 20));
        
        

    }

}
