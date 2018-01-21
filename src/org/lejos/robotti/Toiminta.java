package org.lejos.robotti;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;

/**
 * @author Olli
 * 
 * Luokka ohjaa robotin toimintaa ympäristön valoisuuden mukaan.
 */
public class Toiminta {
	private Liiku l;
	private Kohteenetsija ke;
	private Kasi kasi;
	private LightSensor ls;

	/**
	 * Luo olion joka ohjaa robotin toimintaa.
	 * 
	 * @param ke	Kohteenetsijä
	 * @param l		Liiku
	 * @param kasi	Käsi
	 * @param ls	Valoisuussensori
	 */
	public Toiminta(Kohteenetsija ke, Liiku l, Kasi kasi, LightSensor ls) {
		this.l = l;
		this.ke = ke;
		this.kasi = kasi;
		this.ls = ls;
	}

	/**
	 * Valitsee robotin toiminnan valoisuusanturin arvon mukaan. Pimeällä etsitään kohde, valoisalla tyhjä tila. ESC-nappi pysäyttää robotin.
	 */
	public void toimi() {
		while (!Button.ESCAPE.isPressed()) {
			if (ls.getLightValue() < 20) {
				Kohde k = ke.etsiKohde();

				if (k.getKulma() > 180) {
					l.vasen(360 - k.getKulma());
				} else {
					l.oikea(k.getKulma());
				}

				l.eteen(k.getEtaisyys() - 5);

				if (ke.onkoKohdeLyontietaisyydella()) {
					kasi.heilauta();
					l.taakse(k.getEtaisyys() - 5);
				}
			} else {
				ke.etsiTyhjaTila();
			}
		}
	}
}