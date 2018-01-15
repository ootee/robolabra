package org.lejos.robotti;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.FeatureListener;

public class Valoisuustunnistin implements SensorPortListener{
		
	public Valoisuustunnistin() {
	}

	@Override
	public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) {
		if (aNewValue > 50) {
			
		} else {
			
		}
			
	}

	
	

}
