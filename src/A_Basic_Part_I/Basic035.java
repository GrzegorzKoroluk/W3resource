/*
35. Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic035 {

    public static double powierzchnia (int iloscBokow, int dlugoscBoku) {
        return (iloscBokow * (dlugoscBoku * dlugoscBoku)) / (4.0 * Math.tan((Math.PI / iloscBokow)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ilość boków: ");
        int iloscBokow = in.nextInt();
        System.out.print("Długość boku: ");
        int dlugoscBoku = in.nextInt();
        System.out.println("Powierzchnia to: " + powierzchnia(iloscBokow, dlugoscBoku));
    }
}