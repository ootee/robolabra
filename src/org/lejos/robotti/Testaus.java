package org.lejos.robotti;



import lejos.nxt.*;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.util.*;

/**
 * Testaa robotin liikkeet ennalta määrätyillä parametreillä
 *
 */
public class Testaus {

	public static void Testaus() {
		Liiku liiku = new Liiku(Motor.C, Motor.B);
		
		Kasi kasi = new Kasi();
					
		liiku.setNopeus(20);
		
		liiku.setKaannosNopeus(30);
		
		LCD.drawString("Testataan 360 asteen käännös", 0, 0);
		
		LCD.drawString("Paina mitä tahansa nappia", 0, 1);
		
		Button.waitForPress();
		
		Delay.msDelay(2000);
		
		
		
		for (int i = 0; i < 18; i++) {
			liiku.oikea(20);
		}
				
		kasi.heilauta();
	}
}