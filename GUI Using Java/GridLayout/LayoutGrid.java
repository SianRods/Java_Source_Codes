// PLACES ALL THE COMPONENETS OF A FRAME IN A GRID 
// EACH COMPONENT TAKES ALL THE AVAILABLE SPACE WITHIN ITS CELL 
// EACH CELL IS OF THE SAME SIZE 
// USEFUL FOR APPS LIKE CALCULATOR AND TIC-TAC-TOE
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LayoutGrid {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        // SEPCIFYING NUMBER OF ROWS, COLOUMNS , DIST BETWEEN EACH BUTTON
        frame.setLayout(new GridLayout(3,3,10,10)); 

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        
    }
}
