/*
13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic013 {

    public static double powierzchnia (float szerokosc, float dlugosc) {
        return szerokosc * dlugosc;
    }

    public static double obwod (float szerokosc, float dlugosc) {
        return 2 * (szerokosc + dlugosc);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        float pierwszaLiczba = in.nextFloat();
        System.out.print("Podaj drugą liczbę: ");
        float drugaLiczba = in.nextFloat();

        System.out.println("Powierzchnia to: " + pierwszaLiczba + " * " + drugaLiczba + " = " + powierzchnia(pierwszaLiczba, drugaLiczba));
        System.out.println("Obwód to: 2 x (" + pierwszaLiczba + "  " + drugaLiczba + ") = " + obwod(pierwszaLiczba, drugaLiczba));
    }

}
