import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioBut {
    public static void main(String args[]) {
        new frame();
    }
}

class frame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton hamburger;
    JRadioButton shwarma;
    ButtonGroup grp;

    frame() {
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500, 500));

        pizza = new JRadioButton("Pizza");
        hamburger = new JRadioButton("HamBurger");
        shwarma = new JRadioButton("Shwarma");

        // ADDING ALL THE JRADIO BUTTONS IN THE SINGLE GROUP

        grp = new ButtonGroup();

        // ADDING ALL THE RADIO BUTTONS TO THE BUTTONGROUPING
        grp.add(hamburger);
        grp.add(pizza);
        grp.add(shwarma);

        // ADDING ALL THE COMPONENTS TO THE FRAME

        this.add(pizza);
        this.add(hamburger);
        this.add(shwarma);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == grp) {
            System.out.println("Hello World !");
        }
    }
}
