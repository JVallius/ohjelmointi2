package com.jarkkovallius.ohjelmointi2.harjoitus2;

import java.util.Scanner;

/*
Tehtävä	4

Tee	Java-ohjelma	Tunnista,	joka	kysyy	käyttäjältä	kokonaislukuja	ja	lopettaa	saatuaan	
sovitun	lopetusluvun	(nimetty	vakio	LOPPU,	esimerkkitulostuksessa -1).	Kustakin	luvusta	
käyttäjälle	ilmoitetaan	onko	luku	parillinen	vai	pariton.	Lopuksi	annetaan	kaikkien	
käsiteltyjen	sekä	parillisten	ja parittomien	lukujen	keskiarvo.	Jos	syötetyissä	luvuissa	ei	ole	
yhtään	paritonta	tai	parillista	lukua,	annetaan	tästä	ilmoitus.	Tee	ohjelma ensin	
yksinkertaisempana	ja	täydennä	sitä	sitten	niin	että	kaikki	pyydetyt	ominaisuudet	ovat
ohjelmassa	esimerkiksi	seuraavaa	listaa	noudatellen.
1. Lue	luku	ja	ilmoita	onko	se	parillinen	vai	pariton
2. Tee	toisto,	joka	päättyy	luvun	ollessa	LOPPU.	Mieti	millaista	toistoa	käytät	(while	vs.	
do-while)	ja	mihin kohti	laitat	toiston	alkamaan,	niin	että	silmukassa	ei	tarvitse	
käsitellä	lopetuslukua.
3. Lisää	muuttujat,	jotka	laskevat	parillisten/parittomien	lukujen	määrää	ja	muuttujat,	
joihin	summataan	kyseiseen luokkaan	kuuluvia	lukuja.
4. Tulosta	silmukan	ulkopuolella	lopulliset	lukujen	keskiarvot.

Lopullisen	ohjelman	ajoesimerkki:
 Anna lukuja, lopetus luvulla -1
 Anna luku (lopetus -1): 4
 Annoit parillisen luvun
 Anna luku (lopetus -1): 8
 Annoit parillisen luvun
 Anna luku (lopetus -1): 4
 Annoit parillisen luvun
 Anna luku (lopetus -1): -1
 Parillisia lukuja 3 kpl, joiden keskiarvo on 5.3
 Ei parittomia lukuja 
 
 */

public class Tunnista {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		final int LOPPU = -1 ;
		int evenNumberCount = 0, oddNumberCount = 0 ;
		int evenNumberSum = 0, oddNumberSum = 0 ;
		int sum = 0, count = 0;
		int input ;
		
		do {
			
			System.out.print("Anna luku (lopetus -1): ");
			input = scanner.nextInt() ;

			if (input != LOPPU) {
				if (input % 2 == 0) {
					System.out.println("Annoit parillisen luvun");
					evenNumberCount++ ;
					evenNumberSum += input ;
				} else {
					System.out.println("Annoit parittoman luvun");
					oddNumberCount++;
					oddNumberSum += input ;
				}				
				count++ ;
				sum += input ;
			}
			
		} while (input != LOPPU) ;
		
		
		System.out.println("**************");
		System.out.printf("Lukujen keskiarvo %.2f \n", (sum / (float)count) );

		// parilliset luvut
		if (evenNumberCount > 0) {
			System.out.printf("Parillisia lukuja " 
					+ evenNumberCount 
					+ " kpl, joiden keskiarvo %.2f \n", 
					(evenNumberSum / (float)evenNumberCount));	
		} else {
			System.out.println("Ei parillisia lukuja");
		}
		
		// parittomat luvut
		if (oddNumberCount > 0) {
			System.out.printf("Parittomia lukuja " 
					+ oddNumberCount 
					+ " kpl, joiden keskiarvo %.2f \n", 
					(oddNumberSum / (float)oddNumberCount));	
		} else {
			System.out.println("Ei parittomia lukuja");
		}
		
		scanner.close();
	}
	

}
