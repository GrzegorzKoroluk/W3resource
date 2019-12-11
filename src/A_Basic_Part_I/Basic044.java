/*
44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
Sample Output:

Input number: 5
5 + 55  + 555

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic044 {

    public static String obliczenie(int a) {
        return a + " + " + (a * 10 + a) + " + " + (a * 100 + a * 10 + a);
    }

    public static void main(String[] args) {
        System.out.println(obliczenie(5));
    }
}