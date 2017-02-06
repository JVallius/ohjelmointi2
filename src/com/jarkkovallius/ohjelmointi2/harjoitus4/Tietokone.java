package com.jarkkovallius.ohjelmointi2.harjoitus4;

/**

  a) Kirjoita	luokka	Tietokone,	jonka	yksityisi�	kenttin�	ovat	prosessorin	nimi
 (merkkijono),	muistin	m��r�	(kokonaisluku,	megatavua)	ja	prosessorin	taajuus
 (desimaaliluku,	gigahertzi�).
 b) Kirjoita	luokalle	alustaja,	jonka	parametreina	ovat	n�m�	kolme	kentt��.
 c) Kirjoita	luokkaan	Tietokone	yksityiset	metodit,	jonka	avulla	voi	asettaa	olion
 kenttien	arvoja.	Salli	vain	j�rkev�t	muutokset.
 d) Kirjoita	luokan	jokaiselle	kent�lle	julkinen	metodi	jonka	avulla	voi	palauttaa
 kent�n	arvon.
 e) Kirjoita	luokkaan	Tietokone	metodi,	joka	palauttaa	yhten�	merkkijonona
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
