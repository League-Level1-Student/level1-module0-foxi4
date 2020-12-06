package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String image = "https://pbs.twimg.com/media/EfAGQnLWkAAcuz4.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component test;
		// 3. use the "createImage()" method below to initialize your Component
test=createImage(image);
quizWindow.add(test);
		// 4. add the image to the quiz window
quizWindow.pack();
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equals("artic fox")) {
System.out.print("CORRECT");
}
else {
	System.out.print("INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(test);
		// 10. find another image and create it (might take more than one line
		// of code)
String image2= "https://i.pinimg.com/originals/18/ae/c7/18aec7f664721bdcbb6e8d8162028d37.jpg";
		// 11. add the second image to the quiz window
Component test2;
test2=createImage(image2);
quizWindow.add(test2);
quizWindow.pack();
		// 12. pack the quiz window

		// 13. ask another question
String answer2= JOptionPane.showInputDialog("What are all the aliases of these people? (order is from left to right and capitalization)");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer2.equals("Skeppy, Badboyhalo, Dream, Georgenotfound")) {
	System.out.print("CORRECT");
}
else {
	System.out.print("INCORRECT");
}
//answerquizWindow.remove(test2);
	}
	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
	
	
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
