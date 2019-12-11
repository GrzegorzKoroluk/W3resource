/*
24. Write a Java program to convert a binary number to a Octal number. Go to the editor
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic024 {

    public static void main(String[] args) {

        int dwojkowa, tymczasowaDwojkowa, reszta, dziesietna = 0, obliczeniowaDziesietna, i = 1, j;
        int tablicaOsemkowa[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość dwójkową: ");
        dwojkowa = scan.nextInt();
        tymczasowaDwojkowa = dwojkowa;

        while(dwojkowa > 0)
        {
            reszta = dwojkowa % 10;
            dziesietna = dziesietna + reszta * i;
            i = i * 2;
            dwojkowa = dwojkowa / 10;
        }

        i = 1;
        obliczeniowaDziesietna = dziesietna;

        while(obliczeniowaDziesietna > 0)
        {
            tablicaOsemkowa[i++] = obliczeniowaDziesietna % 8;
            obliczeniowaDziesietna = obliczeniowaDziesietna / 8;
        }

        System.out.print("Wartość ósemkowa binarnej liczby: " + tymczasowaDwojkowa + " to: ");
        for(j = i-1; j > 0; j--)
        {
            System.out.print(tablicaOsemkowa[j]);
        }
        System.out.print("\n");
    }
}