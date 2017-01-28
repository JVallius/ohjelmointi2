package com.jarkkovallius.ohjelmointi2.harjoitus1;


import java.util.Scanner; //Scanner-luokka mukaan

public class Tervehdys { // KORJAUS tämä rivi pois kommenteista
	
	public static void main (String[] arg) { 
		Scanner skanner = new Scanner(System.in);
		String etunimi, sukunimi;
		
		System.out.print("Kerro Etunimesi: "); // KORJAUS pilkku muutettu puolipisteeksi 

		/* lukee etunimen*/
		// KORJAUS muuttujan nimi väärin: etu -> etunimi
		etunimi = skanner.nextLine();   
		
		System.out.print("Kerro sukunimesi:");

		// lukee sukunimen
		// KORJAUS muttujan nimi väärin: skanneri -> scanner
		sukunimi = skanner.nextLine();  

		// tulostetaan tervehdysteksti: 
		// KORJAUS: rivi pois kommenteista JA etunimi -muuttujan eteen +
		System.out.println("Hei, " + etunimi + " " + sukunimi + "!"); 
		System.out.println("Hauska tavata!");
		skanner.close(); // KORJAUS suljetaan scanner
	}
}