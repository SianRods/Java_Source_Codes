import javax.swing.*;
public class DialogBox {
	public static void main(String args[]){
		JOptionPane.showMessageDialog(null,"Hello World ","Dialog Box ",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"You Have Successfully Logged In !","Dialog Box ",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello World ","Dialog Box ",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello World ","Dialog Box ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello World ","Dialog Box ",JOptionPane.PLAIN_MESSAGE);

		// IMPORTANT TO NOTE THAT THE DIALOG BOXES CAN WORK INDEPENDENTLY AND DOES NOT NEED TO BE ADDED TO A FRAME 
	}
}
