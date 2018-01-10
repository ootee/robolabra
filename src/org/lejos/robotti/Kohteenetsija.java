package org.lejos.robotti;

import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.RangeFeatureDetector;

/**
 * @author Olli Luokka sisältää metodit kohteen etsimiseen.
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
	public Kohteenetsija(Liiku l) {
		this.liiku = l;
		this.us = new UltrasonicSensor(SensorPort.S2);
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

	/**
	 * Palauttaa suoraan robotin edessä olevan kohteen etäisyyden. Jostain syys ei toimi.
	 * 
	 * @return		kohteen etäisyys 
	 */
	public int getEdessaOlevanEtaisyys() {
		Feature result = fd.scan();
		if (result != null) {
			return (int) result.getRangeReading().getRange();
		} else {
			return Integer.MAX_VALUE;
		}
	}

}
