package com.sdajava.nww;

import java.util.Scanner;

public class Main {
    public static int nww(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static void main(String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        a =  in.nextInt();
        System.out.println("Podaj druga liczbe: ");
        b = in.nextInt();

        System.out.println("NWW liczb " + a + " i " + b + " wynosi: " + ((a*b)/nww(a,b)));


    }
}
