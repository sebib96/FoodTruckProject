package com.skilldistillery.foodtruck.entities;

public class Foodtruck {
	private int id;
	private static int nextTruckId;
	private String name;
	private String foodType;
	private int rating;

	
	public Foodtruck(String name, String foodType, int rating, int nextTruckId) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.nextTruckId = nextTruckId;
	}
	
	public Foodtruck() {
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		Foodtruck.nextTruckId = nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
