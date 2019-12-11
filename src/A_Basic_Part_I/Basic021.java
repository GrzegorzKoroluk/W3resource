/*
21. Write a Java program to convert a decimal number to octal number. Go to the editor
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic021 {


    public static void main(String[] args) {

        int dziesietna, reszta;
        String osemkowa = "";

        char tablicaOsemkowa[] = {'0','1','2','3','4','5','6','7'};

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj wartość dziesiętną: ");
        dziesietna = in.nextInt();

        while(dziesietna > 0)
        {
            reszta = dziesietna % 8;
            osemkowa = tablicaOsemkowa[reszta] + osemkowa;
            dziesietna = dziesietna / 8;
        }
        System.out.print("Wartość ósemkowa: " + osemkowa + "\n");
    }

}
