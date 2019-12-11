/*
28. Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic028 {

    public static int szesnastkowaNaDziesietna(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static void main(String args[])
    {
        String szesnastkowa;
        int dziesietna;
        Scanner scan = new Scanner(System.in);

        System.out.print("Wpiszmy wartość szesnastkową: ");
        szesnastkowa = scan.nextLine();

        dziesietna = szesnastkowaNaDziesietna(szesnastkowa);

        System.out.print("Wartość dziesiętna: " + dziesietna + "\n");
    }

}
