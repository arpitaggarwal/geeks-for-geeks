package com.test.core;

public class CompositionCar {
	private String make;
	private int year;
	private Engine engine;

	public CompositionCar(String make, int year, int engineCapacity,
			int engineSerialNumber) {
		this.make = make;
		this.year = year;
		/**
		 * We create the engine using parameters passed in Car constructor only
		 * the Car instance has access to the engine instance when Car instance
		 * is garbage collected, the engine instance is garbage collected too
		 */
		this.engine = new Engine(engineCapacity, engineSerialNumber);
	}

	public String getMake() {
		return make;
	}

	public int getYear() {
		return year;
	}

	public int getEngineCapacity() {
		return engine.getEngineCapacity();
	}

	public int getEngineSerialNumber() {
		return engine.getEngineSerialNumber();
	}

}
