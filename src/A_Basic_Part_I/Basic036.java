/*
36. Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km

 */

package A_Basic_Part_I;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic036 {

    final static double radius = 6371.01;

    public static double odleglosc (double x1, double y1, double x2, double y2) {
        return radius *  Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Proszę podać szerokość geograficzną pierwszego punktu (w zakresie od 0 do 90): ");
        double lat1 = in.nextDouble();
        if (lat1 < 0 || lat1 > 90) {
            System.out.println("Nieprawidłowa wartość. Podaj wartość z zakresu 0 - 90 stopni.");
        }
        System.out.print("Proszę podać długość geograficzną pierwszego punktu (w zakresie od 0 do 180): ");
        double lon1 = in.nextDouble();
        if (lon1 < 0 || lon1 > 180) {
            System.out.println("Nieprawidłowa wartość. Podaj wartość z zakresu 0 - 180 stopni.");
        }

        System.out.print("Proszę podać szerokość geograficzną drugiego punktu (w zakresie od 0 do 90): ");
        double lat2 = in.nextDouble();
        if (lat2 < 0 || lat2 > 90) {
            System.out.println("Nieprawidłowa wartość. Podaj wartość z zakresu 0 - 90 stopni.");
        }
        System.out.print("Proszę podać długość geograficzną drugiego punktu (w zakresie od 0 do 180): ");
        double lon2 = in.nextDouble();
        if (lon2 < 0 || lon2 > 180) {
            System.out.println("Nieprawidłowa wartość. Podaj wartość z zakresu 0 - 180 stopni.");
        }

        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);

        System.out.println("Obliczona odległość między punktami to: " + odleglosc(x1, y1, x2, y2));
    }
}