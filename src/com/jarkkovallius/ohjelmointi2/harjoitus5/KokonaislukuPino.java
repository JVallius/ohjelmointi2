package com.jarkkovallius.ohjelmointi2.harjoitus5;
/**
 *
 * Luokka käsittelee kokonaislukuja pinorakenteena.
 *
 *
 */
public class KokonaislukuPino {
	private int[] alkiot;
	private int koko;
	public static final int OLETUS_KOKO = 16;

/** Luo kokonaislukupinon, jonka koko on
 *  OLETUS_KOKO eli 16 lukua.
 */
	public KokonaislukuPino() {
		this(OLETUS_KOKO);
	}

/** Luo kokonaislukupinon, johon sopii parameterina
 *  annettu määrä kokonaislukuja.
 *  @param koko pinon alkioiden määrä.
 */
    public KokonaislukuPino(int koko) {
    	alkiot = new int[koko];
    }

/** Lisää pinon päälle kokonaisluvun.
 *  @param arvo pinoon lisättävä kokonaisluku.
 */
    public void lisaa(int arvo) {
    	if (koko >= alkiot.length) {
    		int[] temp = new int[alkiot.length * 2];
    		System.arraycopy(alkiot, 0, temp, 0, alkiot.length);
    		alkiot = temp;
    	}
    	alkiot[koko++] = arvo;
    }

/** Poistaa pinon päällimmäisen alkion ja
 *  palauttaa sen.
 *  @return poistettu alkio.
 */
    public int poista() {
    	return alkiot[--koko];
    }

/** Palauttaa pinon päällimmäisen alkion.
 *  @return pinon päällimmäinen alkio.
 */
    public int paallimmainen() {
    	return alkiot[koko -1];
    }

/** Palauttaa tiedon onko pino tyhjä.
 *  @return totuusarvo onko pino tyhjä.
 */
    public boolean tyhja() {
    	return koko == 0;
    }

/** Palauttaa pinon alkioiden määrän.
 *  @return pinon alkioiden määrä.
 */
    public int palautaKoko() {
    	return koko;
    }

}