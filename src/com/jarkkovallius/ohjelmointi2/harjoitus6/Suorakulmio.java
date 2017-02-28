package com.jarkkovallius.ohjelmointi2.harjoitus6;
/**
 * Suorakulmio.java kuvaa yksinkertaista suorakulmiota
 * joka sisältää myäs geometrisen olion yleisen ominaisuudet.
 *
 *
 * @version 1.00 2011/3/7
 */
public class Suorakulmio extends GeometrinenOlio {

	/** Suorakulmion leveys ja korkeus */
	private double leveys;
	private double korkeus;

    /** Luodaan nollan kokoinen suorakulmio */
    public Suorakulmio() {
    }

    /** Luodaan tietyn kokoinen suorakulmio
     *  @param leveys
     *  @param korkeus
     */
    public Suorakulmio(double leveys, double korkeus) {
    	this.leveys = leveys;
    	this.korkeus = korkeus;
    }

    /** Luodaan suorakulmio jolla on tietty koko, väri ja täytetty
     *  @param leveys
     *  @param korkeus
     *  @param vari
     *  @param taytetty
     */
    public Suorakulmio(double leveys, double korkeus, String vari,
                       boolean taytetty) {
    	this.leveys = leveys;
    	this.korkeus = korkeus;
    	setVari(vari);
    	setTaytetty(taytetty);
    	// Tai: super(vari, taytetty);
    }

    /** Palautetaan leveys
     *  @return leveys*/
    public double getLeveys() {
    	return leveys;
    }

    /** Asetetaan uusi leveys
     *  @param leveys
     */
    public void setLeveys(double leveys) {
    	this.leveys = leveys;
    }

    /** Palautetaan korkeus
     *  @return korkeus*/
    public double getKorkeus() {
    	return korkeus;
    }

    /** Asetetaan uusi korkeus
     *  @return korkeus*/
    public void setKorkeus(double korkeus) {
    	this.korkeus = korkeus;
    }

    /** Palautetaan ala
     *  @return suorakulmion ala*/
    public double getAla() {
    	return leveys * korkeus;
    }

    /** Palautetaan halkaisija
     *  @return suorakulmion halkaisija
     */
    public double getKeha() {
    	return 2 * (leveys + korkeus);
    }

}