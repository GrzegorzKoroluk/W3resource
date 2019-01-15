//Write a Java program to find the maximum and minimum value of an array.

package E_Array;

import java.util.Arrays;

public class Array10 {

    static int max;
    static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        for (int i = 1; i < my_array.length - 1; i = i + 2) {
            if (i + 1 > my_array.length) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }

    public static void main(String[] args) {
            int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};
        max_min(testInt);
        System.out.println(" Original Array: "+Arrays.toString(testInt));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}