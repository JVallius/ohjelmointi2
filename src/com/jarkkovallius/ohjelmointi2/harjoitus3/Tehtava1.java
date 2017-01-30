package com.jarkkovallius.ohjelmointi2.harjoitus3;

import java.util.Scanner;

/**
Tehtävä 1

Kirjoita	metodi	joka	laskee	n:n	kokonaisluvun	summan	luvuista
1,...,n.	Eli	kun	n=1,	niin summa=1;	kun	n=2,	
niin	summa=1+2=3;	kun	n=3,	niin	summa	=	1+2+3=6,	jne.	
Kirjoita	siis metodi	kokonaisSumma ja	sille	testiohjelma,	
jolla	voit	tarkistaa	metodin	toiminnan.
	
Metodin	otsikko	on: public static int kokonaisSumma(int n)
 */
public class Tehtava1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input ;
		
		do {
			System.out.println("Anna kokonaisluku (-1 lopettaa)");
			input = scanner.nextInt() ;
			
			if (input != -1) {
				int sum = kokonaisSumma(input) ;
				System.out.println("Luvun " + input + " lukujen summa on " + sum);
			} else {
				System.out.println("Bye");
			}
			
		} while (input != -1) ;
		
		scanner.close();

	}
	
	/**
	 * Metodi laskee summan annetun luvun n luvuista 1,...n
	 * 
	 * @param n kokonaisluku
	 * @return lukujen summa
	 */
	public static int kokonaisSumma(int n)  {
		int summa = 0 ;
		for (int i=0; i <= n ; i++) {
			summa += i ;
			System.out.println("i=" + i + " summa="+summa);
		}
		return summa ;
	}
	

}
