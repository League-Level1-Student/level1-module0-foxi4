package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame =  new JFrame();
	JPanel panel = new JPanel();
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public void showButton() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button0);
	panel.add(button1);
	panel.add(button2);
	button0.setText("Cute Video");
	//link: https://www.youtube.com/watch?v=j5a0jTc9S10
   
	button1.setText("Ghibli");
	//link: https://youtu.be/eY1XtWyKlJA?t=4804

	button2.setText("Kirby Balloon");
	//link: https://youtu.be/RK8e4JQgPfo
	
    button0.addActionListener(this);
    button1.addActionListener(this);
    button2.addActionListener(this);
    frame.pack();
    frame.setTitle("Click one to play a video.");

	//playing music btw soo i might not hear you :D	
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button0) {
		showDucks();
	}
	if(buttonPressed==button1) {
		showFrog();
	}
	if(buttonPressed==button2) {
		showFluffyUnicorns();
	}
	// TODO Auto-generated method stub
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=j5a0jTc9S10");
}

void showFrog() {
    playVideo("https://youtu.be/eY1XtWyKlJA?t=4804");
}

void showFluffyUnicorns() {
    playVideo("https://youtu.be/RK8e4JQgPfo");
}

void playVideo(String videoID) {
    
    // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
    //work on some Linux implementations 
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] { 
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}

}
