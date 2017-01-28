package com.jarkkovallius.ohjelmointi2.harjoitus2;

import java.util.Scanner;

/*
Teht�v�	4

Tee	Java-ohjelma	Tunnista,	joka	kysyy	k�ytt�j�lt�	kokonaislukuja	ja	lopettaa	saatuaan	
sovitun	lopetusluvun	(nimetty	vakio	LOPPU,	esimerkkitulostuksessa -1).	Kustakin	luvusta	
k�ytt�j�lle	ilmoitetaan	onko	luku	parillinen	vai	pariton.	Lopuksi	annetaan	kaikkien	
k�siteltyjen	sek�	parillisten	ja parittomien	lukujen	keskiarvo.	Jos	sy�tetyiss�	luvuissa	ei	ole	
yht��n	paritonta	tai	parillista	lukua,	annetaan	t�st�	ilmoitus.	Tee	ohjelma ensin	
yksinkertaisempana	ja	t�ydenn�	sit�	sitten	niin	ett�	kaikki	pyydetyt	ominaisuudet	ovat
ohjelmassa	esimerkiksi	seuraavaa	listaa	noudatellen.
1. Lue	luku	ja	ilmoita	onko	se	parillinen	vai	pariton
2. Tee	toisto,	joka	p��ttyy	luvun	ollessa	LOPPU.	Mieti	millaista	toistoa	k�yt�t	(while	vs.	
do-while)	ja	mihin kohti	laitat	toiston	alkamaan,	niin	ett�	silmukassa	ei	tarvitse	
k�sitell�	lopetuslukua.
3. Lis��	muuttujat,	jotka	laskevat	parillisten/parittomien	lukujen	m��r��	ja	muuttujat,	
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
