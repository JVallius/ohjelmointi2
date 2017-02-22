package com.jarkkovallius.ohjelmointi2.harjoitus5;
/**
 * Luokka GeometrinenOlio1 esittelee yksinkertaisen perusmallin
 * geometristen olioiden piirteille. Näiden avulla
 * esitellään periytymisen toimintaa.
 *
 *
 * @author Joku
 * @version 1.00 2011/3/17
 */
public class GeometrinenOlio1 {
	private String vari = "valkoinen";
	private boolean taytetty;
	private java.util.Date luontiPaiva;

/** Luodaan yleinen geometrinen olio oletusalustajalla
 *  värinä valkoinen, tyyppinä täytetty ja luotu nyt.
 */
    public GeometrinenOlio1() {
    	this.luontiPaiva = new java.util.Date();
    }

    /** Luodaan yleinen geometrinen olio tietyllä värillä ja täytettynä
     * @param vari Olion väri
     * @param taytetty totuusarvo onko olio täytetty vai ei.
     */
    public GeometrinenOlio1(String vari, boolean taytetty) {
    	this.luontiPaiva = new java.util.Date();
    	this.vari = vari;
    	this.taytetty = taytetty;
    }

    /** Palautetaan väri
     * @return olion väri merkkijonona.*/
    public String getVari() {
    	return vari;
    }

    /** Asetetaan väri
     *  @param vari Väri merkkijonona.
     */
    public void setVari(String vari) {
    	this.vari = vari;
    }

    /** Palautetaan tieto onko olio täytetty.
     * @return true jos on täytetty.
     */
    public boolean onTaytetty() {
    	return taytetty;
    }

    /** Asetetaan olion täytetty tieto.
     *  @param taytetty asetetaanko olio täytetyksi vai ei.
     */
    public void setTaytetty(boolean taytetty) {
    	this.taytetty = taytetty;
    }

    /** Palautetaan luontipäivä
     *  @return olion luontipäivä.
     */
    public java.util.Date getLuontiPaiva() {
    	return luontiPaiva;
    }

    /** Palautetaan koko oliota kuvaava merkkijono
     *  @return olion tiedot merkkijonona.
     */
    public String toString() {
    	return "luotu " + luontiPaiva + "\nväri: " + vari +
    		" ja täytetty: " + taytetty;
    }



}