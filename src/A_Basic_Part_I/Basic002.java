/*
2. Write a Java program to print the sum of two numbers. Go to the editor
Test Data:
74 + 36
Expected Output :
110
 */

package A_Basic_Part_I;

public class Basic002 {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = Basic002.suma(23, 15);
        System.out.println(sum);
    }
}
