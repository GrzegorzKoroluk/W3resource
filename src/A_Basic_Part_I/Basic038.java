/*
38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6

 */

package A_Basic_Part_I;

public class Basic038 {

    public static void main(String[] args) {
        String testowyString = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        przelicz(testowyString);
    }

    public static void przelicz(String x) {
        char[] tablicaCharakterow = x.toCharArray();
        int litera = 0;
        int spacja = 0;
        int liczba = 0;
        int inne = 0;

        for (int i = 0; i < tablicaCharakterow.length; i++) {
            if (Character.isLetter(tablicaCharakterow[i])) {
                litera++;
            } else if (Character.isSpaceChar(tablicaCharakterow[i])) {
                spacja++;
            } else if (Character.isDigit(tablicaCharakterow[i])) {
                liczba++;
            } else {
                inne++;
            }
        }

        System.out.println("Liczba liter: " + litera);
        System.out.println("Liczba spacji: " + spacja);
        System.out.println("Liczba cyfr: " + liczba);
        System.out.println("Liczba pozostałych znaków: " + inne);
    }
}