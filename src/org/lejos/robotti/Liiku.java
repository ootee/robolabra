package org.lejos.robotti;

import lejos.nxt.*;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * @author Olli
 * Luokka sisältää metodit robotin liikuttamiseen
 */
public class Liiku {
	
	DifferentialPilot pilot;
	
	/**
	 * Vasemman pyörän halkaisija 5.4, oikean 5.4, raideväli 14.3, mitat cm, moottorin suunta päinvastainen false
	 * Käytännössä pyörien todellisia halkaisijoita ei voi käyttää, vaan pitää hakea kohdalleen kokeilemalla, koska oikeilla arvoilla käännökset jäävät jostain syystä vajaiksi.
	 * Tässä tapauksessa pyörien halkaisija ovat pienemmät kuin todellisuudessa. 
	 * 
	 * @param vasen 	Vasen moottori (tässä tapauksessa Motor.C)
	 * @param oikea 	Oikea moottori (tässä tapauksessa Motor.B)
	 */
	public Liiku(RegulatedMotor vasen, RegulatedMotor oikea) {
		this.pilot = new DifferentialPilot(5.4, 5.4, 14.3, vasen, oikea, false);
	}
			
	/**
	 * Liikuttaa robottia eteenpäin kunnes toisin käsketään
	 */
	public void eteen() {
		pilot.forward();
	}
	
	/**
	 * Liikuttaa robottia eteenpäin parametrinä annetun matkan
	 * 
	 * @param matka 	liikuttava matka senttimetreinä
	 */
	public void eteen(double matka) {
		pilot.travel(matka);
	}
	
	/**
	 * Liikuttaa robottia taaksepäin kunnes toisin käsketään
	 */
	public void taakse() {
		pilot.backward();
	}
	
	/**
	 * Liikuttaa robottia eteenpäin parametrinä annetun matkan
	 * 
	 * @param matka 	liikuttava matka senttimetreinä
	 */
	public void taakse(double matka) {
		pilot.travel(-matka);
	}
	
	/**
	 * Pysäyttää robotin
	 */
	public void seis() {
		pilot.stop();
	}
	
	/**
	 * Kääntää robottia oikealle kunne toisin käsketään
	 */
	public void oikea() {
		pilot.rotateRight();
	}
	
	/**
	 * Kääntää robottia oikealle parametrinä annetun kulman verran
	 * 
	 * @param asteet 	käännyttävä kulma asteina
	 */
	public void oikea(double asteet) {
		pilot.rotate(-asteet);
	}
	
	/**
	 * Kääntää robottia vasemmalle kunnes toisin käsketään
	 */
	public void vasen() {
		pilot.rotateLeft();
	}
	
	/**
	 * Kääntää robottia vasemmalle parametrinä annetun kulman verran
	 * 
	 * @param asteet	käännyttävä kulma asteina
	 */
	public void vasen(double asteet) {
		pilot.rotate(asteet);
	}
	
	/**
	 * Asettaa robotin kulkunopeuden
	 * 
	 * @param nopeus	nopeus sentteinä per sekunti
	 */
	public void setNopeus(double nopeus) {
		pilot.setTravelSpeed(nopeus);
	}
	
	/**
	 * Asettaa robotin käännösten nopeuden
	 * 
	 * @param nopeus	nopeus asteina per sekunti
	 */
	public void setKaannosNopeus(double nopeus) {
		pilot.setRotateSpeed(nopeus);
	}

	
	
}
