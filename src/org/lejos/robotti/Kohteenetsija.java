package org.lejos.robotti;

import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.RangeFeatureDetector;

/**
 * @author Olli
 * 
 *         Luokka sisältää metodit kohteen etsimiseen.
 */
public class Kohteenetsija {
	private Liiku liiku;
	private int MAX_DISTANCE = 200;
	private int PERIOD = 500;
	private UltrasonicSensor us;
	private FeatureDetector fd;

	/**
	 * @param l
	 *            Liiku-olio joka liikuttaa robottia kohteen etsinnän aikana.
	 */
	public Kohteenetsija(Liiku l, UltrasonicSensor us) {
		this.liiku = l;
		this.us = us;
		this.fd = new RangeFeatureDetector(us, MAX_DISTANCE, PERIOD);
	}

	/**
	 * Metodi etsii robottia lähimmän kohteen.
	 * 
	 * @return Kohde-olio, jolla on lähimmän kohteen etäisyys ja kulma suhteessa
	 *         robottiin
	 */
	public Kohde etsiKohde() {
		int etaisyys = Integer.MAX_VALUE;
		int kulma = 0;
		for (int i = 0; i < 18; i++) {
			Feature result = fd.scan();
			if (result != null) {
				if (result.getRangeReading().getRange() < etaisyys) {
					etaisyys = (int) result.getRangeReading().getRange();
					kulma = i * 20;
				}
			}
			liiku.oikea(20);
		}
		return new Kohde(etaisyys, kulma);
	}

	public Kohde etsiTyhjaTila() {
		int etaisyys = 0;
		int kulma = 0;
		
		for (int i = 0; i < 18; i++) {
			Feature result = fd.scan();
			if (result == null) {
				etaisyys = 100;
				kulma = i * 20;
			}
			liiku.oikea(20);
		}
		return new Kohde(etaisyys, kulma);
	}

	/**
	 * Kertoo robotille onko kohde lyöntietäisyydellä. Testien perusteella
	 * ultraäänisensori ei tunnista alle 10 cm etäisyyksiä kovin luotettavasti.
	 * 
	 * @return TRUE, jos kohde on alle 15 cm päässä, muuten FALSE
	 */
	public boolean onkoKohdeLyontietaisyydella() {
		Feature result = fd.scan();
		if (result != null) {
			if (result.getRangeReading().getRange() < 15) {
				return true;
			}
		}
		return false;
	}

}
