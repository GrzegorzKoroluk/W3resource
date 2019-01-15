//Write a Java program to remove a specific element from an array.

package E_Array;

public class Array07 {

    public static void main(String[] args) {

        int[] testInt = {56, 89, 32, 18, 365, 2, 158, 158, 158};

        int[] newInt = null;

        int elementDoUsuniecia = 158;

//        for(int i = 0; i < testInt.length; i++){
//            if(testInt[i] == elementDoUsuniecia){
//                // shifting elements
//                for(int j = i; j < testInt.length - 1; j++){
//                    testInt[j] = testInt[j+1];
//                }
//                break;
//            }
//        }
//
//        System.out.println("Elements -- " );
//        for(int i = 0; i < testInt.length; i++){
//            System.out.print(" " + testInt[i]);
//        }

        for (int i = 0; i < testInt.length; i++) {
            if (testInt[i] == elementDoUsuniecia) {
                newInt = new int[testInt.length - 1];
                for (int index = 0; index < i; index++) {
                    newInt[index] = testInt[index];
                }
                for (int j = i; j < testInt.length - 1; j++) {
                    newInt[j] = testInt[j + 1];
                }
                break;
            }
        }
        System.out.println("Elements -- ");
        for (int i = 0; i < newInt.length; i++) {
            System.out.print(" " + newInt[i]);
        }
    }
}