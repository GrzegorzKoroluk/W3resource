/*
37. Write a Java program to reverse a string. Go to the editor
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT

 */

package A_Basic_Part_I;

public class Basic037 {

    public static void main(String[] args) {

        String regularText = "The quick brown fox";

        String odwroconyText = "";
        for (int i = regularText.length(); i > 0 ; --i) {
            odwroconyText = odwroconyText + regularText.charAt(i - 1);
        }
        System.out.println(odwroconyText);
    }
}