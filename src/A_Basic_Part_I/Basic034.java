/*
34. Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic034 {

    public static double powierzchniaSzesciokata(int dlugoscBoku) {
        return (6 * (dlugoscBoku * dlugoscBoku)) / (4 * Math.tan(Math.PI / 6));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Długość boku sześciokąta to: ");
        int wczyt = in.nextInt();
        System.out.println("Jeżeli długość boku sześciokąta to " + wczyt + ", to wówczas powierzchnia takiego sześciokąta to " + powierzchniaSzesciokata(wczyt));
    }
}