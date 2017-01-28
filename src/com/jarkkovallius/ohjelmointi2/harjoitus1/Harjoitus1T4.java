package com.jarkkovallius.ohjelmointi2.harjoitus1;

import java.util.Scanner;

/*

Teht‰v‰	4
M‰‰rittele	opintotuki	vakioksi	(nimetty	vakio),	jonka	arvo	on	298	euroa.
Tee	ohjelma,	joka kysyy	k‰ytt‰j‰lt‰	vuokran	ja	asumislis‰n.	Ohjelma	tulostaa	paljonko	k‰ytt‰j‰lle	j‰‰	
opintotuesta	ja	asumislis‰st‰	rahaa	k‰yttˆˆn	vuokran	maksun	j‰lkeen.	
Ohjelman	suoritus	voi	n‰ytt‰‰	seuraavalta	(syˆte	lihavoitu):
Paljonko	vuokrasi	on	(euroina):	200
Paljonko	asumislis‰si	on	(euroina):	160
Sinulle	j‰‰	k‰teen	258	euroa	kuussa.
 */

public class Harjoitus1T4 {

	public static void main(String[] args) {
		final int STUDY_GRANT_EUROS_PER_MONTH = 298 ; // opintotuki
		float rentEurosPerMonth ;
		float housingSupplementEurosPerMonth ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Anna vuokrasi (euroina): ");
		rentEurosPerMonth = scanner.nextFloat();
		
		System.out.print("Anna asumislis‰si (euroina): ");
		housingSupplementEurosPerMonth = scanner.nextFloat();
		
		float totalEuros = STUDY_GRANT_EUROS_PER_MONTH + housingSupplementEurosPerMonth - rentEurosPerMonth ; 
		
		System.out.println("Sinulle j‰‰ k‰teen " + totalEuros + " e/kk");
		
		scanner.close();
		
	}

}
