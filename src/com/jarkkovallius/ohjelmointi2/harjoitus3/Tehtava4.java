package com.jarkkovallius.ohjelmointi2.harjoitus3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Teht‰v‰	4	(Huom!	T‰st‰ teht‰v‰st‰	2	pistett‰)
Kirjoita	pieni	noppapeli-ohjelma,	joka	toimii	seuraavien	ohjeiden	mukaisesti:

a) Ohjelmassa	on	kahden	nopan	heitt‰mist‰	varten	metodi	heitaNoppia.	Metodi	
palauttaa	nopille	arvotut	arvot	kahden	alkion	kokonaislukutaulukkona.	Metodin	
otsikko	on	public static int[] heitaNoppia()

b) Ohjelmassa	kaksi	pelaajaa	pelaa	toisiaan	vastaan.	Kumpikin	saa	valita	mit‰	peli‰	
h‰n	pelaa.	Vaihtoehdot	ovat:	1)	summa,	2)	jono	ja	3)	pari.
	
c) Jos	pelaaja	pelaa	summaa,	niin	h‰n	saa	pisteikseen	noppien	summan.

d) Jos	pelaaja	pelaa	jonoa,	niin	h‰nen	pit‰‰	saada	kaksi	per‰kk‰ist‰	numeroa.	Jos	
h‰n	saa	ne,	niin	h‰n	saa	niiden	pisteet	kaksinkertaisena	+	6	pistett‰.

e) Jos	pelaaja	pelaa	paria,	niin	h‰nen	pit‰‰	saada	kaksi	samaa	numeroa.	Jos	h‰n	saa	
ne,	niin	h‰n	saa	niiden	pisteet	kolminkertaisena	+	6	pistett‰.

f) Peli‰	pelataan	5	kierrosta	ja	sen	j‰lkeen	julistetaan	pelin	voittaja	metodin	
kerroVoittaja avulla.	Joka	vaiheessa	kerrotaan	pelin	tilanne	metodin	
kerroTilanne avulla.	
 */
public class Tehtava4 {
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in) ;
		final int KIERROKSET = 5 ;
		int input ;
		int pelaajaYksiPisteet = 0, pelaajaKaksiPisteet = 0 ;
		int pisteet = 0;
		// pelaaja yksi = true, pelaaja kaksi = false
		boolean pelaaja = true ;
		
		
		
		for (int c=0; c < KIERROKSET * 2; c++) {
			do {
				pisteet = 0 ;
				
				System.out.println("KIERROS " + (c/2 + 1) + "/" + KIERROKSET);
				System.out.println("Pelaaja " + (pelaaja ? "Yksi" : "Kaksi") + ", valitse peli");
				System.out.println("1 - summa");
				System.out.println("2 - jono");
				System.out.println("3 - pari");
				System.out.print(">");
				input = scanner.nextInt() ;

				// heitet‰‰n nopat
				int [] nopat = heitaNoppia() ;
				System.out.println("Nopat: " + Arrays.toString(nopat));
				
				// pelataan peli
				switch (input) {
					case 1:
						// summa
						pisteet = pelaaSumma(nopat) ;
						break ;
					case 2:
						// jono
						pisteet = pelaaJono(nopat) ;
						break;
					case 3:
						// pari
						pisteet = pelaaPari(nopat) ;
						break;
					default:
						pisteet = -1 ;
						System.out.println("Virheellinen syˆte");
				}
				
				System.out.println("Pisteit‰: " + pisteet );
				System.out.println("");
				
			} while (pisteet == -1) ;
			
			
			// lis‰t‰‰n mahdolliset pisteet vuorossa olevalle pelaajalle
			if (pelaaja) {
				pelaajaYksiPisteet += pisteet ;
			} else {
				pelaajaKaksiPisteet += pisteet ;
			}

			
			// kerrotaan pistetilanne
			System.out.println("TILANNE");
			kerroTilanne(pelaajaYksiPisteet, pelaajaKaksiPisteet);
			
			
			// vaihdetaan pelaajaa
			pelaaja = !pelaaja ;
			
			System.out.println("");
		} // for
		
		System.out.println("PELIN LOPPU");
		kerroVoittaja(pelaajaYksiPisteet, pelaajaKaksiPisteet);
		kerroTilanne(pelaajaYksiPisteet, pelaajaKaksiPisteet);
		
		scanner.close();
	}
	
	/**
	 * Lasketaan kaksialkoisen taulukon luvut yhteen ja palautetaan summa
	 * 
	 * @param nopat
	 * @return
	 */
	public static int pelaaSumma(int[] nopat) {
		return nopat[0] + nopat[1] ;
	}
	
	/**
	 * Jos kaksialkoisen taulukon luvut ovat samat, 
	 * palautetaan ( mopat[0] + nopat[1] ) * 3 + 6
	 * muutoin 0
	 * 
	 * @param nopat kaksialkioinen taulukko
	 * @return
	 */
	private static int pelaaPari(int[] nopat) {
		int pisteet = 0 ;
		if (nopat[0] == nopat[1]) {
			pisteet = (nopat[0] + nopat[1]) * 3 + 6 ;
		}
		return pisteet;
	}

	/**
	 * Jos kaksialkoisen taulukon luvut ovat per‰kk‰iset, 
	 * palautetaan ( mopat[0] + nopat[1] ) * 2 + 6
	 * muutoin 0
	 * 
	 * @param nopat kaksialkioinen taulukko
	 * @return
	 */
	private static int pelaaJono(int[] nopat) {
		int pisteet = 0 ;
		if (Math.abs(nopat[0] - nopat[1]) == 1) {
			pisteet = (nopat[0] + nopat[1]) * 2 + 6 ;
		}
		return pisteet;
	}

	/**
	 * Palauttaa kaksialkioisen taulukon, joiden luvut arvotaan v‰lilt‰ 1...6
	 * 
	 * @return
	 */
	public static int[] heitaNoppia() {
		Random r = new Random();
		return new int[] { (r.nextInt(6) + 1), (r.nextInt(6) + 1) } ;
	}
	
	/**
	 * Tulostaa pelin voittajan
	 * 
	 * @param pelaajaYksiPisteet
	 * @param pelaajaKaksiPisteet
	 */
	public static void kerroVoittaja(int pelaajaYksiPisteet, int pelaajaKaksiPisteet) {
		System.out.print("Voittaja on ");
		if (pelaajaYksiPisteet > pelaajaKaksiPisteet) {
			System.out.print("Pelaaja Yksi");
		} else {
			System.out.print("Pelaaja Kaksi");
		}
		System.out.println("");
	}
	
	/**
	 * Tulostaa pistetilanteen
	 * 
	 * @param pelaajaYksiPisteet
	 * @param pelaajaKaksiPisteet
	 */
	public static void kerroTilanne(int pelaajaYksiPisteet, int pelaajaKaksiPisteet) {
		System.out.println("Pelaaja Yksi: " + pelaajaYksiPisteet + " pistett‰");
		System.out.println("Pelaaja Kaksi: " + pelaajaKaksiPisteet + " pistett‰");
	}
	

	
	
}