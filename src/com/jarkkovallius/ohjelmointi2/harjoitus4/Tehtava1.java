package com.jarkkovallius.ohjelmointi2.harjoitus4;

import java.util.Scanner;

/**

 Tehtävä	1
 Kirjoita	seuraavanlainen	ohjelma.
 a. Ohjelma	lukee	käyttäjältä	kaksi	merkkijonoa	(String)	muuttujiin	sana1 ja
 sana2.
 b. Ohjelma	tutkii	ovat	merkkijonot	samansisältöiset	ja	kertoo	testin	tuloksen
 käyttäjälle.
 c. Ohjelma	tutkii	kumpi	merkkijonoista	on	?aakkosjärjestyksessä	pienempi?	ja
 ilmoittaa	testin	tuloksen	käyttäjälle.
 d. Ohjelma	tulostaa	sana2 merkkijonon	kolmannen	merkin	käyttäjälle.
 e. Ohjelma	tutkii	missä	kohden	sanoissa	on	kirjain	?a?	ensimmäisen	kerran	ja
 viimeisen	kerran,	ja	kertoo	tulokset	käyttäjälle
 f. Ohjelma	tutkii	kumpi	merkkijonoista	on	pidempi	ja	kertoo	sanojen	pituudet	sekä
 testin	tuloksen	käyttäjälle.
 g. Ohjelma	luo	uuden	merkkijonon,	joka	sisältää	sana1 merkkijonon	merkit
 kolmannesta	merkistä	alkaen,	ja	tulostaa	tämän	käyttäjälle.
 h. Ohjelma	luo	uuden	merkkijonon,	joka	sisältää	sana2 merkkijonon	merkit	4-8	ja
 tulostaa	sen	käyttäjälle.
 i. Ohjelma	yhdistää	kohtien	g	ja	h	merkkijonot	ja	tulostaa	sen	käyttäjälle.
 j. Ohjelma	muuttaa kohdan	i	merkkijonon	kaikki	i-kirjaimet	e-kirjaimeksi.


 * Created by Jarkko on 1.2.2017.
 */
public class Tehtava1 {
    public static void main(String[] args) {
        String sana1, sana2;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Anna sana 1 :");
        sana1 = scanner.nextLine();
        System.out.println("Anna sana 2 :");
        sana2 = scanner.nextLine();


        System.out.println("sana1 = " + sana1);
        System.out.println("sana2 = " + sana2);

        System.out.println();

        // tutkitaan ovatko merkkijonot sisällöltään samanlaiset
        System.out.println("SISÄLTÖ");
        if (sana1.equals(sana2)) {
            System.out.println("sanat ovat samansisältöiset");
        } else {
            System.out.println("sanat eivät ole samansisältöiset");
        }

        System.out.println();

        // tutkitaan aakkosjärjestys
        System.out.println("AAKKOSJÄRJESTYS");
        int compare = sana1.compareToIgnoreCase(sana2) ;
        if (compare < 0 ) {
            System.out.println("sana1 on aakkosissa ensin");
        } else if (compare > 0) {
            System.out.println("sana2 on aakkosissa ensin");
        } else {
            System.out.println("ei järjestystä: sanat ovat samat");
        }
        System.out.println();


        // tulostetaan kolmas merkki muuttujasta sana2
        System.out.println("TOISEN SANAN KOLMAS MERKKI = " + sana2.charAt(2) );
        System.out.println();


        // tutkitaan ensimmäisen ja viimeisen a-kirjaimen paikka
        char a = 'a' ;
        System.out.println("A-KIRJAIMEN INDEKSI");
        System.out.println("Ensimmäinen:");
        System.out.println("sana1 = " + sana1.indexOf(a) + " sana2 = " + sana2.indexOf(a) );
        System.out.println("Viimeinen:");
        System.out.println("sana1 = " + sana1.lastIndexOf(a) + " sana2 = " + sana2.lastIndexOf(a) );
        System.out.println();


        // merkkijonojen pituudet
        System.out.println("SANOJEN PITUUDET");
        int sana1Pituus = sana1.length() ;
        int sana2Pituus = sana2.length();

        System.out.println("sana1 = " + sana1Pituus + " sana2 = " + sana2Pituus);

        if (sana1Pituus > sana2Pituus) {
            System.out.println("sana1 on pidempi");
        } else if (sana1Pituus < sana2Pituus) {
            System.out.println("sana2 on pidempi");
        } else {
            System.out.println("sanat ovat samanpituiset");
        }
        System.out.println();


        // sana1 alkaen kolmannesta merkistä
        System.out.println("SANA1 ALKAEN KOLMANNESTA MERKISTÄ");
        String sana1Katkaistu = null  ;
        if (sana1Pituus >= 3) {
            sana1Katkaistu = sana1.substring(2);
            System.out.println(sana1Katkaistu);
        } else {
            System.out.println("sana1 oli liian lyhyt");
        }
        System.out.println();



        // sana2 merkit 4-8
        System.out.println("SANA2 MERKIT 4-8");
        String sana2Katkaistu = null;
        if (sana2Pituus >= 8) {
            sana2Katkaistu = sana2.substring(3, 7) ;
            System.out.println(sana2Katkaistu);
        } else {
            System.out.println("sana2 oli liian lyhyt");
        }
        System.out.println();


        //sanojen yhdistäminen
        System.out.println("SANOJEN YHDISTYS");
        String sanaYhdistetty = null;
        if (sana1Katkaistu != null && sana2Katkaistu != null) {
            sanaYhdistetty = sana1Katkaistu.concat(sana2Katkaistu) ;
            System.out.println(sanaYhdistetty);
        } else {
            System.out.println("Sanoja ei voitu yhdistää");
        }
        System.out.println();


        // i-kirjainten muunnos e-kirjaimeksi
        System.out.println("MERKKIJONON I-KIRJAIMET E-KIRJAIMEKSI");
        if (sanaYhdistetty != null) {
            sanaYhdistetty = sanaYhdistetty.replaceAll("[i]", "e") ;
            System.out.println(sanaYhdistetty);

        }

        scanner.close();
    }
}
