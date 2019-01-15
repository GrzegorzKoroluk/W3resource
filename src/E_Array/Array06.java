//Write a Java program to find the index of an array element.

package E_Array;

public class Array06 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int x = 365;
        int index = 0;

        for (int i = 0; i < testInt.length-1; i++) {
            if (testInt[i] == x) {
                index = i;
            }
        }
        System.out.println("Index of the value " + x + " is " + index);
    }
}
