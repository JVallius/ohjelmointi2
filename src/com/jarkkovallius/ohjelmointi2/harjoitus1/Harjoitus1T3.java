package com.jarkkovallius.ohjelmointi2.harjoitus1;

import java.util.Scanner;

/**
  
    Tehtävä	3
	Kirjoita	Java	ohjelma,	joka	kysyy	nimesi	ja	ikäsi	ja	tulostaa	nimesi	ja	ikäsi.
	Anna	nimesi: Maija	Meri
	Anna	ikäsi: 24
	Maija	Meri	on	24	vuotta.
	
 
 */
public class Harjoitus1T3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		String name ;
		int age ;
		
		System.out.print("Anna nimesi: ");
		name = scanner.nextLine();
		
		System.out.print("Anna ikäsi: ");
		age = scanner.nextInt();
		
		System.out.println(name + " on " + age + " vuotta." );
		
		scanner.close();
	}

}
