package com.jarkkovallius.ohjelmointi2.tentti;
import java.util.ArrayList;
import java.util.List;

/**
 * Teht‰v‰ 3
 *
 * Jarkko Vallius
 * 284576
 *
 *
 *
Ohjelman tulostus:


Kanta-asiakkaat:
- ei kanta-asiakkaita
Kanta-asiakkaat:
KantaAsiakas [email=vaarala@gmail.com, syntymaVuosi=1980, getNimi()=Ville Vaara, getTunnus()=123, getOsoite()=Mutalalantie 4, 80100 Joensuu, getOstosSumma()=320.95]
Suurin asiakas Ville Vaara
KantaAsiakas [email=vaarala@gmail.com, syntymaVuosi=1980, getNimi()=Ville Vaara, getTunnus()=123, getOsoite()=Mutalalantie 4, 80100 Joensuu, getOstosSumma()=320.95]



 */
public class Asiakkaat {

	private List<Asiakas> asiakasList ;

	public Asiakkaat() {
		this.asiakasList = new ArrayList<Asiakas>();
	}

	public static void main(String[] args) {
		 Asiakkaat kauppa = new Asiakkaat();
		 Asiakas eka = new Asiakas("Maija Meri", 11, "Leilitie 12, 80100 Joensuu");
		 eka.lisaaOstosSummaan(123.45);
		 kauppa.lisaaAsiakas(eka);
		 kauppa.tulostaKantaAsiakkaat();
		 KantaAsiakas toka = new KantaAsiakas("Ville Vaara", 1980,
				 "Mutalalantie 4, 80100 Joensuu", 123, "vaarala@gmail.com");
		 toka.lisaaOstosSummaan(100);
		 toka.lisaaOstosSummaan(220.95);
		 kauppa.lisaaAsiakas(toka);
		 kauppa.tulostaKantaAsiakkaat();
		 System.out.println("Suurin asiakas " + kauppa.enitenOstoja());
		 String nimi = kauppa.enitenOstoja();
		 System.out.println(kauppa.getAsiakas(nimi));
	}

	private Asiakas getAsiakas(String nimi) {
		for (Asiakas a : asiakasList) {
			if (a.getNimi().equals(nimi)) {
				return a ;
			}
		}
		return null;
	}

	/**
	 * Etsit‰‰n asiakas kell‰ on eniten ostoja
	 *
	 * @return Asiakkaan nimi
	 */
	private String enitenOstoja() {
		Asiakas enitenOstoja = null ;

		for (int i=0; i < asiakasList.size(); i++) {
			if (i == 0) {
				enitenOstoja = asiakasList.get(i);
			} else {
				if (asiakasList.get(i).compareTo(enitenOstoja) > 0) {
					enitenOstoja = asiakasList.get(i);
				}
			}
		}
		return enitenOstoja.getNimi();
	}

	/**
	 * Lis‰t‰‰n asiakas asiakasList -listaan
	 *
	 * @param asiakas Asiakas olio
	 */
	private void lisaaAsiakas(Asiakas asiakas) {
		this.asiakasList.add(asiakas);
	}

	/**
	 * Tulostetaan kanta-asiakkaat
	 * jos kanta-asiakkaita ei ole, tulostetaan "ei kanta-asiakkaita"
	 */
	private void tulostaKantaAsiakkaat() {
		System.out.println("Kanta-asiakkaat:");
		boolean onKantaAsiakkaita = false ;
		for (Asiakas a : asiakasList) {
			if (a instanceof KantaAsiakas) {
				System.out.println(a.toString());
				onKantaAsiakkaita = true ;
			}
		}

		if (!onKantaAsiakkaita) {
			System.out.println("- ei kanta-asiakkaita");
		}

	}

}
