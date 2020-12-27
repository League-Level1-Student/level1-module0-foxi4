package _08_jack_in_the_box;
//continue next time. ya
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JackInTheBox implements ActionListener {
	JFrame frame = new JFrame();
	JFrame window = new JFrame();
	JButton button = new JButton();
	int buttonClicked = 0;
	String imageAt5 = "jackInTheBox.png";

	public void showButton() {
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.setText("Surprise");
		button.addActionListener(this);
		window.setSize(500, 500);

	}

	// playing music rn so i probably cannot hear you sry
	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Button clicked");
		// TODO Auto-generated method stub
		buttonClicked++;

		if (buttonClicked == 5) {
			playSound("homer-woohoo.wav");
		}
	}

	public void showPicture(String fileName) {
		// used to be private void but I changed it since I wanted the runner to work dk
		// if it is right
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

}
