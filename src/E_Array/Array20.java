//Write a Java program to convert an array to ArrayList.

package E_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array20 {

    public static void main(String[] args) {

        String[] testString = {"Java", "Java", "Java", "Python", "PHP", "C#", "C", "C++"};

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(testString));

        System.out.println(list);
    }
}
