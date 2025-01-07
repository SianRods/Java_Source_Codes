import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;


public class BorderLayoutPractice extends JFrame  {
	// NOW BASICS BECOME A FRAME SO CREATING OBJECT IS LIKE STARTING A NEW FRAME 
	BorderLayoutPractice(){
		setTitle("New Frame");
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		// setSize(new Dimension(500,500));
		setPreferredSize(new Dimension(500,500));
		// setSize(500,500); --> USE IF ANF ONLY IF THE FRAME DOES NOT HAVE THE LAYOUT MANAGER 
		// setResizable(false);

		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();

		// SETTING THE SIZE OF THE JPANELS 


		// SETTING THE BOUNDS IS VERY IMPORTANT AS IT HELPS US IN DEFINING A DEFINITIVE REGION FOR A GIVEN PANEL OVER THE GIVEN FRAME 
		j1.setBounds(0, 0, 500, 100);
		j2.setBounds(0, 100, 500, 100);
		j3.setBounds(0, 200, 500, 100);


		j1.setBackground(Color.WHITE );
		j2.setBackground(Color.red);
		j3.setBackground(Color.CYAN);

		j1.setLayout(new GridLayout(1,1,5,5));

		// SETTING THE LAYOUT OF THE THIRD PANEL TO GRIDLAYOUT AND THEN ADDING THE BUTTONS TO THE THIRD PANEL 
		j3.setLayout(new GridLayout(3,3,5,5));

		j3.add( new Button("1"));
		j3.add( new Button("2"));
		j3.add( new Button("3"));
		j3.add( new Button("4"));
		j3.add( new Button("5"));
		j3.add( new Button("6"));
		j3.add( new Button("7"));
		j3.add( new Button("8"));
		j3.add( new Button("9"));
		j3.add( new Button("EXIT"));



		// CREATING A JLABEL TO ADD THE TEXT AND THEN ADDING THE JALBEL TO ONE OF THE JPANEL 
		JLabel l1 = new JLabel();
		

		l1.setText("GUI USING SWING ");
		// SPECIFY THE BOUND FOR THE LBELING PANEL 
		// THE SYNTAX OF ADDING THIS USING THE JLABEL OBJECT TO DO SO
		l1.setHorizontalTextPosition(l1.CENTER);
		






		// ADDING THE LABEL TO THE PANEL 
		j1.add(l1);



		// AS THE LAYOUT OF THE GIVEN FRAME IS BORDERLAYOUT WE CAN SET THE ALIGNMENT OF THE JPANEL W.R.T BORDER 
		add(j1, BorderLayout.NORTH);
		add(j2,BorderLayout.CENTER);
		add(j3, BorderLayout.SOUTH);
	}

	public static void main (String args[]){
		new Basics();
	}
}
