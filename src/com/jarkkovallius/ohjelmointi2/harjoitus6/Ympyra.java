package com.jarkkovallius.ohjelmointi2.harjoitus6;
/**
 * Luokka on Ympyra-luokka joka esittelee
 * periytymisen käyttää java-kielessä.
 *
 *
 * @author Joku
 * @version 1.00 2011/3/7
 */
public class Ympyra extends GeometrinenOlio {

	/** Ympyrän säde */
	private double sade;

	/** Luodaan ympyrä, jonka säde on 0. */
	public Ympyra() {
	}

    /** Luodaan ympyrä jolla on tietty säde
     * @param sade ympyrän säde*/
    public Ympyra(double sade) {
    	super();
    	this.sade = sade;
    }

    /** Luodaan ympyrä jolla on tietty säde, väri ja täytetty
     *  @param sade ympyrän säde
     *  @param vari ympyrän väri
     *  @param taytetty tosi jos ympyrä täytetty
     */
    public Ympyra(double sade, String vari, boolean taytetty) {
    	super(vari, taytetty);
    	this.sade = sade;
    	// super kutsun voisi korvata:
    	// setVari(vari);
    	// setTaytetty(taytetty)
    }

    /** Palautetaan säde
     *  @return ympyrän säde*/
    public double getSade() {
    	return sade;
    }

    /** Asetetaan uusi säde
     *  @param sade ympyrän uusi säde*/
    public void setSade(double sade) {
    	this.sade = sade;
    }

    /** Palautetaan ympyrän ala
     *  @return ympyrän pinta-ala
     */
    public double getAla() {
    	return sade * sade * Math.PI;
    }

    /** Palautetaan ympyrän kehä
     *  @return ympyrän kehän pituus
     */
    public double getKeha() {
    	return 2 * sade * Math.PI;
    }

    /** Palautetaan ympyrän halkaisija
     *  @return ympyrän halkaisija
     */
    public double getHalkaisija() {
    	return 2 * sade;
    }

    /** Tulostetaan ympyrän tietoja
     *  @return ympyrän luontiajankohta ja säde
     */
    public void tulostaYmpyra() {
    	System.out.println("Ympyrä on luotu " + getLuontiPaiva() +
    		" ja sen säde on " + sade);
    }

    /** Määritellään uudelleen yliluokan GeometrinenOlio metodi toString
     *  @return geometrisen olion tiedot lisättynä ympyrän säteellä*/
    public String toString() {
    	return super.toString() + "\nsade on " + sade;
    }

}