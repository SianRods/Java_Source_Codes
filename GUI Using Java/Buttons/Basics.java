import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent; // Needed in order to handle the Action Performed
// Implement the ActionListener 
import java.awt.event.ActionListener; // Listens to the Action Performed 
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

// Implementing the Actionlistener to get the Logic Behind Button/Source Event 
// And this Handling is called as Event Handling just like Frontend and the Backend 
public class Basics implements ActionListener,MouseMotionListener {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setTitle("Learning JButton ");
        // ADDING THE BUTTON COMPONENT TO ME FRAME

        // METHODS OF JBUTTON COMPONENT
        JButton myBut = new JButton();
        myBut.setBounds(250, 250, 100, 50);
        myBut.setText("Use Me !");
        myBut.addMouseMotionListener(new Basics() /*Adding the Frame to be Worked with */);
        myBut.addActionListener(new Basics());
        frame.add(myBut);
        

    }

    /* It is important to note that the actionPerformed Method Should be overridden 
        outside the main method also the actionlistener component should be added to the 
        the button for the events of button to be recorder for the given frame 
    
     */
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            System.out.println("You have Succefffully handled an Event ");
        }
    }


    // Overriding the MouseMotion Listener 
     
    public void mouseMoved(MouseEvent m){
        if(m.getX()==500){
            System.out.println("Your mouse is on 500 x  coordinate !!");
        }
    }
    public void mouseDragged(MouseEvent m){
        System.out.println("Hello !!");
    }
}