import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.*;
import java.awt.event.*;

public class goo {
 public static void main(String args[]){
    frame myframe = new frame();
 }

}

class frame extends JFrame implements ActionListener {
    JButton but;
    JTextField field;

    frame() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        but = new JButton();
        but.setText("Submit");
        but.setSize(50, 50);
        but.addActionListener(this);
        

        field= new JTextField();
        field.setSize(getPreferredSize());
        field.setFont(new Font("San Serif", Font.ITALIC, 12));
        field.setCaretColor(Color.white);
        field.setText("Your name ");
        field.setSize(new Dimension(50,50));
        
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 50, 50);
        panel.setBackground(Color.BLUE);
        panel.add(field);
        panel.add(but);

        this.add(panel);
       
    }

    public void actionPerformed(ActionEvent m) {
        if(m.getSource() == but) {
            System.out.println("Hello" + field.getText());
        }
    }
}