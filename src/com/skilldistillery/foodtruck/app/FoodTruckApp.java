package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp(kb);
		foodTruckApp.menu();
		kb.close();
	}

//fleet of Foodtrucks
	private Foodtruck[] fleet = new Foodtruck[5];

	Scanner kb = new Scanner(System.in);

	Foodtruck ftOne = new Foodtruck();
	Foodtruck ftTwo = new Foodtruck();
	Foodtruck ftThree = new Foodtruck();
	Foodtruck ftFour = new Foodtruck();
	Foodtruck ftFive = new Foodtruck();

	public FoodTruckApp(Scanner kb) {
		for (int i = 0; i < fleet.length; i++) {
			
			int ftId = (i);
			System.out.println("Enter the name of the food truck: ");
			String ftName = kb.next();
			ftOne.setName(ftName);
			System.out.println("Enter food truck type");
			String ftType = kb.next();
			System.out.println("Enter food truck rating 1-5.");
			int ftRating = kb.nextInt();
			fleet[i] = new Foodtruck(ftName, ftType, ftRating);
		}
	}

	public void menu() {
		System.out.println("1. All existing food trucks \n" + "2. Average rating of food trucks \n"
				+ "3. Display highest rated food truck \n" + "4. Quit");
		int userSelection = kb.nextInt();

		switch (userSelection) {
		case 1:

		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

}