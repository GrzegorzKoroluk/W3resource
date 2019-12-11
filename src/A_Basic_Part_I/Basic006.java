/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic006 {

    public static int dodawanie(int a, int b) {
        return a + b;
    }

    public static int odejmowanie(int a, int b) {
        return a - b;
    }

    public static int mnożenie(int a, int b) {
        return a * b;
    }

    public static int dzielenie(int a, int b) {
        return (int) (a / b);
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstInput = in.nextInt();
        System.out.print("Input second number: ");
        int secondInput = in.nextInt();

        System.out.println(firstInput + " + " + secondInput + " = " + dodawanie(firstInput, secondInput));
        System.out.println(firstInput + " - " + secondInput + " = " + odejmowanie(firstInput, secondInput));
        System.out.println(firstInput + " x " + secondInput + " = " + mnożenie(firstInput, secondInput));
        System.out.println(firstInput + " : " + secondInput + " = " + dzielenie(firstInput, secondInput));
        System.out.println(firstInput + " % " + secondInput + " = " + modulo(firstInput, secondInput));
    }

}
