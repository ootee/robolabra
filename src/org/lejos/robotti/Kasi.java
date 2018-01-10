package org.lejos.robotti;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;
import lejos.util.Delay;

/**
 * @author lego
 * Luokka tarjoaa toiminnot robotin käden hallintaan.
 */
public class Kasi {
	private NXTRegulatedMotor m;
	
	/**
	 * Luo olion, jonka metodeilla ohjataan robotin kättä. Moottorin kiihtyvyyttä on tiputettu puoleen 
	 * alkuperäisestä sulavamman toiminnan takaamiseksi ja moottorin nopeudeksi on asetettu suunnilleen maksimit.
	 */
	public Kasi() {
		this.m = Motor.A;
		Motor.A.setAcceleration(3000);
		Motor.A.setSpeed(720);
	}
	
	/**
	 * Heilauttaa kättä ja palauttaa sen alkuasentoon.
	 */
	public void heilauta() {
		m.rotateTo(-225);
		Delay.msDelay(0);
		m.rotateTo(0);
	}
}
