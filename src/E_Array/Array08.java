//Write a Java program to copy an array by iterating the array.

package E_Array;

import java.util.Arrays;

public class Array08 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int[] newInt = new int[9];

        for (int i = 0; i < testInt.length; i++) {
            newInt[i] = testInt[i];
        }

        System.out.println("New array: " + Arrays.toString(newInt));

    }
}
