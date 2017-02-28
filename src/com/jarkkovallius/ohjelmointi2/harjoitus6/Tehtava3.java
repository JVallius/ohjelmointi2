package com.jarkkovallius.ohjelmointi2.harjoitus6;

import com.jarkkovallius.ohjelmointi2.harjoitus5.GeometrinenOlio1;

/**
 * Tehtävä	3
 a)	Kirjoita	luennolla	ka? sitellylle	luokalle	GeometrinenOlio	aliluokka	Suunnikas
 (GeometrinenOlio-luokka	löytyy	Moodlesta	paketista	Esimerkit	10:	Periytyminen	ja
 monimuotoisuus).
 b)	Luokan	Suunnikas suojatut	kenta? t	ovat	desimaaliluvut:	sivu1,	sivu2	ja	korkeus.
 c)	Kirjoita	luokalle	parametriton	alustaja.
 d)	Kirjoita	luokalle	alustaja,	joka	saa	parametreina	olion	kaikkien	kenttien	arvot	ja
 ka? ytta?a?	hyva? ksi	yliluokan	alustajaa.
 e)	Kirjoita	luokalle	metodi	joka	laskee	suunnikkaan	pinta-alan	(=	sivu1	*	korkeus)	ja
 piirin	(=	sivu1	+	sivu2	+	sivu1	+	sivu2).
 f)	Kirjoita	luokalle	toString-metodi,	joka	tulostaa	olion	tiedot	merkkijonona	ja	ka? ytta?a?
 hyva? ksi	yliluokan	toString-metodia.
 g)	Kirjoita	pa?a? ohjelma,	joka	luo	yhden	keksima? si	Suunnikas-olion	ja	tulostaa	sitten	sen
 kenttien	tiedot	seka?	pinta-alan	ja	piirin.
 *
 * Created by Jarkko on 23.2.2017.
 */
public class Tehtava3 {
    public static void main(String[] args) {
        Suunnikas suunnikas = new Suunnikas("oranssi", true, 1.5f, 2.4f, 5.2f);

        System.out.println(suunnikas.toString());
        System.out.println("Piiri: " + suunnikas.laskePiiri());
        System.out.println("Pinta-ala: " + suunnikas.laskePintaAla());

    }
}