//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

package E_Array;

public class Array22 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int sumOfTwo = 0, count = 0;

        for (int i = 0; i < testInt.length-1; i++) {
            for (int j = 1; j < testInt.length; j++) {
                sumOfTwo = testInt[i]+testInt[j];
                if (sumOfTwo == 34)
                    count++;

            }
        }
        if (count>0)
        System.out.println("There are two elements whose sum is equal to 34.");
    }
}
