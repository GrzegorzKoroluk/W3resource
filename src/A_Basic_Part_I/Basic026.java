/*
26. Write a Java program to convert a octal number to a binary number. Go to the editor
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111

 */

package A_Basic_Part_I;

import java.util.Scanner;

public class Basic026 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] tablicaWartosciOsemkowych = {0, 1, 10, 11, 100, 101, 110, 111};
        long osemkowa, tymczasowaOsemkowa, dwojkowa, miejsce;
        int reszta;
        System.out.print("Podaj wartosc ósemkową: ");
        osemkowa = in.nextLong();
        tymczasowaOsemkowa = osemkowa;
        dwojkowa = 0;
        miejsce = 1;
        while (tymczasowaOsemkowa != 0)
        {
            reszta = (int) (tymczasowaOsemkowa % 10);
            dwojkowa = tablicaWartosciOsemkowych[reszta] * miejsce + dwojkowa;
            tymczasowaOsemkowa /= 10;
            miejsce *= 1000;
        }
        System.out.print("Wartość dwójkowa to: " + dwojkowa + "\n");
    }

}
