package E_Array;

public class Array04 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158};

        int suma = 0;
        int srednia = 0;

        for (int i = 0; i < testInt.length-1; i++) {
            suma = suma + testInt[i];
        }
        srednia = suma / testInt.length;
        System.out.println(srednia);
    }
}
