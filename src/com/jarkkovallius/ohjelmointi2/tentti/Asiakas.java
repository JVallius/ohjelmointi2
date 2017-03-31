package com.jarkkovallius.ohjelmointi2.tentti;
/**
 * Tehtävä 1
 *
 * Jarkko Vallius
 * 284576
 *
 */
public class Asiakas implements Comparable<Asiakas>{

	private String nimi ;
	private int tunnus ;
	private String osoite ;
	private double ostosSumma;



	public Asiakas(String nimi, int tunnus, String osoite) {
		super();
		this.nimi = nimi;
		this.tunnus = tunnus;
		this.osoite = osoite;
		this.ostosSumma = 0 ;
	}

	@Override
	public int compareTo(Asiakas arg0) {
		if (this.ostosSumma > arg0.getOstosSumma()) {
			return 1 ;
		} else if (this.ostosSumma < arg0.getOstosSumma()) {
			return -1;
		} else {
			return 0;
		}
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getTunnus() {
		return tunnus;
	}

	public void setTunnus(int tunnus) {
		this.tunnus = tunnus;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public double getOstosSumma() {
		return ostosSumma;
	}

	public void lisaaOstosSummaan(double ostos) {
		this.ostosSumma += ostos;
	}

	@Override
	public String toString() {
		return "Asiakas [nimi=" + nimi + ", tunnus=" + tunnus + ", osoite=" + osoite + ", ostosSumma=" + ostosSumma
				+ "]";
	}



}
