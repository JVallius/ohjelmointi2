package com.jarkkovallius.ohjelmointi2.harjoitus6;

import java.util.Scanner;

/**
 *
 * Tehtävä	1
 Kirjoita	ohjelma (komentorivipohjainen),	joka	pyytää	käyttäjältä	kolme	kokonaislukua
 ja	näyttää	niiden	summan.	Jos	käyttäjän	syöte	on	virheellinen	(ei-numeerinen),	niin
 ohjelma	pyytää	luvut	uudestaan.	Käytä	poikkeusten käsittelyä	ja	poikkeusta
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
                System.out.println("Virheellinen syöte");
            }
        } while (n < MAX_NUMBERS);

        System.out.println("Lukujen summa on " + sum);

        scanner.close();


    }
}
