package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
//ONLY STATIC METHOD
//MENUS AND SCANNERS
	private FoodTruck[] fleetOfFoodTrucks = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		String truckName = "";
		String truckFood;
		double truckRating;
		boolean keepGoing = true;
		int choice;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the food truck name for truck number: " + (i + 1) + "\nOr enter 'quit' to quit.");
			truckName = scanner.nextLine();
			if (truckName.equals("quit")) {
				break;
			}
			else {
			System.out.println("Enter the food type: ");
			truckFood = scanner.nextLine();
			System.out.println("Enter the trucks rating 0.0 to 5.0: ");
			truckRating = scanner.nextDouble();
			scanner.nextLine();
			fleetOfFoodTrucks[i] = new FoodTruck(truckName, truckFood, truckRating);
			}
		}
		while (keepGoing) {
			System.out.println("---- MENU ----");
			System.out.println("SELECT WHAT YOU WOULD LIKE TO DO");
			System.out.println("1. List all food trucks.");
			System.out.println("2. See the average rating for all trucks.");
			System.out.println("3. See the highest rated truck.");
			System.out.println("4. Quit.");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < fleetOfFoodTrucks.length; i++) {
					if(fleetOfFoodTrucks[i] == null) {break;}
					System.out.println(fleetOfFoodTrucks[i].toString());
				}
				break;
			case 2:
				for (int i = 0; i < fleetOfFoodTrucks.length; i++) {
					if(fleetOfFoodTrucks[i] == null) {break;}
					
				}

				break;
			case 3:

				break;
			case 4:
				System.out.println("Thank you, have a nice day!");
				scanner.close();
				keepGoing = false;
			}
		}
	}
}
