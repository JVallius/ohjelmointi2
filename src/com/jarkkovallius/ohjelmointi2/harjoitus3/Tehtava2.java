package com.jarkkovallius.ohjelmointi2.harjoitus3;

import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils ;

/**
Tehtävä	2

Kirjoita	ohjelma,	joka	
lukee	opiskelijoiden	nimiä	ja	tenttipisteitä	(kokonaisluku	0-100).	

Sitten	ohjelma	arvostelee	ne	asteikolla	
0-5	(5	jos	>=	90;	
4	jos	>=	80;	
3	jos	>=70;	
2	jos	>= 60,	
1	jos	>=	50;	
muutoin	0).	

Lopuksi	ohjelma	tulostaa kaikkien	opiskelijoiden	nimet ja	
pisteet	pisteiden	mukaisessa	suuruusjärjestyksessä, kertoo 
kuka sai	suurimmat	pisteet ja	
kuka	sai	pienimmät	pisteet,	sekä	
mikä	oli	pisteiden	keskiarvo	ja	
kenen	pisteet	olivat lähinnä	sitä.	

Ohjelma	sijoittaa	käsittelemiensä	opiskelijoiden	tiedot	taulukkoon.	Voit	
käyttää	ohjelmassa	joko	useita	taulukoita	tai	yhtä	moniulotteista	taulukkoa.

 * @author Jarkko
 *
 */
public class Tehtava2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] students = new String[0] ;
		int [] examPoints = new int[0] ;
		String name ;
		int points ;
		
		
		// Luetaan nimet ja pisteet
		
		do {
			System.out.println("Anna nimi (tyhjä lopettaa)");
			name = scanner.nextLine();
			
			if (name.length() > 0) {

				// taulukon kasvatus yhdellä ja sijoitus viimeiseen alkioon
				
				String [] temp = new String[students.length];
				
				for (int i=0; i < students.length; i++) {
					temp[i] = students[i] ;
				}
				
				students = new String[students.length + 1] ;
				
				for (int i=0; i < students.length; i++) {
					if (i < temp.length) {
						students[i] = temp[i] ;	
					} else {
						students[i] = name ;
					}
				}
				
				//students = ArrayUtils.add(students, name) ;
				
				
				System.out.println("Anna tentin pisteet");
				points = Integer.parseInt(scanner.nextLine());
				examPoints = ArrayUtils.add(examPoints, points);
			} 
			
		} while(name.length() > 0) ;
		 
		
		/*
		for (int i=0; i < 5; i++) {
			name = "Opiskelija" + i ;
			students = ArrayUtils.add(students, name) ;
			points = (int)(Math.random() * 100f) ;
			examPoints = ArrayUtils.add(examPoints, points);
		}
		*/
		
		
		// lajitellaan pisteet laskevaan järjestykseen
		sortStudentExamPoints(examPoints, students, false) ;

		
		// lasketaan arvosanat
		int [] grades = getGrades(examPoints) ;
		
		
		
		// tulostus
		
		System.out.printf("%-15s", "Nimi" );
		System.out.printf("%10s", "Pisteet" );
		System.out.printf("%10s", "Arvosana" );
		System.out.println();
		System.out.println("-----------------------------------");
		
		for (int i=0; i<students.length; i++) {
			System.out.printf("%-15s", students[i] );
			System.out.printf("%10d", examPoints[i] );
			System.out.printf("%10d", grades[i] );
			System.out.printf("\n");
		}
		
		float averageExamPoints = getAverage(examPoints) ;
		
		System.out.println();
		System.out.println("Eniten pisteitä ");
		System.out.println(students[0]  + ": " + examPoints[0]  + " pistettä");
		System.out.println();
		System.out.println("Vähiten pisteitä ");
		System.out.println(students[students.length-1]  + ": " + examPoints[examPoints.length-1]  + " pistettä");
		System.out.println();
		System.out.printf("Pisteiden keskiarvo %3.2f", averageExamPoints );
		System.out.println();
		System.out.println();
		System.out.println("Lähimpänä keskiarvoa oli ");
		int closestToAverage = getNearestValueIndex(examPoints, averageExamPoints) ;
		System.out.println(students[closestToAverage]  + ": " + examPoints[closestToAverage]  + " pistettä");
		
		scanner.close();
		
	}
	
	
	/**
	 * Etsii taulukon luvuista sen, mikä on lähinnä lukua a ja palauttaa kyseisen alkion indeksin 
	 * 
	 * @param values kokonaislukutaulukko
	 * @param a luku johon verrataan
	 * @return lähinnä olevan luvun taulukon indeksi
	 */
	public static int getNearestValueIndex(int [] values, float a) {
		int smallestDiffIndex =  0;
		float smallestDiff = 0;
		for (int i=0; i<values.length; i++) {
			float diff = Math.abs(values[i] - (float)a) ;
			if (i == 0) {
				smallestDiff = diff ;
			} else {
				if (diff < smallestDiff) {
					smallestDiff = diff ;
					smallestDiffIndex = i ;
				}
			}
		}
		return smallestDiffIndex ;
	}
	

	/**
	 * Laskee taulukon lukujen keskiarvon
	 * 
	 * @param arr
	 * @return
	 */
	public static float getAverage(int [] arr) {
		int sum = 0 ;
		for (int i : arr) sum += i ;
		return sum / (float)arr.length ;
	}
	
	
	/**
		Laskee tenttipistemääristä arvosanat palautettavaan taulukkoon 
		
		0-5	(5	jos	>=	90;	
		4	jos	>=	80;	
		3	jos	>=70;	
		2	jos	>= 60,	
		1	jos	>=	50;	
		muutoin	0).	
		 
	 * 
	 * @param exams
	 * @return
	 */
	public static int [] getGrades(int [] exams) {
		int [] grades = new int[exams.length] ;
		for (int i=0; i < exams.length; i++) {
			int p = exams[i] ;
			int grade = 0 ;
			if (p >= 90) {
				grade = 5 ;
			} else if (p >= 80) {
				grade = 4 ;
			} else if (p >= 70) {
				grade = 3 ;
			} else if (p >= 60) {
				grade = 2 ;
			} else if (p >= 50) {
				grade = 1 ;
			} else {
				grade = 0 ;
			}
			grades[i] = grade ;
		}
		return grades ;
	}
	
	

	/**
	 * Lajittelee annettujen taulukkojen alkiot intArrayn mukaan laskevaan tai nousevaan järjestykseen 
	 * 
	 * 
	 * @param intArray 
	 * @param stringArray
	 * @param ascendingOrder lajittelujärjestys, true = nouseva, false = laskeva 
	 */
	public static void sortStudentExamPoints(int [] intArray, String [] stringArray, boolean ascendingOrder) {
		for (int i=1; i<intArray.length; i++) {
			int j = i-1 ;
			while (j >= 0) {
				if ((  ascendingOrder && intArray[j] > intArray[j+1] ) || 
					( !ascendingOrder && intArray[j] < intArray[j+1] )) {
					int temp = intArray[j];
					intArray[j] = intArray[j+1] ;
					intArray[j+1] = temp ;
					String nameTemp = stringArray[j] ;
					stringArray[j] = stringArray[j+1] ;
					stringArray[j+1] = nameTemp ;
				}
				j-- ;
			} 
		}
	}

}
