/*
22. Write a Java program to convert a binary number to decimal number. Go to the editor
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic022 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long dwojkowa, dziesietna = 0, j = 1, reszta;
        System.out.print("Podaj liczbe dwojkowa: ");
        dwojkowa = sc.nextLong();

        while (dwojkowa != 0)
        {
            reszta = dwojkowa % 10;
            dziesietna = dziesietna + reszta * j;
            j = j * 2;
            dwojkowa = dwojkowa / 10;
        }
        System.out.println("Wartość dziesiętna: " + dziesietna);
    }

}
