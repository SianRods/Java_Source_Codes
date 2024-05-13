import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;


public class Basics extends JFrame  {
	// NOW BASICS BECOME A FRAME SO CREATING OBJECT IS LIKE STARTING A NEW FRAME 
	Basics(){
		setTitle("New Frame");
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		// setSize(new Dimension(500,500));
		setPreferredSize(new Dimension(500,500));
		setSize(500,500);
		setResizable(false);

		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();

		// SETTING THE SIZE OF THE JPANELS 


		// SETTING THE BOUNDS IS VERY IMPORTANT AS IT HELPS US IN DEFINING A DEFINITIVE REGION FOR A GIVEN PANEL OVER THE GIVEN FRAME 
		j1.setBounds(0, 0, 500, 100);
		j2.setBounds(100, 100, 100, 100);

		j1.setBackground(Color.WHITE );
		j2.setBackground(Color.red);
		j3.setBackground(Color.CYAN);

		j1.setLayout(new GridLayout(1,1,5,5));



		// CREATING A JLABEL TO ADD THE TEXT AND THEN ADDING THE JALBEL TO ONE OF THE JPANEL 
		JLabel l1 = new JLabel();
		

		l1.setText("GUI USING SWING ");
		// THE SYNTAX OF ADDING THIS 
		l1.setHorizontalTextPosition(l1.CENTER);
		




		// ADDING THE LABEL TO THE PANEL 
		j1.add(l1);



		// AS THE LAYOUT OF THE GIVEN FRAME IS BORDERLAYOUT WE CAN SET THE ALIGNMENT OF THE JPANEL W.R.T BORDER 
		add(j1, BorderLayout.CENTER);
		add(j2);
		add(j3);
	}

	public static void main (String args[]){
		new Basics();
	}
}
