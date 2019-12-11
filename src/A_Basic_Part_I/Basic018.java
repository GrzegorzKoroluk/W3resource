// NIEZAKONCZONE, PRZECHODZE DALEJ!//


///*
//18. Write a Java program to multiply two binary numbers. Go to the editor
//Input Data:
//Input the first binary number: 10
//Input the second binary number: 11
//Expected Output
//
//Product of two binary numbers: 110
//
// */
//
//package A_Basic_Part_I;
//
//import java.util.Scanner;
//
public class Basic018 {
//
//    public static int przeliczamyNaDziesietny(int dwojkowa) {
//        int dziesietna = 0;
//        int n = 0;
//        while (true) {
//            if (dwojkowa == 0) {
//                break;
//            } else {
//                int temp = dwojkowa % 10;
//                dziesietna += dziesietna + temp * Math.pow(2, n);
//                dwojkowa = dwojkowa / 10;
//                n++;
//            }
//        }
//        return dziesietna;
//    }
//
//
//    public static int przeliczamyNaDwojkowy(int dziesietna) {
//        int dwojkowa = 0;
//        int n = 0;
//        while (true) {
//            if (dziesietna == 0) {
//                break;
//            } else {
//                int temp = dziesietna % 2;
//                dwojkowa += dwojkowa + temp * Math.pow(10, n);
//                dziesietna = dziesietna / 10;
//                n++;
//            }
//        }
//        return dwojkowa;
//    }
//
//
//    public static int mnozenie(int a, int b) {
//        return a * b;
//    }
//
//    public static void main(String[] args) {
//
//        int i = 0, pierwszaLiczba, drugaLiczba;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Podaj pierwszą liczbę dwójkową: ");
//        pierwszaLiczba = in.nextInt();
//        System.out.print("Podaj drugą liczbę dwójkową: ");
//        drugaLiczba = in.nextInt();
//
//        int pierLiczbaDzies = przeliczamyNaDziesietny(pierwszaLiczba);
//        System.out.println("Pierwsza liczba przeliczona na dziesiętny: " + pierLiczbaDzies);
//        int drugLiczbaDzies = przeliczamyNaDziesietny(drugaLiczba);
//        System.out.println("Druga liczba przeliczona na dziesiętny: " + pierLiczbaDzies);
//
//        int rezultat = mnozenie(pierLiczbaDzies, drugLiczbaDzies);
//        System.out.println("Liczby dziesietne pomnożone: " + rezultat);
//
//        int rezultatBinarny = przeliczamyNaDwojkowy(rezultat);
//        System.out.println("Liczby dziesietne pomnożone, przeliczamy na system dwójkowy: " + rezultatBinarny);
//
//        System.out.println(rezultatBinarny);
//    }
}