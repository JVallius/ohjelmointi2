package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 * Teht�v�	4
 Kirjoita	luentomateriaalissa k�siteltyyn	luokkaa	Kurssi.java	metodi	poistaOpiskelija,	joka
 poistaa	yhden	opiskelijan	kurssilta.
 Muokkaa	luennoilla	k�sitellyn	luokan	Kurssi.java	lisaaOpiskelija-metodia	siten,	ett�	se	ottaa
 huomioon	my�s	taulukon	t�yttymisen.	Taulukon	t�yttyess�	sen	kokoa	kasvatetaan	luomalla
 uusi	kaksi	kertaa	suurempi	taulukko	ja	kopioimalla	nykyisen	taulukon	sis�lt�	siihen

 * Created by Jarkko on 19.2.2017.
 */
public class Tehtava4 {
    public static void main(String[] args) {
        Kurssi kurssi = new Kurssi("Diskreetit rakenteet");

        kurssi.lisaaOpiskelija("A");
        kurssi.lisaaOpiskelija("B");
        kurssi.lisaaOpiskelija("C");
        kurssi.lisaaOpiskelija("D");

        System.out.println(kurssi.toString());

        System.out.println("poistetaan C");
        kurssi.poistaOpiskelija("C");

        System.out.println(kurssi.toString());


        for (int i=0; i < 110; i++) {
            kurssi.lisaaOpiskelija("Opiskelija" + i);
        }

        System.out.println(kurssi.toString());





    }




}
