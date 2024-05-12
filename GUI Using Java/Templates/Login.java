import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    public static void main(String args[]) {
        new frame();
    }
}

class frame extends JFrame implements ActionListener {
    JButton but;

    frame() {
        this.setVisible(true);
        this.setPreferredSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        // LAYOUT SHOULLD BE GRID LAYOUT WITH NUMBER OF COLOUMNS AND ROWS SSPECIFIED
        this.setLayout(new GridLayout(2, 2, 10, 10)); // SPECIFYING THE ROWS , COLOUMNS , GAP BETWEEN GRID BLOCKS
        // SET THE PREFFERED SIZE FOR THE LAYOUT
        this.setPreferredSize(new Dimension(500, 500));

        JTextField username = new JTextField();
        username.setFont(new Font("sans serif", Font.BOLD, 14));
        JLabel label = new JLabel();
        JTextField pass = new JTextField();
        pass.setFont(new Font("sans serif", Font.BOLD, 14));
        JPanel panel = new JPanel();

        username.setText("Enter Username");
        panel.add(username);

        pass.setText("Enter Password ");

        panel.setBackground(Color.BLUE);
        panel.add(pass);

        // label.setText("USERNAME :/n"+"PASSWORD:");

        // ADDING LABEL TO PANEL

        panel.add(label);

        // CREATING A JBUTTON
        but = new JButton();
        but.addActionListener(this);
        but.setText("Submit");
        but.setFocusable(false);
        // but.setLayout();

        // ADDING PANEL TO THE FRAME
        this.pack();
        this.add(panel);
        this.add(but);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but) {
            new newWindow(); // LAUNCH A NEW WINDOW
        }

    }
}

class newWindow extends JFrame {

    newWindow() {
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 500));

        // SETTING LAYOUT MANAGER TO NULL
        this.setLayout(null);
        this.setTitle("Successfully Logged IN !");

        JLabel label = new JLabel();
        label.setText("You have Successfully Logged in !");
        label.setBackground(Color.BLACK);
        label.setFont(new Font("sans serif", Font.BOLD, 14));
        label.setForeground(Color.WHITE);

        this.add(label);
        this.pack();

    }
}