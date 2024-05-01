import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
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
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        // this.setLayout(null);

        but = new JButton();
        but.setText("Submit");
        but.setSize(200, 200);
        but.addActionListener(this);

        field.setFont(new Font("San Serif", Font.ITALIC, 12));
        field.setCaretColor(Color.white);
        field.setText("Your name ");


        this.add(field);
        this.add(but);
    }

    public void actionPerformed(ActionEvent m) {
        if(m.getSource() == but) {
            System.out.println("Hello" + field.getText());
        }
    }
}