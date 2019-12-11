/*
11. Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic011 {

    public static double perimeter (double radius) {
        return 2 * Math.PI * radius;
    }

    public static double area (double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give radius value: ");
        double wczyt = in.nextDouble();
        System.out.println("Perimeter is = " + perimeter(wczyt));
        System.out.println("Area is = " + area(wczyt));
    }
}
