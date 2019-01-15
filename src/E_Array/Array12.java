//Write a Java program to find the duplicate values of an array of integer values.

package E_Array;

public class Array12 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int count = 0, duplicateElement = 0;

        for (int i = 0; i < testInt.length-1; i++) {
            for (int j = i+1; j < testInt.length; j++) {
                if ((testInt[i] == testInt[j]) && (i != j)) {
                    duplicateElement = testInt[j];
                    count++;
                }
            }
        }
        System.out.println("Duplicate Element '" + duplicateElement + "' occurs " + count + " times.");
    }
}
