//Write a Java program to test if an array contains a specific value.

package E_Array;

public class Array05 {
    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int x = 158;
        int count = 0;

        for (int i = 0; i < testInt.length; i++) {
            if (testInt[i] == x) {
                count++;
            }
        }
            if (count > 0)
            System.out.println("Array contains 'x = " + x + "' -" + count + " times.");
    }
}
