
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class Wolrd {
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
        // this.setLayout(null);
        this.setVisible(true);

        but = new JButton();
        but.setText("Submit");
        but.setSize(200, 200);
        but.addActionListener(this);

        field = new JTextField(); // Initialize the field

        field.setFont(new Font("San Serif", Font.ITALIC, 12));
        field.setCaretColor(Color.white);
        field.setText("Your name ");
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 100, 100);
        panel.setBackground(Color.BLACK);

        this.add(panel);
        this.add(field);
        this.add(but);
    }

    public void actionPerformed(ActionEvent m) {
        if(m.getSource() == but) {
            System.out.println("Hello " + field.getText());
        }
    }
}
