//Write a Java program to find the second largest element in an array.

package E_Array;

import java.util.Arrays;

public class Array17 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};
        System.out.println("Original array: " + Arrays.toString(testInt));
        Arrays.sort(testInt);
        int secondLargest = testInt[testInt.length-2];
        System.out.println("Second largest element of an Array is: " + secondLargest);
    }
}
