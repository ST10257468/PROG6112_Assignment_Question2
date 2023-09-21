/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ST10257468 - Bela Jyoti Premchund
 */
public class Assignment_Question2 {

    /*
    Scenario:
    a sports car dealership
    parent class --> make, model, colour
    child class--> price, how old
    */
    final static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        int option = 0;
        SportsCar sport = new SportsCar("", "", "", 0.0, 0);
        System.out.println("************WELCOME TO PREMCHUND MOTORS************");
        while (true) {
            System.out.println("Select an options:\n"
                             + "1. Enter sports car information\n" 
                             + "2. Display sports car information\n" 
                             + "3. Exit");
            System.out.print("Enter your option here>>> ");
            option = kb.nextInt();

            switch(option){
                case 1: sport.saveCarInformation(); break;
                case 2: sport.displayReport(); break;
                case 3: exit = true; System.out.println("Exiting program"); return;
                default: System.out.println("Invalid option entered. Please try again.");
            }
        }
    } 
}
    
    

