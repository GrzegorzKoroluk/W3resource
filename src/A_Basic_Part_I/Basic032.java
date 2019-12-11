/*
32. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic032 {

    public static void porownanieLiczb(int a, int b) {
        if (a == b) {
            System.out.println("Liczby są równe.");
            System.out.println(a + "=" + b);
        } else if (a > b) {
            System.out.print("Liczby nie są równe (" + a + " != " + b + "). Liczba podana jako pierwsza jest większa niż ta podana jako druga (" + a + " > " + b + ").");
        } else {
            System.out.print("Liczby nie są równe (" + a + " != " + b + "). Liczba podana jako pierwsza jest mniejsza niż ta podana jako druga (" + a + " < " + b + ").");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int wczyt1 = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int wczyt2 = in.nextInt();

        porownanieLiczb(wczyt1, wczyt2);
    }
}
