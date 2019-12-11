/*
20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic020 {

    public static void main(String[] args) {

        int dziesietna, reszta;
        String szesnastkowa = "";

        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj wartość dziesiętną: ");
        dziesietna = in.nextInt();

        while(dziesietna > 0)
        {
            reszta = dziesietna % 16;
            szesnastkowa = hex[reszta] + szesnastkowa;
            dziesietna = dziesietna / 16;
        }
        System.out.print("Wartość szesnastkowa: " + szesnastkowa + "\n");
    }

}