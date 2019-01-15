//Write a Java program to remove duplicate elements from an array.

package E_Array;

import java.util.Arrays;

public class Array16 {

    public static void main(String[] args) {

        arrayUnique(new int[] {56, 89, 32, 18, 365, 2, 158, 158, 158, 158});
    }

    static void arrayUnique (int[] testInt) {
        System.out.println("Original array: " + Arrays.toString(testInt));
        for (int i = 0; i < testInt.length; i++) {
            System.out.println(testInt[i] + "\t");
        }
        int replacement = testInt.length;
        for (int i = 0; i < replacement; i++) {
            for (int j = i+1; j < replacement; j++) {
                if(testInt[i] == testInt[j]) {
                    testInt[j] = testInt[replacement-1];
                    replacement--;
                    j--;
                }
            }
        }
        int[] newInt = Arrays.copyOf(testInt, replacement);
        System.out.println();
        System.out.println("Array with unique values : ");
        for (int i = 0; i < newInt.length; i++) {
            System.out.println(newInt[i]+"\t");
        }
        System.out.println();
        System.out.println("-------------------------");
    }
}