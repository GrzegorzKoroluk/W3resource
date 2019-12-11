/*
3. Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16
 */

package A_Basic_Part_I;

public class Basic003 {

    public static double dzielenie(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        double wynik = Basic003.dzielenie(230, 15);
        System.out.println(wynik);
    }
}