//Write a Java program to insert an element (specific position) into an array.

package E_Array;

import java.util.Arrays;

public class Array09 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int elementToInsert = 478;
        int positionToInsert = 4;
        int[] newInt = new int[testInt.length+1];

        System.out.println("Original Array : "+ Arrays.toString(testInt));

        for(int i = testInt.length; i > positionToInsert; i--){
           newInt[i] = testInt[i-1];
        }

        for (int i = positionToInsert-1; i > 0; i--) {
            newInt[i] = testInt[i];
        }

        newInt[0] = testInt[0];

        newInt[positionToInsert] = elementToInsert;
        System.out.println("New Array: " + Arrays.toString(newInt));
    }
}