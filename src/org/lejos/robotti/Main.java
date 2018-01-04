package org.lejos.robotti;

import lejos.nxt.*;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.util.*;

/**
 * Example leJOS Project with an ant build file
 *
 */
public class Main {

	public static void main(String[] args) {
		Liiku l = new Liiku(Motor.C, Motor.B);
		Kohteenetsija ke = new Kohteenetsija(l);
		Kasi kasi = new Kasi();
		
		LCD.drawString("Valmis", 0, 0);
		
		l.setNopeus(20);
		
		l.setKaannosNopeus(20);
		
		Button.waitForPress();
		
		Delay.msDelay(1000);
						
		Kohde k = ke.etsiKohde();
			
		if (k.getKulma() > 180) {
			l.vasen(360 - k.getKulma());
		} else {
				l.oikea(k.getKulma());
		}
		
		l.eteen(k.getEtaisyys());
				
		kasi.heilauta();
	}
}
