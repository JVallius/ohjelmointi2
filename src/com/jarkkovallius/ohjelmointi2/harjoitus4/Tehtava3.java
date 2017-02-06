package com.jarkkovallius.ohjelmointi2.harjoitus4;

/**

 Teht‰v‰	3
 Kirjoita	luokka	Tietokone,	joka	sis‰lt‰‰	seuraavat	asiat:
 a) Kirjoita	luokka	Tietokone,	jonka	yksityisi‰	kenttin‰	ovat	prosessorin	nimi
 (merkkijono),	muistin	m‰‰r‰	(kokonaisluku,	megatavua)	ja	prosessorin	taajuus
 (desimaaliluku,	gigahertzi‰).
 b) Kirjoita	luokalle	alustaja,	jonka	parametreina	ovat	n‰m‰	kolme	kentt‰‰.
 c) Kirjoita	luokkaan	Tietokone	yksityiset	metodit,	jonka	avulla	voi	asettaa	olion
 kenttien	arvoja.	Salli	vain	j‰rkev‰t	muutokset.
 d) Kirjoita	luokan	jokaiselle	kent‰lle	julkinen	metodi	jonka	avulla	voi	palauttaa
 kent‰n	arvon.
 e) Kirjoita	luokkaan	Tietokone	metodi,	joka	palauttaa	yhten‰	merkkijonona
 tietokoneen	prosessorin	nimen	ja	taajuuden.
 f) Kirjoita	p‰‰ohjelma,	joka	luo	kolme	Tietokone-oliota	sopivilla	keksimill‰si	tiedoilla.
 Sitten	ohjelma	muuttaa	ensimm‰isen	tietokone-olion	kellotaajuudeksi	3.25
 gigahertsi‰	ja	muistin	m‰‰r‰ksi	3000	megatavua	(muuta	muistin	m‰‰r‰	kohdan	c)
 metodin	avulla).	Sitten	ohjelma	tulostaa	kaikkien	kolmen	tietokoneen	kaikkien
 kenttien	tiedot	(k‰yt‰	hyv‰ksi	kohdan	d	metodia).


 * Created by Jarkko on 2.2.2017.
 */
public class Tehtava3 {
    public static void main(String[] args) {

        Tietokone[] tietokoneet = new Tietokone[3] ;

        tietokoneet[0] = new Tietokone("Intel", 1.8, 512) ;
        tietokoneet[1] = new Tietokone("AMD", 0.6, 256) ;
        tietokoneet[2] = new Tietokone("Cyrix", 0.2, 128) ;

        tietokoneet[0].setProsessoriKellotaajuusGHz(3.25);
        tietokoneet[0].setMuistiMegatavu(3000);

        for (int i = 0; i < tietokoneet.length; i++) {
            Tietokone tietokone = tietokoneet[i];
            System.out.println(tietokone.getProsessoriNimi());
            System.out.println(tietokone.getProsessoriKellotaajuusGHz());
            System.out.println(tietokone.getMuistiMegatavu());
            System.out.println();
        }

    }


}
