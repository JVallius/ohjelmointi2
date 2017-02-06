package com.jarkkovallius.ohjelmointi2.harjoitus4;

/**

  a) Kirjoita	luokka	Tietokone,	jonka	yksityisiä	kenttinä	ovat	prosessorin	nimi
 (merkkijono),	muistin	määrä	(kokonaisluku,	megatavua)	ja	prosessorin	taajuus
 (desimaaliluku,	gigahertziä).
 b) Kirjoita	luokalle	alustaja,	jonka	parametreina	ovat	nämä	kolme	kenttää.
 c) Kirjoita	luokkaan	Tietokone	yksityiset	metodit,	jonka	avulla	voi	asettaa	olion
 kenttien	arvoja.	Salli	vain	järkevät	muutokset.
 d) Kirjoita	luokan	jokaiselle	kentälle	julkinen	metodi	jonka	avulla	voi	palauttaa
 kentän	arvon.
 e) Kirjoita	luokkaan	Tietokone	metodi,	joka	palauttaa	yhtenä	merkkijonona
 tietokoneen	prosessorin	nimen	ja	taajuuden.

 * Created by Jarkko on 2.2.2017.
 */
public class Tietokone {

    private String prosessoriNimi;
    private double prosessoriKellotaajuusGHz;
    private int muistiMegatavu;

    public Tietokone(String prosessoriNimi, double prosessoriKellotaajuusGHz, int muistiMegatavu) {
        this.prosessoriNimi = prosessoriNimi;
        this.prosessoriKellotaajuusGHz = prosessoriKellotaajuusGHz;
        this.muistiMegatavu = muistiMegatavu;
    }

    public String getProsessoriNimi() {
        return prosessoriNimi;
    }

    public void setProsessoriNimi(String prosessoriNimi) {
        this.prosessoriNimi = prosessoriNimi;
    }

    public double getProsessoriKellotaajuusGHz() {
        return prosessoriKellotaajuusGHz;
    }

    public void setProsessoriKellotaajuusGHz(double prosessoriKellotaajuusGHz) {
        if (prosessoriKellotaajuusGHz > 0) {
            this.prosessoriKellotaajuusGHz = prosessoriKellotaajuusGHz;
        } else {
            this.prosessoriKellotaajuusGHz = 0;
        }
    }

    public int getMuistiMegatavu() {
        return muistiMegatavu;
    }

    public void setMuistiMegatavu(int muistiMegatavu) {
        if (muistiMegatavu > 0) {
            this.muistiMegatavu = muistiMegatavu;
        } else {
            this.muistiMegatavu = 0 ;
        }

    }

    @Override
    public String toString() {
        return "Tietokone{" +
                "prosessoriNimi='" + prosessoriNimi + '\'' +
                ", prosessoriKellotaajuusGHz=" + prosessoriKellotaajuusGHz +
                '}';
    }
}
