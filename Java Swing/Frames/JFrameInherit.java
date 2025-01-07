import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class JFrameInherit extends JFrame {
    public static void main(String args[]){
        //Write your code Here
        
    }

    // Creating a Constructor for the personalization of the JFrame 
    JFrameInherit(){
        this.setTitle("Enter Your Title : ");
        this.setVisible(true);
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(32,124,235)); 
        ImageIcon icon = new ImageIcon("Enter Your File Path/Name ");
        this.setIconImage(icon.getImage());

    }
}
