package E_Array;

import java.util.Arrays;

public class Array15 {

    public static void main(String[] args) {

//        int[] testInt1 = {56, 89, 32, 18, 365, 2, 158, 158, 158};
//
//        int[] testInt2 = {1, 1000, 245, 48, 365, 8, 999, 1453, 1588};
//
        int count=0, duplicatedElement=0;
//
//        for (int i = 0; i < testInt1.length; i++) {
//            for (int j = 0; j < testInt2.length; j++) {
//                if(testInt1[i] == (testInt2[j]))
//                    count++;
//                duplicatedElement=testInt1[i];
//            }
//        }
//        System.out.println("Duplicated Element '" + duplicatedElement + "' occurs " + count + " times.");


        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+ Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                    count++;
                    duplicatedElement=array1[i];
        System.out.println("Duplicated Element '" + duplicatedElement + "' occurs " + count + " times.");
                }
            }
        }
    }
}
