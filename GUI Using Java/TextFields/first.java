
// JTextFiled is a GUI TextBox component that can be used to add, get or set text 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class first {
    public static void main(String args[]) {
        frame myFrame = new frame();

    }

}

class frame extends JFrame implements ActionListener {
    JTextField field;
    JButton but;

    frame() {

        this.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(getPreferredSize());

        field = new JTextField();
        field.setSize(new Dimension(250, 40));

        but = new JButton();
        but.setText("Submit");
        but.addActionListener(this);
        but.setSize(new Dimension(10, 10));
        but.setAlignmentX(BOTTOM_ALIGNMENT);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 250, 250);
        panel.add(but);
        panel.add(field);

        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but) {
            System.out.println("Hello " + field.getText());
        }

    }
}