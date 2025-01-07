import javax.swing.*;
import javax.swing.plaf.TreeUI;

import java.awt.event.*;
import java.awt.*;

// DOES THE WORK OF ADDING COMPONENTS IN THE FORM OF A 3RD DIMENSION
// WE SET BOUNDS WHEN WE DONT USE A LAYOUT MANAGER 
// SOMETIMES WHEN THINGS ARE NOT VISIBLE ITS IS DUE TO NO ACTIVE LAYOUT MANAGER OR 
//  DUE TO NO SPECIFIED BOUNDS SET FOR THE COMPONENTS OF THE FRAME 

public class ZDimension {
    public static void main (String args[]){

        JLayeredPane layerPane = new JLayeredPane();
        layerPane.setBounds(0,0,500,500); // HAVE TO USE AS THERE ARE NO LAYOUTMANAGERS ACTIVELY BEING USED

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.setBackground(Color.RED);
        panel1.setBounds(120,230,230,230);
        panel2.setBackground(Color.BLUE);
        panel2.setBounds(200,330,230,230);
        panel3.setBackground(Color.GREEN);
        panel3.setBounds(100,200,230,230);

        // ADDING ALL THE PANELS TO JLAYERED PANE 

        layerPane.add(panel1,JLayeredPane.DEFAULT_LAYER);
        layerPane.add(panel2 , JLayeredPane.DRAG_LAYER);
        layerPane.add(panel3 , JLayeredPane.DRAG_LAYER);

        // CAN BE DONE BY USING WRAPPER CLASSES 

        // layerPane.add(panel1,Integer.valueOf(0));
        // layerPane.add(panel2 , Integer.valueOf(2));
        // layerPane.add(panel3 , Integer.valueOf(2));




        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.add(layerPane);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null); // WE HAVE TO SET IT TO NULL IN ORDER TO USE JLAYEREDPANE
        frame.setPreferredSize(new Dimension(500,500));

    }
}
