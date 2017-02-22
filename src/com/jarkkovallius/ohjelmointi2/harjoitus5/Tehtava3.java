package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 * Teht‰v‰	3
 Kirjoita	ohjelma	joka	k‰ytt‰‰	luennoilla	k‰sitelty‰	luokkaa	KokonaislukuPino.java.	Ohjelma
 lis‰‰,	poistaa	sek‰	tutkii	pinon	alkioita.	Voit	itse	keksi‰	sopivat	toimenpiteet	ja	niiden	sis‰llˆn.
 *
 * Created by Jarkko on 19.2.2017.
 */
public class Tehtava3 {
    public static void main(String[] args) {
        KokonaislukuPino pino = new KokonaislukuPino(6);

        int luku = 0 ;
        System.out.println("lis‰t‰‰n " + (luku=3));
        pino.lisaa(luku);

        System.out.println("lis‰t‰‰n " + (luku=6));
        pino.lisaa(luku);

        System.out.println("lis‰t‰‰n " + (luku=8));
        pino.lisaa(luku);

        System.out.println("p‰‰llimm‰inen " + pino.paallimmainen());

        System.out.println("poistetaan p‰‰llimm‰inen");
        pino.poista();
        System.out.println("p‰‰llimm‰inen " + pino.paallimmainen());

        System.out.println("lis‰t‰‰n " + (luku=12));
        pino.lisaa(luku);
        System.out.println("p‰‰llimm‰inen " + pino.paallimmainen());

        System.out.println();

        System.out.println("tyhjennet‰‰n pino");
        while (!pino.tyhja()) {
            System.out.println("p‰‰llimm‰inen " + pino.paallimmainen());
            System.out.println("poistetaan p‰‰llimm‰inen");
            pino.poista();
        }







    }
}
