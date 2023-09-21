/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ST10257468 - Bela Jyoti Premchund
 */
public class Car {
    Scanner kb = new Scanner(System.in);

    String colour;
    String make;
    String model;

    // ArrayLists
    ArrayList<String> carColour = new ArrayList<>();
    ArrayList<String> carMake = new ArrayList<>();
    ArrayList<String> carModel = new ArrayList<>();

    public Car(String colour, String make, String model) {
        this.colour = colour;
        this.make = make;
        this.model = model;
    }

    public String getColour(String expResult) {
        return colour;
    }

    public String getMake(String expResult) {
        return make;
    }

    public String getModel(String expResult) {
        return model;
    }

    public void saveCarInformation() {
        System.out.println("\nCAR INFORMATION:\n");
        System.out.print("Enter the make of the car>>> ");
        make = kb.nextLine();
        carMake.add(getMake(""));

        System.out.print("Enter the model of the car>>> ");
        model = kb.nextLine();
        carModel.add(getModel(""));

        System.out.print("Enter the colour of the car>>> ");
        colour = kb.nextLine();
        carColour.add(getColour(""));
    }

    public void displayReport() {
        System.out.println("CAR DETAILS:");
        System.out.println("--------------------------------");

        for (int i = 0; i < carMake.size(); i++) {
            System.out.println("CAR " + (i + 1) + ": ");
            System.out.println("--------------------------------");
            System.out.println("Car make: " + carMake.get(i) + "\n" +
                    "Car model: " + carModel.get(i) + "\n" +
                    "Colour of the car: " + carColour.get(i));
        }
    }
}
