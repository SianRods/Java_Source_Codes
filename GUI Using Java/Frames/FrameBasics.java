import java.awt.Color;  //Used to change the background color of the frame
import javax.swing.ImageIcon;  // Used for using personal imageicon 
import javax.swing.JFrame;  // Importing the Jframe class 

public class FrameBasics{
    public static void main(String args[]){

        // Creating an Instance of the JFrame
        JFrame frame = new JFrame();
        frame.setTitle("This is the JFrame Title "); // Sets the titile of the JFrame
        frame.setVisible(true); //Makes the Frame visible 
        frame.setSize(420,420); // Gives the Dimension to the Frame
        // On clicking the X - Button the Jframe does not by defoult closes we need to 
        // set the value so that it closes on clicking the X --> Button

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of Application and click the task 
        // By default the value of close is --> TO RUN IN BACKGROUND
        // We can Also set do nothing on close 

        //We can prvent Jframe from being resized 
        frame.setResizable(true);

        // Creating a personalized ImageIcon for our frame 
        // We first need to import the image icon package and then 
        // pass file name or file path to the contructor of the class 
        ImageIcon icon = new ImageIcon("Git-Logo-2Color.png"); // Create Image Icon
        
        frame.setIconImage(icon.getImage()); // Adds the icon component to  the frame 

        //Setting Custom Background color 
        // Concept of Method Chaining is used here 
        // Here we can use some defoult colors or create custom colors using RGB Or HEX Values

        //  frame.getContentPane().setBackground(Color.black /*Concept of Class Variable is used here */);
        // Using the RGB Values 
        //Below we are creating an instance of the class color by using the new keyword within the setBackground(); Method 
        frame.getContentPane().setBackground(new Color(32,124,235)); 
        //rgb values are on range from 0 to 255;

    }
}

/*
 * 1). There are two ways to implement the Jframe in java First is by creaating the instance of the 
 * frame and then using the methods
 * 
 * 2).In this way we extends the JFrame as the parent class and create a child class called as my 
 * Frame or with any other name and then create a constructor for the child class so that we can 
 * customise attributes such as title , image icon , background color ,etc.
 * 
 * 
 * 
 * 
 */