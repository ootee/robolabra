package org.lejos.robotti;

import lejos.nxt.*;
import lejos.util.Delay;

/**
 * Example leJOS Project with an ant build file
 *
 */
public class Main {

	public static void main(String[] args) {
		LCD.drawString("Program 2", 0, 0);
		          Button.waitForPress();
		           Motor.A.setSpeed(720);
		           Motor.A.forward();
		           LCD.clear();
		           Delay.msDelay(2000);
		           LCD.drawInt(Motor.A.getTachoCount(),0,0);
		           Motor.A.stop();
		           LCD.drawInt(Motor.A.getTachoCount(),0,1);
		           Motor.A.backward();
		           while (Motor.A.getTachoCount()>0); 
		           LCD.drawInt(Motor.A.getTachoCount(),0,2);
		           Motor.A.stop();
		           LCD.drawInt(Motor.A.getTachoCount(),0,3);
		           Button.waitForPress();

	}
}
