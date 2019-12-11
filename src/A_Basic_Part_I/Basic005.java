/*
5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */


package A_Basic_Part_I;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Basic005 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        int firstInput = in.nextInt();
        System.out.println("Input second number");
        int secondInput = in.nextInt();
        System.out.println(firstInput + " x " + secondInput + " = " + firstInput*secondInput);
    }
}
