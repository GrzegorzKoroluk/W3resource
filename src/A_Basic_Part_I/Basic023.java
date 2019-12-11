/*
23. Write a Java program to convert a binary number to hexadecimal number. Go to the editor
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic023 {

    public static void main(String[] args) {

        int[] tablicaSzesnastkowa = new int[1000];
        int i = 1, j = 0, reszta, dziesietna = 0, dwojkowa;
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wartość dwójkową: ");
        dwojkowa = in.nextInt();
        while (dwojkowa > 0) {
            reszta = dwojkowa % 2;
            dziesietna = dziesietna + reszta * i;
            i = i * 2;
            dwojkowa = dwojkowa / 10;
        }
        i = 0;
        while (dziesietna != 0) {
            tablicaSzesnastkowa[i] = dziesietna % 16;
            dziesietna = dziesietna / 16;
            i++;
        }
        System.out.print("Wartość szesnastkowa: ");
        for (j = i - 1; j >= 0; j--) {
            if (tablicaSzesnastkowa[j] > 9) {
                System.out.print((char) (tablicaSzesnastkowa[j] + 55) + "\n");  // czyżby w tablicy char-ów litery rozpoczynały się od 55 pozycji?
            } else {
                System.out.print(tablicaSzesnastkowa[j] + "\n");
            }
        }
    }
}