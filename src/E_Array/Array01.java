package E_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array01 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158};
        String[] testString = {"Java", "Python", "PHP", "C#", "C", "C++"};

        System.out.println("Oryginalna treść tablicy: " + Arrays.toString(testInt));
        Arrays.sort(testInt);
        System.out.println("Posortowana tablica intów, w kolejności rosnącej: " + Arrays.toString(testInt));

        System.out.println("Oryginalna treść tablicy: " + Arrays.toString(testString));
        Arrays.sort(testString);
        System.out.println("Posortowana tablica Stringów, w kolejności rosnącej: " + Arrays.toString(testString));



//        for (int i = 0; i < testInt.length-1; i++) {
//            int intZero = i;
//            for (int j = i+1; j < testInt.length; j++) {
//                if (testInt[j] < testInt[0])
//                    testInt[0] = testInt[j];
//
//                int temp = testInt[j];
//                testInt[j] = testInt[i];
//                testInt[i] = temp;
//            }
//        }

        for (int i = 0; i < testInt.length/2; i++) {
            int temp = testInt[i];
            testInt[i] = testInt[testInt.length - i -1];
            testInt[testInt.length - i - 1] = temp;
        }

        System.out.println("Posortowana tablica intów, w kolejności malejącej: " + Arrays.toString(testInt));
    }
}
