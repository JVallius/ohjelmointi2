package com.jarkkovallius.ohjelmointi2.tentti;
/**
 * Tehtävä 2
 *
 * Jarkko Vallius
 * 284576
 *
 */
public class KantaAsiakas extends Asiakas {

	private String email ;
	private int syntymaVuosi ;

	public KantaAsiakas(String nimi, int syntymaVuosi, String osoite, int tunnus,  String email ) {
		super(nimi, tunnus, osoite);
		this.setEmail(email);
		this.setSyntymaVuosi(syntymaVuosi);
	}

	public int getSyntymaVuosi() {
		return syntymaVuosi;
	}

	public void setSyntymaVuosi(int syntymaVuosi) {
		this.syntymaVuosi = syntymaVuosi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "KantaAsiakas [email=" + email + ", syntymaVuosi=" + syntymaVuosi + ", getNimi()=" + getNimi()
				+ ", getTunnus()=" + getTunnus() + ", getOsoite()=" + getOsoite() + ", getOstosSumma()="
				+ getOstosSumma() + "]";
	}







}
