/*
7. Write a Java program that takes a number as input and prints its multiplication table up to 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int wczyt = in.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(wczyt + " x " + i + " = " + wczyt*i);
        }
    }
}
