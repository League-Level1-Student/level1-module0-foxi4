package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	 JButton button = new JButton();
	   
    public void showButton() {
        System.out.println("Button clicked");
 	   frame.setVisible(true);
 	  frame.add(button);
 	  button.setText("Click me to get your special message~");
	    frame.pack();
	    button.addActionListener(this);

   }

	@Override
	public void actionPerformed(ActionEvent e) {
	    int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "Love can last a lifetime, if you want it to.");
		}
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "You will survive the next day. :)");
		}
		if(rand==2) {
			JOptionPane.showMessageDialog(null, "One smile and wink will make someones day.");
		}
		if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will become great if you believe in yourself.");
		}
		if(rand==4) {
			JOptionPane.showMessageDialog(null, "The greatest risk is not taking one.");
		}
		JOptionPane.showMessageDialog(null, "ya thats your fortune. Woohoo.");
		// TODO Auto-generated method stub
		
	}
}