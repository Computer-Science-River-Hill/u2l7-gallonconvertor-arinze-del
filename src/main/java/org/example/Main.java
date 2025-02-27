package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of gallons: ");
        double gallons = scanner.nextDouble();
        double quarts = gallons * 4.0;
        double pints = quarts * 2.0;
        double cups = pints * 2.0;
        double tablespoons = cups *16.0;
        System.out.println("In " + gallons + " gallons there are:");
        System.out.println(quarts + " quarts");
        System.out.println(pints + " pints");
        System.out.println(cups + " cups");
        System.out.println(tablespoons + " tablespoons");
        scanner.close();
    }
}