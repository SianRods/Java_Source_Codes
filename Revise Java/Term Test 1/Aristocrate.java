
import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;


class Aristocrate extends JFrame implements ActionListener{

	Aristocrate(){
		setVisible(true);
		setTitle("New Frame ");
		setResizable(true);
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(500,500));

	}

	public static void main (){
		new Aristocrate();
	}

	// IMPLEMENTING THE METHODS OF THE CLASS ACTIONLISTENER

		
}