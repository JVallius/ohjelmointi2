package com.jarkkovallius.ohjelmointi2.harjoitus6;

/**
 *
 *  a)	Kirjoita	luennolla	ka? sitellylle	luokalle	GeometrinenOlio	aliluokka	Suunnikas
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


 * Created by Jarkko on 23.2.2017.
 */
public class Suunnikas extends GeometrinenOlio {
    protected float sivu1 ;
    protected float sivu2 ;
    protected float korkeus ;

    public Suunnikas() {
    }

    public Suunnikas(String vari, boolean taytetty, float sivu1, float sivu2, float korkeus) {
        super(vari, taytetty);
        this.sivu1 = sivu1;
        this.sivu2 = sivu2;
        this.korkeus = korkeus;
    }

    public float laskePintaAla() {
        return sivu1 * korkeus;
    }

    public float laskePiiri() {
        return sivu1 * 2 + sivu2 * 2 ;
    }

    /**
     * Vertailee Suunnikas -olioita pinta-alan perusteella
     *
     * @param obj Suunnikas-olio johon verrataan
     * @return true jos suunnikkaiden pinta-alat ovat samat, muutoin false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Suunnikas && ((Suunnikas)obj).laskePintaAla() == this.laskePintaAla()) {
            return true ;
        } else {
            return false ;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Suunnikas{" +
                "sivu1=" + sivu1 +
                ", sivu2=" + sivu2 +
                ", korkeus=" + korkeus +
                '}';
    }
}