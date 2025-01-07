import javax.swing.JFrame;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

// Implementing the JFrame using GUI

public class revise extends JFrame {
    revise() {
        this.setTitle("C++ Tutorials ");
        this.setVisible(true);
        this.setSize(420, 420); // Setting the Size to 420 px in X Direction and 420 px in Y
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        // Creating an ImageIcon component
        ImageIcon image = new ImageIcon("c++.jpeg");
        this.setIconImage(image.getImage());// icon_object.getImage(); --> Method is Used
        // Personalized Back Ground Color
        // Note that only certain colors can be set using "Color.name" --> Format
        // In order to set personalised pass arguments to Color constructor
        // Those arguments can be hex or rgb values
        // We have to use method chaining 
        this.getContentPane().setBackground(Color.BLACK);
    }

    public static void main(String args[]) {
        // Calling this Method
       
       
        new revise();
    }
}
