package E_Array;

import java.io.Console;

public class Array02 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158};

        int suma = 0;

        for (int i = 0; i < testInt.length; i++) {
            suma = suma + testInt[i];
        }
        System.out.println("Suma liczba to: " + suma);
        }
    }