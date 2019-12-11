/*
27. Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic027 {

    public static void main(String args[])
    {
        String osemkowa, szesnastkowa;
        int dziesietna;
        Scanner in = new Scanner(System.in);

        System.out.print("Wpisz wartość ósemkową: ");
        osemkowa = in.nextLine();

        dziesietna = Integer.parseInt(osemkowa, 8);
        szesnastkowa = Integer.toHexString(dziesietna);

        System.out.print("Wartość szesnastkowa: " + szesnastkowa + "\n");
    }

}
