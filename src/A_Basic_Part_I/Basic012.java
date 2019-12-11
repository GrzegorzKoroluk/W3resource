/*
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic012 {

    public static double average (int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int pierwszaLiczba = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int drugaLiczba = in.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int tzreciaLiczba = in.nextInt();

        System.out.println("Srednia z trzech liczb to " + average(pierwszaLiczba, drugaLiczba, tzreciaLiczba));
    }
}
