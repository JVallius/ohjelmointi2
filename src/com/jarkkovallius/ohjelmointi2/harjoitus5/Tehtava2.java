package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**

 Teht‰v‰	2
 a)	Kirjoita	luennolla	k‰sitellylle	luokalle	GeometrinenOlio1 aliluokka	Suunnikas.

 b)	Luokan	olion	suojatut	kent‰t	ovat	desimaaliluvut:	sivu1,	sivu2	ja	korkeus.

 c)	Kirjoita	luokalle	parametriton	alustaja.

 d)	Kirjoita	luokalle	alustaja,	joka	saa	parametreina	olion	kaikkien	kenttien	arvot	ja
 k‰ytt‰‰	hyv‰ksi	yliluokan	alustajaa.

 e)	Kirjoita	luokalle	metodi	joka	laskee	suunnikkaan	pinta-alan	(=	sivu1	*	korkeus)	ja
 piirin	(=	sivu1	+	sivu2	+	sivu1	+	sivu2).

 f)	Kirjoita	luokalle	toString-metodi,	joka	tulostaa	olion	tiedot	merkkijonona	ja	k‰ytt‰‰
 hyv‰ksi	yliluokan	toString-metodia.

 g)	Kirjoita	p‰‰ohjelma,	joka	luo	yhden	keksim‰si	Suunnikas-olion	ja	tulostaa	sitten	sen
 kenttien	tiedot	sek‰	pinta-alan	ja	piirin

 * Created by Jarkko on 7.2.2017.
 */
public class Tehtava2 {
    public static void main(String[] args) {
        Suunnikas suunnikas = new Suunnikas("oranssi", true, 1.5f, 2.4f, 5.2f);

        System.out.println(suunnikas.toString());
        System.out.println("Piiri: " + suunnikas.laskePiiri());
        System.out.println("Pinta-ala: " + suunnikas.laskePintaAla());

    }


}
