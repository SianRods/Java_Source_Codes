import javax.swing.*; // ALL PACKAGES RELATED TO SWING 
import java.awt.*; // ALL PACKAGES RELATED TO AWT 
import java.awt.event.*; //ALL PACKAGES RELATED TO EVENT HANDLING 
import java.util.concurrent.Flow;

// -------------------USE CASE---------------------------------------------- 
// PLACES COMPONENTS IN A ROW , SIZED AT THEIR PREFFERED SIZE 
//  IF THE HORZONTAL SPACE IN THE CONTAINER IS TOO SMALL 
//  THE FLOWLAYOUT CLASS USES THE NEXT AVAIALBLE ROW 
// DEFAULT_LAYOUT_MANAGER_FRAMES --> BORDER_LAYOUT  
// DEFAULT_LAYOUT_MANAGER_PANELS--> FLOW_LAYOUT


public class flowLayout {
    public static void main (String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new FlowLayout());
        // frame.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));
        // USING ABOVE SPACING AND DEFAULT ALIGNMENT CAN BE CONTROLLED 

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        // DEFAULT --> THE BUTTONS WILL BE CENTRED ALIGN
        // TO CHANGE PASS ARGUMENTS TO THE FLOWLAYOUT 
    }
}
