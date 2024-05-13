import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

	
public class LoginForm extends JFrame implements ActionListener {

	JButton submit;
	JButton clear;
	JTextField username;
	JPasswordField password;

	LoginForm(){
		setTitle("LOGIN FORM ");
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		// using the gridlayout and adding the 5 panels sepreatley 
		setLayout(new GridLayout(3,1,2,2));
		setPreferredSize(new Dimension(250,250));

		// CREATING 4 PANELS 
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();
		// JPanel j4 = new JPanel();

		j1.setBackground(Color.PINK);
		j2.setBackground(Color.PINK);
		j3.setBackground(Color.PINK);
		// j4.setBackground(Color.PINK);
		
		// ADDING TEXTFIELD SEPERATLY TO BOTH THE PANELS 

		 username = new JTextField();
		username.setFont(new Font("Arial Bold ", 12, 12));
		username.setPreferredSize(new Dimension(250, 25));


		JLabel USERNAME_LABEL = new JLabel();
		USERNAME_LABEL.setFont(new Font("sans serif ", Font.BOLD, 14));
		USERNAME_LABEL.setText("ENTER YOUR USERNAME : ");
		USERNAME_LABEL.setHorizontalTextPosition(JLabel.LEFT);

		
		
		 password = new JPasswordField();
		password.setFont(new Font("Arial Bold ", 12, 12));
		password.setPreferredSize(new Dimension(250, 25));

		
		JLabel PASS_LABEL = new JLabel();
		PASS_LABEL.setFont(new Font("sans serif ", Font.BOLD, 14));
		PASS_LABEL.setText("ENTER YOUR PASSWORD : ");
		PASS_LABEL.setHorizontalTextPosition(JLabel.LEFT);



		 submit = new JButton();
		submit.setText("SUBMIT");
		submit.addActionListener( this);


		 clear = new JButton();
		clear.setText("CLEAR");
		clear.addActionListener(this);


		// adding the buttons to the third panels 

		j3.add(submit , JPanel.CENTER_ALIGNMENT);
		j3.add(clear, JPanel.RIGHT_ALIGNMENT);


		// ADDING THE TEXTFIELDS TO THE PANELS 
		j1.add(USERNAME_LABEL, JPanel.LEFT_ALIGNMENT); // ALIGNING THE TEXT FIELD TO THE LEFT SIDE OF THE BAR
		j1.add(username , JLabel.RIGHT_ALIGNMENT);

		j2.add(PASS_LABEL,JPanel.LEFT_ALIGNMENT);
		j2.add(password , JPanel.RIGHT_ALIGNMENT);



		// ADDING THE PANELS TO THE FRAME IN SPECIFIED ORDER 
		add(j1);
		add(j2);
		add(j3);
		// add(j4);


	}

	public static void main (String args []){
		new LoginForm();
	}




	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == submit){
			System.out.println("Hello");
			String user = "Sian";
			String pass = " pass";
			JOptionPane.showMessageDialog(null,"Hello World ","Dialog Box ",JOptionPane.INFORMATION_MESSAGE);

			if(username.getText().equals(user) && password.getPassword().equals(pass)){
				System.out.println("SUCCESSFULLY LOGGED IN !");
			}
		}
	}
}
