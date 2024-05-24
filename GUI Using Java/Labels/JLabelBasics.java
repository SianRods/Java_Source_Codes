// JLabel --> is a GUI Display Area for a string of text , an image or both ;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class JLabelBasics{
    public static void main(String args[]){
        // Creating an instance of the JFrame
        JFrame frame = new JFrame();
        // Setting up the frame initially
        frame.setTitle("Using the Labels !");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        // Creating an Instance of the JLabel Class 
        JLabel label = new JLabel();  // We can also pass the test to the contructor directly 
        // Setting the text using labels method
        label.setText("Hello World ");
        //  It is important to set the Text in the Frame 
        frame.add(label);
        // By Default the App tries to align it towards the left most side Center 

        // Setting an Image using the image icon 
        ImageIcon icon = new ImageIcon("Git-Logo-2Color.png");
        // Now we have created the ImageIcon 'icon' lets add that to the label 
        
        label.setIcon(icon);

        //  While using the Icon in SWING with the help of labels all the text in the labels 
        // are by default adjusted with respect to the icon and hence we can 
        // realign them *w.r.t icons using certain methods 

        //  Alignment HoRIZONTAL AND VERTICAL W.R.T Icon in SWING 
        label.setHorizontalTextPosition(JLabel.CENTER);
        // Now the text will be aligned left with respect to the icon 
        // Note for the purpose of alignment there are only three possible settings CENTRE,LEFT,RIGHT --> FOR LABELS 
        // here the CENTRE and the TOP are the final Static variables
        label.setVerticalTextPosition(JLabel.TOP);

        // Customizing the TEXT_FONT_STYLE & TEXT_COLOR
        // We are passing the Values to the Constructors of the Class Color and Font respectively 
        // without creating an unecessary instance of the class 
        label.setForeground(new Color(255,0,0)); // Using the Red Colour 
        label.setFont(new Font("Sans Serif",Font.BOLD,45));

        // Setting Gap between our photo icon and the Text aligned 
        label.setIconTextGap(20);

        // SET_BACKGROUND_COLOR 
        // In order to set the background color we need to follow up with two consecutive methods of the label 
        label.setBackground(Color.black); // Here we define the backgorund color only 'Define'
        label.setOpaque(true); // Here we display the background color with the help of the boolean values

        // Remarks  
        // It is important to note that when we declare a label ; The Entire Window is Considered as the Label
        // Hence we can also Border the Label as Well as we can align all the labels like images and texts all 
        //  in one with respect to the label border 
        //  Mostly "Label Border == Window Border of the GUI"  --> WHEN WE USE DEFAULT LAYOUT MANAGER 

            Border border = BorderFactory.createLineBorder(Color.BLUE);
            
            // Using the Border Object
            label.setBorder(border);
            // Algining all the label elements together with respect to the border of the Label/Window
            label.setVerticalAlignment(JLabel.TOP);
            label.setHorizontalAlignment(JLabel.CENTER);
        
        // More about the layouts will be covered in the LAYOUT_TOPIC_JAVA
    }
}