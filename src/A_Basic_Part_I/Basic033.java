/*
33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7

 */

package A_Basic_Part_I;

public class Basic033 {

    public static int sumaCyfrLiczby (int a) {
        int count = 0;
        while (a > 0) {
            count += a % 10;
            a /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(3658));
    }
}