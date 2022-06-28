package com.skilldistillery.foodtruck.entities;

//ONLY INFO ON THE TRUCKS HERE
public class FoodTruck {
	private String truckName;
	private String truckFood;
	private double truckRating;
	private static int nextTruckId =0;
	private int id;

	public FoodTruck() {
	}

	public FoodTruck(String truckName, String truckFood, double truckRating) {
		this.truckName = truckName;
		this.truckFood = truckFood;
		this.truckRating = truckRating;
		nextTruckId++;
		id = nextTruckId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Food Truck Name = " + truckName + ", Truck Food = " + truckFood + ", Truck Rating = " + truckRating;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckFood() {
		return truckFood;
	}

	public void setTruckFood(String truckFood) {
		this.truckFood = truckFood;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(double truckRating) {
		this.truckRating = truckRating;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

}
