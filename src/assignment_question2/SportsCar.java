/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_question2;

import java.util.ArrayList;

/**
 *
 * @author ST10257468 - Bela Jyoti Premchund
 */

//child class
class SportsCar extends Car {
    double price; // Enter the price of the car
    int yearProduced;

    // ArrayLists
    ArrayList<Double> carPrice = new ArrayList<>();
    ArrayList<Integer> carYearProduced = new ArrayList<>();

    public SportsCar(String colour, String make, String model, double price, int yearProduced) {
        super(colour, make, model);
        this.price = price;
        this.yearProduced = yearProduced;
    }

    public double getPrice(double expResult) {
        return price;
    }

    public int getYearProduced(int expResult) {
        return yearProduced;
    }

    @Override
    public void saveCarInformation() {
        super.saveCarInformation();
    
        System.out.print("Enter the price of the car>>> ");
        price = kb.nextDouble();
        carPrice.add(getPrice(0.0));

        System.out.print("Enter the year the car was produced>>> ");
        yearProduced = kb.nextInt();
        carYearProduced.add(getYearProduced(0));
        System.out.println("\n");
    }

    @Override
    public void displayReport() {
        super.displayReport();
        for (int i = 0; i < carMake.size(); i++) {
            System.out.println("Price of the car: " + carPrice.get(i) + "\n" 
                             + "Year the car was produced: " + carYearProduced.get(i));
            System.out.println("--------------------------------\n");
        }
        
    }
}