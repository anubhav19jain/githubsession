88/*
 * This program uses total distance of the trip, 
 * the mpg of vehicle, and the current price of
 * gas to calculate the total cost of the trip.
 */
package travelcosts_finish;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class TravelCosts_Finish {

    public static void main(String[] args) {
//        double distance;
//        double mpg;
//        double pricePerGallon;
//        double totalCost;
        double distance, mpg, pricePerGallon, totalCost;
        String typeVehicle;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        
        System.out.println("enter the type of vehicle you want");
        typeVehicle = in.next();
             
             
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f sice you are driving" + " a " + typeVehicle,totalCost);
        System.out.println();
    }
    
}
