package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	private Foodtruck[] fleet = new Foodtruck[5];

	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		FoodTruckApp foodTruckApp = new FoodTruckApp();
		foodTruckApp.menu();
	}

	public FoodTruckApp() {
		for (int i = 0; i < fleet.length; i++) {
			System.out.println("Enter the name of the food truck: ");
			String ftName = kb.next();
			if (ftName.equals("Quit") || ftName.equals("quit")) {
				break;
			}
			System.out.println("Enter food truck type");
			String ftType = kb.next();
			System.out.println("Enter food truck rating 1-5.");
			int ftRating = kb.nextInt();
			kb.nextLine();
			fleet[i] = new Foodtruck(ftName, ftType, ftRating);
		}
	}

	public void menu() {

		boolean running = true;

		do {
			System.out.println("1. All existing food trucks \n" + "2. Average rating of food trucks \n"
					+ "3. Display highest rated food truck \n" + "4. Quit");
			int userSelection = kb.nextInt();
			kb.nextLine();
			switch (userSelection) {
			case 1:
				printFoodtruckList();
				break;
			case 2:
				avgRating();
				break;
			case 3:
				highestRated();
				break;
			case 4:
				System.out.println("Goodbye");
				running = false;
				return;
			}
		} while (running);
	}

	public int avgRating() {
		int sumRating = 0;
		for (int i = 0; i < Foodtruck.getNextTruckId(); i++) {
			sumRating += fleet[i].getRating();
		}
		int avgRating = (sumRating / Foodtruck.getNextTruckId());
		System.out.println("Average rating of the food trucks you entered is " + avgRating);
		return avgRating;
	}

	public Foodtruck highestRated() {
		int highestRated = -1;
		Foodtruck highestRatedTruck = null;
		for (int i = 0; i < Foodtruck.getNextTruckId(); i++) {
			Foodtruck currentFoodtruck = fleet[i];
			if (currentFoodtruck.getRating() > highestRated) {
				highestRated = currentFoodtruck.getRating();
				highestRatedTruck = currentFoodtruck;
			}
		}
		System.out.println("The highest rated food truck is: " + highestRatedTruck);
		return highestRatedTruck;
	}

	public void printFoodtruckList() {
		for (int i = 0; i < Foodtruck.getNextTruckId(); i++) {
			Foodtruck currentFoodtruck = fleet[i];
			System.out.println(currentFoodtruck.getName() + "\n");
		}
	}

}