// JPanel --> is a GUI Component which functions as a Container to hold other components 
// It acts in a similar way as compared to that of Divisions in CSS/HTML 
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelBasics {
   
    public static void main(String args[]){
        
        // Initializing out Frame Using Instance Variable
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // We are not using any layout 
        frame.setSize(500,500);
        
        
        // Creating three sepreate panel red , blue , green respect using the instance variable 
        JPanel redPanel = new JPanel();
        JPanel bluePanel  = new JPanel();
        JPanel greenPanel = new JPanel();

        // Set the Color 
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Set the panel dimensions for the red panel 
        redPanel.setBounds(0, 0, 250, 250);

        // Set the panel for blue 
        bluePanel.setBounds(250, 0, 250, 250);

        // Set the panel for green 
        greenPanel.setBounds(0, 250, 500, 250);

        //  It is important to add all the features to the frame after creating the JPanel instances     
         // Add all the below frame features 
         frame.add(redPanel);
         frame.add(bluePanel);
         frame.add(greenPanel);
    }
    
}