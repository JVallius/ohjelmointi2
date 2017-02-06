package com.jarkkovallius.ohjelmointi2.harjoitus4;

/**

 Teht‰v‰	4
 Kirjoita	p‰‰ohjelma,	jossa	luodaan	ja	k‰sitell‰‰n	teht‰v‰n	kolme Tietokone-olioista
 koostuvaa	10	tietokoneen	taulukkoa.

 Ohjelmassa	luodaan	5	tietokonetta,	joille	annetaan sopivat	tiedot.
 Sitten	tietokoneen	1	muistin	m‰‰r‰ksi	asetetaan	2000	megatavua
 ja
 tietokoneen	2	prosessorin	taajuudeksi	1.66	gigahertsi‰.

 Lopuksi	tulostetaan	kaikkien luotujen	tietokoneiden	kaikki	tiedot

 * Created by Jarkko on 2.2.2017.
 */
public class Tehtava4 {
    public static void main(String[] args) {
        Tietokone[] tietokoneet = new Tietokone[10];

        tietokoneet[0] = new Tietokone("Intel", 1.8, 512) ;
        tietokoneet[1] = new Tietokone("AMD", 0.6, 256) ;
        tietokoneet[2] = new Tietokone("Cyrix", 0.2, 128) ;
        tietokoneet[3] = new Tietokone("AMD", 0.6, 256) ;
        tietokoneet[4] = new Tietokone("Cyrix", 0.2, 128) ;

        tietokoneet[0].setMuistiMegatavu(2000);
        tietokoneet[1].setProsessoriKellotaajuusGHz(1.66);

        for (int i = 0; i < tietokoneet.length; i++) {
            Tietokone tietokone = tietokoneet[i];
            System.out.println("Tietokone " + (i+1) + ":");
            if (tietokone != null) {
                System.out.println("Prosessori=" + tietokone.getProsessoriNimi());
                System.out.println("Kellotaajuus=" +tietokone.getProsessoriKellotaajuusGHz());
                System.out.println("Muisti=" + tietokone.getMuistiMegatavu());
            } else {
                System.out.println("-");
            }
            System.out.println();
        }
    }
}
