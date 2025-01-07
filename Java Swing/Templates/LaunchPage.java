import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LaunchPage {
    public static void main(String args[]) {
        new frameManage();
    }
}

class frameManage extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;

    frameManage() {


        // INIT FRAME
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        // this.setLayout(new GridLayout());
        this.setSize(500, 500);

        // INIT PANELS TO SPEEREATELY DISPLAY TEXT FEILDS AND THE BUTTONS SEPREATLEY
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // ADDING LABELS FOR THE USERNAME AND THE PASSWORD
        JLabel userLabel = new JLabel("USERNAME :");
        JLabel passLabel = new JLabel("PASSWORD :");

        username = new JTextField();
        password = new JPasswordField();

        JButton login = new JButton("Submit");
        JButton clear = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        // ADDING ALL THE TEXT FIELDS AND TEXT LABELS TO THE PANEL

        panel.add(userLabel);
        panel.add(passLabel);
        panel.add(username);
        panel.add(password);

        // ADDING BUTTONS TO SEPERATE BUTTONPANELS

        buttonPanel.add(exitButton);
        buttonPanel.add(login);
        buttonPanel.add(clear);

        add(panel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello");
    }
}
