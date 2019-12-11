package A_Basic_Part_I;/*
19. Write a Java program to convert a decimal number to binary number. Go to the editor
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101

 */

import java.util.Scanner;

public class Basic019 {

    public static void main(String[] args) {

        int dziesietna, quot, i = 1, j;
        int tablicaLiczbyBinarnej[] = new int[100];

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość dziesiętną: ");
        dziesietna = scan.nextInt();

        while (dziesietna != 0) {
            tablicaLiczbyBinarnej[i++] = dziesietna % 2;
            dziesietna = dziesietna / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(tablicaLiczbyBinarnej[j]);
        }
        System.out.print("\n");
    }
}