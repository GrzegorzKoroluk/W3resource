/*
25. Write a Java program to convert a octal number to a decimal number. Go to the editor
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic025 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long osemkowa, dziesietna = 0;
        int i = 0;
        System.out.print("Podaj wartosc ósemkową: ");
        osemkowa = in.nextLong();
        while (osemkowa != 0)
        {
            dziesietna = (long)(dziesietna + (osemkowa % 10) * Math.pow(8, i++));
            osemkowa = osemkowa / 10;
        }
        System.out.print("Po przeliczeniu na liczbę dziesiętną: " + dziesietna + "\n");
    }
}