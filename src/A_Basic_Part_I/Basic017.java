/*
17. Write a Java program to add two binary numbers. Go to the editor
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic017 {

    public static void main(String[] args) {

        int i = 0, pierwszaLiczba, drugaLiczba, reszta = 0;
        int[] tablicaPrzeliczeniowa = new int[31];

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        pierwszaLiczba = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        drugaLiczba = in.nextInt();

        while (pierwszaLiczba != 0 || drugaLiczba != 0) {
            tablicaPrzeliczeniowa[i++] =  (int) ((pierwszaLiczba % 10 + drugaLiczba % 10 + reszta) % 2);
            reszta =  (int) ((pierwszaLiczba % 10 + drugaLiczba % 10 + reszta) / 2);
            pierwszaLiczba = pierwszaLiczba / 10;
            drugaLiczba = drugaLiczba / 10;
        }
        if (reszta != 0) {
            tablicaPrzeliczeniowa[i++] = reszta;
        }
        --i;
        System.out.println("Suma dwóch liczb dwójkowych to: ");
        while (i >= 0) {
            System.out.print(tablicaPrzeliczeniowa[i--]);
        }
        System.out.print("\n");
    }
}
