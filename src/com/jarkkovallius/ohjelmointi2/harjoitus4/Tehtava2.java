package com.jarkkovallius.ohjelmointi2.harjoitus4;

import java.util.Scanner;

/**
 Teht�v�	2
 Kirjoita seuraavanlainen ohjelma
 a. Ohjelma	kysyy	k�ytt�j�lt�	yhden	desimaaliluvun	ja	sijoittaa	sen	Stringmuuttujaan
 luku.
 b. Ohjelma sijoittaa (muuntaa) muuttujassa luku olevan desimaaliluvun double
 muuttujaan d.
 c. Ohjelma tulostaa muuttujien luku ja d arvot k�ytt�j�lle.

 * Created by Jarkko on 1.2.2017.
 */
public class Tehtava2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String luku ;

        System.out.println("Anna desimaaliluku");
        luku = scanner.nextLine() ;

        double d ;

        try {
            d = Double.parseDouble(luku) ;
            System.out.println("luku: " + luku);
            System.out.println("d: " + d);
        } catch (NumberFormatException e) {
            System.out.println("virheellinen sy�te " );
            System.out.println(e.toString());
        }

        scanner.close();

    }
}
