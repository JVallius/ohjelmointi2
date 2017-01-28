package com.jarkkovallius.ohjelmointi2.testi;

/*
	For-luuppi k‰y l‰pi luvut 0.01 ... 0.99, 0.01 askelein, eli  
	
	0.01
	0.02
	0.03
	...
	0.97
	0.98
	0.99
	
	jokaisella askeleella lis‰t‰‰n a-muuttujaan
	askeleen arvo, jolloin kaikkien askelten summaksi tulee 50.5, jonka ohjelma tulostaa
	
 */

public class A {
	 public static void main(String[] args) {
	 float a = 0;
	 int c = 0 ;
	 for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) 
		 {
		 	
		 	a+= i;
		 	System.out.println(i);
		 	
		 }
	 	System.out.printf("Tulos on %5.2f", a);
	 }
} 