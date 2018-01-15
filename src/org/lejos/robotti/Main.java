package org.lejos.robotti;

import lejos.nxt.*;
import lejos.nxt.addon.IRSeekerV2.Mode;
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
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S2);	
		
		Liiku l = new Liiku(Motor.C, Motor.B);
		Kohteenetsija ke = new Kohteenetsija(l, us);
		Kasi kasi = new Kasi();
		
		Motor.B.setAcceleration(3000);
		Motor.C.setAcceleration(3000);
		
		us.setMode(2);
		
		l.setNopeus(20);

		l.setKaannosNopeus(45);	
		
		LCD.drawString("Valmis", 0, 0);
		
		Button.waitForPress();

		Delay.msDelay(1000);
		
		//Etsintämoodi
		
//		while (!Button.ESCAPE.isPressed()) {
//			Kohde k = ke.etsiKohde();
//
//			if (k.getKulma() > 180) {
//				l.vasen(360 - k.getKulma());
//			} else {
//				l.oikea(k.getKulma());
//			}
//
//			l.eteen(k.getEtaisyys() - 5);
//			
//			if (ke.onkoKohdeLyontietaisyydella()) {
//				kasi.heilauta();
//				l.taakse(k.getEtaisyys() - 5);
//				break;
//			} 
//		}
		
		//Välttelymoodi
		
		while (!Button.ESCAPE.isPressed()) {
			Kohde k = ke.etsiTyhjaTila();
			
			if (k.getKulma() > 180) {
				l.vasen(360 - k.getKulma());
			} else {
				l.oikea(k.getKulma());
			}
			
			l.eteen(k.getEtaisyys());
						
		}
		
	}
}
