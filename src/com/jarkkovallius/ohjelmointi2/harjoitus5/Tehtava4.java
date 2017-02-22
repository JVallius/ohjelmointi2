package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 * Tehtävä	4
 Kirjoita	luentomateriaalissa käsiteltyyn	luokkaa	Kurssi.java	metodi	poistaOpiskelija,	joka
 poistaa	yhden	opiskelijan	kurssilta.
 Muokkaa	luennoilla	käsitellyn	luokan	Kurssi.java	lisaaOpiskelija-metodia	siten,	että	se	ottaa
 huomioon	myös	taulukon	täyttymisen.	Taulukon	täyttyessä	sen	kokoa	kasvatetaan	luomalla
 uusi	kaksi	kertaa	suurempi	taulukko	ja	kopioimalla	nykyisen	taulukon	sisältö	siihen

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
