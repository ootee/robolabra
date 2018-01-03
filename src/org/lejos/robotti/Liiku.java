package org.lejos.robotti;

import lejos.nxt.Motor;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * @author Olli
 * Luokka sisältää metodit robotin liikuttamiseen
 */
public class Liiku {
	
	DifferentialPilot pilot;
	
	/**
	 * Vasemman pyörän halkaisija 5.71, oikean 5.73, raideväli 13.48, mitat cm, moottorin suunta päinvastainen false
	 * 
	 * @param vasen 	Vasen moottori (tässä tapauksessa Motor.B)
	 * @param oikea 	Oikea moottori (tässä tapauksessa Motor.A)
	 */
	public Liiku(RegulatedMotor vasen, RegulatedMotor oikea) {
		this.pilot = new DifferentialPilot(5.71, 5.73, 13.48, vasen, oikea, false);
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
