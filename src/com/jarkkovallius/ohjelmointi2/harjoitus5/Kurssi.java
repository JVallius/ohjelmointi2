package com.jarkkovallius.ohjelmointi2.harjoitus5;

import java.util.Arrays;

/**
 * Luokka määrittelee yksinkertaisen kurssin,
 * joka muodostuu kurssin nimestä, opiskelijoista
 * ja opiskelijoiden määrästä.
 *
 */
public class Kurssi {
	private String kurssiNimi;
	private String[] opiskelijat = new String[100];
	private int opiskelijaMaara;

/** Luodaan kurssi, jolla on tietty nimi.
 *  @param kurssiNimi kurssin nimi.
 */
    public Kurssi(String kurssiNimi) {
    	this.kurssiNimi = kurssiNimi;
    }

/** Lisätään opiskelija kurssille.
 *  Kurssilla voi olla enintään 100 opiskelijaa.
 *  @param opiskelija opiskelijan nimi.
 */
    public void lisaaOpiskelija(String opiskelija) {
        if (opiskelijaMaara == opiskelijat.length) {
            System.out.println("Tuplataan taulukon koko");
            opiskelijat = Arrays.copyOf(opiskelijat, opiskelijat.length*2);
        }
    	opiskelijat[opiskelijaMaara] = opiskelija;
    	opiskelijaMaara++;
    }

/** Palauttaa kurssin opiskelijoiden nimet
 *  merkkijonotaulukkona.
 *  @return kurssin opiskelijoiden nimet.
 */
    public String[] palautaOpiskelijat() {
    	return opiskelijat;
    }

/** Palauttaa kurssin opiskelijamäärän.
 *  @return kurssin opiskelijamäärä.
 */
    public int palautaOpiskelijaMaara() {
    	return opiskelijaMaara;
    }

/** Palauttaa kurssin nimen.
 *  @return kurssin nimi.
 */
    public String palautaKurssiNimi() {
    	return kurssiNimi;
    }

/** Poistaa opiskelijan kurssilta.
 *  @param opiskelija opiskelijan nimi.
 */
    public void poistaOpiskelija(String opiskelija) {

        int i = 0 ;
        while (!opiskelijat[i].equals(opiskelija)) {
            i++;
        }

        for (int j = i+1; j < opiskelijaMaara; j++) {
            opiskelijat[j-1] = opiskelijat[j] ;
            opiskelijat[j] = "";
        }

        opiskelijaMaara-- ;
    }


    @Override
    public String toString() {
        String s = palautaKurssiNimi() + "\n";
        for (int i = 0; i < this.palautaOpiskelijaMaara(); i++) {
            s += i + "=" + this.opiskelijat[i] +" \n" ;
        }
        return s ;
    }
}