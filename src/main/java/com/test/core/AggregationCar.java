package com.test.core;

public class AggregationCar {
	private String make;
	private int year;
	private Engine engine;

	public AggregationCar(String make, int year, Engine engine) {
		this.make = make;
		this.year = year;
		/**
		 * Engine object is created outside and is passed as argument to Car
		 * constructor When this Car object is destroyed, the engine is still
		 * available to objects other than Car If the instance of Car is garbage
		 * collected the associated instance of Engine may not be garbage
		 * collected (if it is still referenced by other objects)
		 */
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public int getYear() {
		return year;
	}

	public Engine getEngine() {
		return engine;
	}

}
