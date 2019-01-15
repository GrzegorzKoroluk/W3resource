//Write a Java program to find the duplicate values of an array of string values.

package E_Array;

public class Array13 {

    public static void main(String[] args) {

        String[] testString = {"Java", "Java", "Java", "Python", "PHP", "C#", "C", "C++"};

        int count = 0;
        String duplicatedElement = "";

        for (int i = 0; i < testString.length-1; i++) {
            for (int j = 1; j < testString.length; j++) {
                if (testString[i].equals(testString[j]) && (i != j)) {
                    count++;            // why 4 times??????????????????????
                    duplicatedElement = testString[j];
                }
            }
        }
        count = count-1;            // ??????????????????????
        System.out.println("Duplicated Element '" + duplicatedElement + "' occurs " + count + " times.");
    }
}
