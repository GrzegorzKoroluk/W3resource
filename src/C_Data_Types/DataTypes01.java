/*
1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */

package C_Data_Types;

import java.util.Scanner;

public class DataTypes01 {

    private double celsius = 0;
    private double fahrenheit = 0;

    public double convertTemperatureToFahrenheit(double celsius) {
        fahrenheit = ((-40) + (celsius - (-40)) * 1.8);
        return fahrenheit;
    }

    public double convertTemperatureToCelsius(double fahrenheit) {
        celsius = ((-40) + (fahrenheit - (-40)) / 1.8);
        return celsius;
    }

    public static void main(String[] args) {

        DataTypes01 conversion = new DataTypes01();

        Scanner in = new Scanner(System.in);
        System.out.println("Choose conversion: \n"
                + "1. Conversion from Celsius to Fahrenheit. \n"
                + "2. Conversion from Fahrenheit to Celsius. \n");
        int choice = in.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Tell the temperature in Celsius:");
                double giveCelsius = in.nextDouble();
                System.out.println("Calculated temperature in Fahrenheit equals: " + conversion.convertTemperatureToFahrenheit(giveCelsius));
                break;

            case 2:
                System.out.println("Tell the temperature in Fahrenheit:");
                double giveFahrenheit = in.nextDouble();
                System.out.println("Calculated temperature in Celsius equals: " + conversion.convertTemperatureToCelsius(giveFahrenheit));
                break;

            default:
                System.out.println("Incorrect choice. Program closed.");
        }
    }
}