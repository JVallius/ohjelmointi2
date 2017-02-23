package com.jarkkovallius.ohjelmointi2.harjoitus6;

import java.util.Scanner;

/**
 *
 * Teht�v�	1
 Kirjoita	ohjelma (komentorivipohjainen),	joka	pyyt��	k�ytt�j�lt�	kolme	kokonaislukua
 ja	n�ytt��	niiden	summan.	Jos	k�ytt�j�n	sy�te	on	virheellinen	(ei-numeerinen),	niin
 ohjelma	pyyt��	luvut	uudestaan.	K�yt�	poikkeusten k�sittely�	ja	poikkeusta
 NumberFormatException.

 * Created by Jarkko on 22.2.2017.
 */
public class Tehtava1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_NUMBERS = 3 ;
        int n = 0;
        String input  ;
        int sum = 0 ;


        do {
            try {
                System.out.println("Anna luku " + (n+1) + "/" + MAX_NUMBERS);
                input = scanner.nextLine();
                sum += Integer.parseInt(input);
                n++;
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen sy�te");
            }
        } while (n < MAX_NUMBERS);

        System.out.println("Lukujen summa on " + sum);

        scanner.close();


    }
}
