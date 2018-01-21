package org.lejos.robotti;

/**
 * @author Olli
 * Luokka tarjoaa kohde-olion, jonka muuttujien avulla robotti voi suunnistaa.
 */
public class Kohde {
	private int etaisyys;
	private int kulma;
	
	/**
	 * Luo kohdeolion, jolla on etäisyys ja kulma suhteessa robottiin.
	 * 
	 * @param e		Kohteen etäisyys sentteinä
	 * @param k		Kohteen kulma asteina
	 */
	public Kohde(int e, int k) {
		this.etaisyys = e;
		this.kulma = k;
	}
	
	/**
	 * @return Palauttaa kohteen etäisyyden
	 */
	public int getEtaisyys() {
		return this.etaisyys;
	}
	
	/**
	 * @return Palauttaa kohteen kulman arvona väliltä 0-340 astetta
	 */
	public int getKulma() {
		return this.kulma;
	}

}
