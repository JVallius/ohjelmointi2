package com.jarkkovallius.ohjelmointi2.harjoitus3;

import java.util.Scanner;

/*
Teht�v�	3

Tee	metodi,	joka	palauttaa	kokonaisluvun	k��nnettyn�.

Tiedostossa	on	oltava	my�s	
p��ohjelma,	jossa	k�ytt�j�lt�	kysell��n	lukuja	ja	ilmoitetaan	kunkin	luvun	kohdalla	sen	
k��nteisluku.

// palauttaa kokonaisluvun k��nnettyn� eli kaanna(456) palauttaa 654
public static int kaanna(int luku)
 */
public class Tehtava3 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int input ;
		
		do {
			System.out.println("Anna kokonaisluku");
			input = scanner.nextInt() ;
		
			System.out.println("kaanna : " + kaanna(input)) ;
			System.out.println("kaanna2: " + kaanna2(input)) ;
		} while (input != -1);
		
		scanner.close();
	}
	
	
	public static int kaanna(int luku) {
 		return Integer.valueOf(new StringBuilder(String.valueOf(luku)).reverse().toString()); 
 	}
	
	public static int kaanna2(int luku) {
		char [] arr = String.valueOf(luku).toCharArray() ;
		String reversedString = "";
		for (int i=arr.length-1; i >= 0; i--) {
			reversedString += arr[i] ;
		}
		return Integer.valueOf(reversedString) ;
	}

}
