/*
2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 */

package C_Data_Types;

import org.junit.Test;

import java.util.Scanner;

public class DataTypes02 {

    private double inches = 0;
    private double meters = 0;


    public double convertFromInchesToMeters(double inches) {
        meters = inches * 0.0254;
        return meters;
    }

    public double convertFromMetersToInches(double meters) {
        inches = meters / 0.0254;
        return inches;
    }

    public static void main(String[] args) {

        DataTypes02 conversion = new DataTypes02();

        System.out.println("Choose conversion method: \n" +
                "1. Convert from inches to meters. \n" +
                "2. Convert from meters to inches. \n" +
                "Your choice is: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("How many inches is there:");
                int inches = input.nextInt();
                System.out.println("That would be: " + conversion.convertFromInchesToMeters(inches) + " meters.");
                break;

            case 2:
                System.out.println("How many meters is there:");
                int meters = input.nextInt();
                System.out.println("That would be: " + conversion.convertFromMetersToInches(meters) + " inches.");
                break;

            default:
                System.out.println("Incorrect choice.");
                break;
        }
    }
}
