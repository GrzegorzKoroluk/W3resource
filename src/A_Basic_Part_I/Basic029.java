/*
29. Write a Java program to convert a hexadecimal to a binary number. Go to the editor
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic029 {

    public static int szesnastkowaNaDziesietna(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String args[])
    {
        String szesnastkowa;
        int dziesietna, i = 1, j;
        int tablicaDwojkowa[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number : ");
        szesnastkowa = scan.nextLine();

        dziesietna = szesnastkowaNaDziesietna(szesnastkowa);

        while(dziesietna != 0)
        {
            tablicaDwojkowa[i++] = dziesietna % 2;
            dziesietna = dziesietna / 2;
        }

        System.out.print("Equivalent Binary Number is: ");
        for(j = i - 1; j > 0; j--)
        {
            System.out.print(tablicaDwojkowa[j]);
        }
        System.out.print("\n");
    }

}