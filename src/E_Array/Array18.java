//Write a Java program to find the second smallest element in an array.

package E_Array;

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};
        System.out.println("Original array: " + Arrays.toString(testInt));
        Arrays.sort(testInt);
        int secondLowest = testInt[1];
        System.out.println("Second lowest element of an Array is: " + secondLowest);
    }
}
