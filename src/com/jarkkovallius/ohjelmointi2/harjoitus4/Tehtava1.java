package com.jarkkovallius.ohjelmointi2.harjoitus4;

import java.util.Scanner;

/**

 Teht�v�	1
 Kirjoita	seuraavanlainen	ohjelma.
 a. Ohjelma	lukee	k�ytt�j�lt�	kaksi	merkkijonoa	(String)	muuttujiin	sana1 ja
 sana2.
 b. Ohjelma	tutkii	ovat	merkkijonot	samansis�lt�iset	ja	kertoo	testin	tuloksen
 k�ytt�j�lle.
 c. Ohjelma	tutkii	kumpi	merkkijonoista	on	?aakkosj�rjestyksess�	pienempi?	ja
 ilmoittaa	testin	tuloksen	k�ytt�j�lle.
 d. Ohjelma	tulostaa	sana2 merkkijonon	kolmannen	merkin	k�ytt�j�lle.
 e. Ohjelma	tutkii	miss�	kohden	sanoissa	on	kirjain	?a?	ensimm�isen	kerran	ja
 viimeisen	kerran,	ja	kertoo	tulokset	k�ytt�j�lle
 f. Ohjelma	tutkii	kumpi	merkkijonoista	on	pidempi	ja	kertoo	sanojen	pituudet	sek�
 testin	tuloksen	k�ytt�j�lle.
 g. Ohjelma	luo	uuden	merkkijonon,	joka	sis�lt��	sana1 merkkijonon	merkit
 kolmannesta	merkist�	alkaen,	ja	tulostaa	t�m�n	k�ytt�j�lle.
 h. Ohjelma	luo	uuden	merkkijonon,	joka	sis�lt��	sana2 merkkijonon	merkit	4-8	ja
 tulostaa	sen	k�ytt�j�lle.
 i. Ohjelma	yhdist��	kohtien	g	ja	h	merkkijonot	ja	tulostaa	sen	k�ytt�j�lle.
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

        // tutkitaan ovatko merkkijonot sis�ll�lt��n samanlaiset
        System.out.println("SIS�LT�");
        if (sana1.equals(sana2)) {
            System.out.println("sanat ovat samansis�lt�iset");
        } else {
            System.out.println("sanat eiv�t ole samansis�lt�iset");
        }

        System.out.println();

        // tutkitaan aakkosj�rjestys
        System.out.println("AAKKOSJ�RJESTYS");
        int compare = sana1.compareToIgnoreCase(sana2) ;
        if (compare < 0 ) {
            System.out.println("sana1 on aakkosissa ensin");
        } else if (compare > 0) {
            System.out.println("sana2 on aakkosissa ensin");
        } else {
            System.out.println("ei j�rjestyst�: sanat ovat samat");
        }
        System.out.println();


        // tulostetaan kolmas merkki muuttujasta sana2
        System.out.println("TOISEN SANAN KOLMAS MERKKI = " + sana2.charAt(2) );
        System.out.println();


        // tutkitaan ensimm�isen ja viimeisen a-kirjaimen paikka
        char a = 'a' ;
        System.out.println("A-KIRJAIMEN INDEKSI");
        System.out.println("Ensimm�inen:");
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


        // sana1 alkaen kolmannesta merkist�
        System.out.println("SANA1 ALKAEN KOLMANNESTA MERKIST�");
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


        //sanojen yhdist�minen
        System.out.println("SANOJEN YHDISTYS");
        String sanaYhdistetty = null;
        if (sana1Katkaistu != null && sana2Katkaistu != null) {
            sanaYhdistetty = sana1Katkaistu.concat(sana2Katkaistu) ;
            System.out.println(sanaYhdistetty);
        } else {
            System.out.println("Sanoja ei voitu yhdist��");
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
