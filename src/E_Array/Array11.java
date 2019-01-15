//Write a Java program to reverse an array of integer values.

package E_Array;

import java.util.Arrays;

public class Array11 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        System.out.println("Original array : " + Arrays.toString(testInt));

        for (int i = 0; i < testInt.length/2; i++) {
            int temp = testInt[i];
            testInt[i] = testInt[testInt.length - i -1];
            testInt[testInt.length - i -1] = temp;
        }
        System.out.println("Reversed array : " + Arrays.toString(testInt));
    }
}
