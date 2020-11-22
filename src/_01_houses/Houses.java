package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot iCU=new Robot();

	public void run() {
		iCU.setWindowColor(Color.black);
	iCU.miniaturize();
iCU.moveTo(50, 500);
iCU.setSpeed(8);
iCU.penDown();
iCU.setPenWidth(3);

for(int i=0; i<10; i++)
//drawFlatRoofHouse(new Random().nextInt(144)+40);
//drawFlatRoofHouse("random ;)");
drawPointyRoof(100);
	}
public void drawFlatRoofHouse(int height) {
	iCU.setPenWidth(3);
	iCU.setRandomPenColor();
	iCU.move(height);
	iCU.turn(90);
	iCU.move(30);
	iCU.turn(90);
	iCU.move(height);
	iCU.turn(-90);
	iCU.setPenColor(Color.green);
	iCU.setPenWidth(1);
	iCU.move(25);
	iCU.turn(-90);
}
public void drawFlatRoofHouse(String height) {
int wallsize=new Random().nextInt(160)+50;
if (height.equals("small")) {
	wallsize=60;
}
if(height.equals("medium")) {
	wallsize=120;
}
if(height.equals("large")) {
	wallsize=250;
}
	iCU.setPenWidth(3);
	iCU.setRandomPenColor();
	iCU.move(wallsize);
	iCU.turn(90);
	iCU.move(30);
	iCU.turn(90);
	iCU.move(wallsize);
	iCU.turn(-90);
	iCU.setPenColor(Color.green);
	iCU.setPenWidth(1);
	iCU.move(25);
	iCU.turn(-90);
}
public void drawPointyRoof(int height) {
	iCU.setPenWidth(3);
	iCU.setRandomPenColor();
	iCU.move(height);
	iCU.turn(45);
	iCU.move(30);
	iCU.turn(90);
	iCU.move(30);
	iCU.turn(45);
	iCU.move(height);
	iCU.turn(-90);
	iCU.setPenColor(Color.green);
	iCU.setPenWidth(1);
	iCU.move(25);
	iCU.turn(-90);
}
public void drawFlatRoof() {
	//for next time: i finished the peak thingies, i just need to do something with the flat roof method and making
	//the large towers flat roof then im good.
}
}

















//pennsylvaniaaa you got distracted