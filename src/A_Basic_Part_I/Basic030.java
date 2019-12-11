/*
30. Write a Java program to convert a hexadecimal to a octal number. Go to the editor
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic030 {

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
        int tablicaOsemkowa[] = new int[100];
        Scanner in = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        szesnastkowa = in.nextLine();

        dziesietna = szesnastkowaNaDziesietna(szesnastkowa);

        while(dziesietna != 0)
        {
            tablicaOsemkowa[i++] = dziesietna % 8;
            dziesietna = dziesietna / 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for(j = i - 1; j > 0; j--)
        {
            System.out.print(tablicaOsemkowa[j]);
        }
        System.out.print("\n");
    }

}
