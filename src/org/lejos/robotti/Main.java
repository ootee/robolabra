package org.lejos.robotti;

import lejos.nxt.*;
import lejos.nxt.addon.IRSeekerV2.Mode;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.util.*;

/**
 * Ninjarobotti, joka etsii kohteen pimeällä ja välttelee valoisalla.
 * 
 */
public class Main {

	public static void main(String[] args) {
//		Alustetaan sensorit
		
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S2);
		LightSensor ls = new LightSensor(SensorPort.S1);

//		Luodaan robotin ohjaamiseen tarvittavat oliot
		
		Liiku l = new Liiku(Motor.C, Motor.B);
		Kohteenetsija ke = new Kohteenetsija(l, us);
		Kasi kasi = new Kasi();
		Toiminta toiminta = new Toiminta(ke, l, kasi, ls);
		
//		Kytketään valoisuussensorin valo pois päältä
		
		ls.setFloodlight(false);

//		Hidastetaan moottorien kiihtyvyys puoleen
		
		Motor.B.setAcceleration(3000);
		Motor.C.setAcceleration(3000);

//		Asetetaan uä-sensorin toimintatila jatkuvaksi
		
		us.setMode(2);

//		Asetetaan robotin liikkumis- ja käännösnopeudet
		
		l.setNopeus(20);

		l.setKaannosNopeus(45);

//		Tulostetaan näytölle valmiusteksti ja valoisuusanturin lukema
		
		LCD.drawString("Valmis", 0, 0);
		
		LCD.drawInt(ls.getLightValue(), 0, 1);

//		Odotetaan napin painallusta robotin käynnistämiseksi
		
		Button.waitForPress();

		Delay.msDelay(1000);
		
		toiminta.toimi();
	}
}
