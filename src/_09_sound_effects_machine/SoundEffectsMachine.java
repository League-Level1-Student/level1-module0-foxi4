package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JFrame window = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	   JPanel panel = new JPanel();

	public void showButton() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		button.setText("click me! (long)");
		button2.setText("click me!");
		button3.setText("click me!");
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		window.setSize(1000, 500);

	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==button) {
		playSound("203932__aptbr__lofi-guitar.wav");
		}
		if(buttonPressed==button2) {
			playSound("70211__qlc__lofi-guitar.wav");
		}
		if(buttonPressed==button3) {
			playSound("411728__inspectorj__violin-glissando-ascending-a-h1.wav");
		}
	}
	

}
