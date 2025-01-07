import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

// JCHECKBOX --> IT IS A COMPONENT THAT CAN BE SELECTED OR UNSELECTED

public class JBox {
    public static void main (String args[]){
        new frame();
    }    
}


class frame extends JFrame implements ActionListener{
    JCheckBox box ;  //CHANGING ITS ACCESS
    frame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("CheckBoxes in SWING:");
        // SETTING UP THE DIMENSIONS IS ALSO IMPORTANT PART
        this.setPreferredSize(new Dimension(500,500));

        // CREATING A CHECKBOX 
        // SET FOCUSABLE TO FALSE IN ORDER TO REMOVE THAT ANNOYING BORDER 
         box = new JCheckBox();
        box.setFocusable(false);
        box.setText("I am Stupid!");
        box.setFont(new Font("SANS", Font.BOLD, 14));

        // ADDING AN ELEMETN OF THE ACTIONLISTNER IS IMPORTANT TO PASS VALUE TO ACTIONPERFORMED
        // ADDING CHECKBOX TO ACTION LISTENER
        box.addActionListener(this);

        // CREATING A BUTTON TO CHECK IF THE FIELD IS SELECTED OR NOT 

        this.add(box);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(box.isSelected()){
            System.out.println("Selected !");
        } else if (!(box.isSelected())){
            System.out.println("Unselected !");
        }
    }
}