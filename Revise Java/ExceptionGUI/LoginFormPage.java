import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class LoginFormPage extends JFrame implements ActionListener {
	JTextField username ;
	JPasswordField pass;
	JButton submit ;
	JButton clear;

	public LoginFormPage(){
		setVisible(true);
		setLayout(new GridLayout(2,1,10,10));
		// setPreferredSize(new Dimension(500,500));
		setPreferredSize(new Dimension(500,500));
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		// getContentPane().setBackground(Color.WHITE);

		JPanel upperPanel = new JPanel();
		upperPanel.setBounds(0,0,500,250);
		upperPanel.setBackground(Color.RED);

		JPanel lowerPanel = new JPanel();
		upperPanel.setBounds(0,250,500,250);
		upperPanel.setBackground(Color.pink);

		username = new JTextField();
		username.setPreferredSize(new Dimension(150,25));
		upperPanel.add(username, JPanel.RIGHT_ALIGNMENT);

		submit = new JButton("Submit");
		submit.setFocusable(false);
		submit.addActionListener(this);

		pass = new JPasswordField();
		setPreferredSize(new Dimension(150,25));

		clear = new JButton("Clear ");
		clear.addActionListener(this);

		lowerPanel.add(pass, JPanel.RIGHT_ALIGNMENT);
		lowerPanel.add(clear, JPanel.LEFT_ALIGNMENT);
		upperPanel.add(submit, JPanel.LEFT_ALIGNMENT);

		add(lowerPanel);
		add(upperPanel);

	}

	public static void main (String args[]){
		new LoginFormPage();
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == submit){
			System.out.println("Hello World !!");
		}

	}
	
}
