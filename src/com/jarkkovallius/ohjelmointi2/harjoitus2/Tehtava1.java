package com.jarkkovallius.ohjelmointi2.harjoitus2;


import java.util.Scanner;
import com.jarkkovallius.ohjelmointi2.harjoitus2.MobilePhoneSubscription.PhoneCallPackage;
import com.jarkkovallius.ohjelmointi2.harjoitus2.MobilePhoneSubscription.TextMessagePackage;; 

/*
Tehtävä	1
Kirjoita	Java-ohjelma,	jolla	kännykkäliittymän	myyjä	tallentaa	liittymän	tiedot	yksinkertaisiin	
muuttujiin	ja	tulostaa	ne	lopuksi	näkyville.	Ohjelma	kysyy	seuraavat	asiat:

a)	puheluiden	laskutus	minuuttien	määrän	mukaan	(5	snt/min)	vai	puhepakettina?
b)	jos	puhepaketti,	niin	onko	koko	100	(5	€),	200	(10 €)	vai	500	(15 €)	minuuttia?

c)	onko	tekstaripaketti	vai	laskutetaanko	tekstarit	erikseen	(10	snt/kpl)?
d)	jos	on	tekstaripaketti,	niin	onko	50	(1 €),	100	(2 €)	vai	200	(3 €)	tekstaria?

e)	kuuluuko	nettiliittymä	(kyllä	tai	ei)
f)	jos	kuuluu	nettiliittymä,	niin	onko	laskutus	tiedon	määrän	mukaan	(2€ /	Mt)	vai
kuukausimaksu	(10 €)?

Lopuksi	ohjelma	tulostaa	liittymän	tiedot	ja	kuukausimaksut	näkyville.

Ohjelma	toimii	merkkipohjaisesti,	eikä	siinä	tarvitse	olla	graafista	käyttöliittymää,	halutessasi	
voit	toki	sellaisen	tehdä.	

Tiedot	tallennetaan	muuttujiin	ja	niitä	ei	tallenneta	tiedostoon	
myöhempää	käyttöä	varten. Mieti	miten	ohjelmassa	voisi	käyttää	totuusarvomuuttujia?
*/

public class Tehtava1 {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input ;
		boolean inputError ;
		
		MobilePhoneSubscription subscription = new MobilePhoneSubscription();

		// puhelun minuuttihinta
		subscription.phoneCallPricePerMinute = 0.05f ; 
		
		// puhepaketit
		subscription.availablePhoneCallPackages = new PhoneCallPackage[] 
				{ 
					subscription.new PhoneCallPackage(100, 5),
					subscription.new PhoneCallPackage(200, 10),
					subscription.new PhoneCallPackage(500, 15)
				} ;

		// tekstarin hinta
		subscription.textMessagePrice = 0.10f ; 
		
		// tekstaripaketit
		subscription.availableTextMessagePackages = new TextMessagePackage[] 
				{ 
					subscription.new TextMessagePackage(50, 1),
					subscription.new TextMessagePackage(100, 2),
					subscription.new TextMessagePackage(200, 3)
				} ; 

		// datan kk-hinta
		subscription.mobileDataPriceMonthly = 10f ;
		
		// data / megatavu
		subscription.mobileDataPricePerMegabyte = 2f ; 
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * Puhelun laskutuksen valinta
		 */
		
		System.out.println("Puheluiden laskutus");
		System.out.println("1 = minuuttiveloitus");
		System.out.println("2 = puhepaketti");
		
		do {
			inputError = false ;
			input = scanner.nextInt() ;
			
			switch (input) {
				case 1:
					subscription.selectedPhoneCallBillingType = MobilePhoneSubscription.PHONE_CALL_BILLING_TYPE_PER_MINUTE ;
					break ;
				case 2:
					subscription.selectedPhoneCallBillingType = MobilePhoneSubscription.PHONE_CALL_BILLING_TYPE_PACKAGE ;
					break;
				default:
					inputError = true ;
					System.out.println("Virheellinen syöte");	
			}
			
		} while (inputError) ;
		
		
		
		/*
		 * Puhepaketin valinta
		 */
		
		if (subscription.selectedPhoneCallBillingType == MobilePhoneSubscription.PHONE_CALL_BILLING_TYPE_PACKAGE) {
			
			System.out.println("Puhepaketin koko");
			System.out.println("1 = " + subscription.availablePhoneCallPackages[0].minutes + " minuuttia");
			System.out.println("2 = " + subscription.availablePhoneCallPackages[1].minutes + " minuuttia");
			System.out.println("3 = " + subscription.availablePhoneCallPackages[2].minutes + " minuuttia");
			
			do {
				inputError = false ;
				input = scanner.nextInt() ;
				
				switch (input) {
					case 1:
					case 2:
					case 3:
						subscription.selectedPhoneCallPackage = subscription.availablePhoneCallPackages[input-1] ;
						break;
					default:
						inputError = true ;
						System.out.println("Virheellinen syöte");	
				}
				
			} while (inputError) ;
			
		}
		
		
		
		/*
		 * Tekstarin laskutuksen valinta
		 */
		
		System.out.println("Tekstiviestien laskutus");
		System.out.println("1 = kappaleveloitus");
		System.out.println("2 = tekstiviestipaketti");
		
		do {
			inputError = false ;
			input = scanner.nextInt() ;
			
			switch (input) {
				case 1:
					subscription.selectedTextMessageBillingType = MobilePhoneSubscription.TEXT_MESSAGE_BILLING_TYPE_PER_MESSAGE ;
					break ;
				case 2:
					subscription.selectedTextMessageBillingType = MobilePhoneSubscription.TEXT_MESSAGE_BILLING_TYPE_PACKAGE ;
					break;
				default:
					inputError = true ;
					System.out.println("Virheellinen syöte");	
			}
			
		} while (inputError) ;
		
		
		
		/*
		 * Tekstaripaketin valinta
		 */
		
		if (subscription.selectedTextMessageBillingType == MobilePhoneSubscription.TEXT_MESSAGE_BILLING_TYPE_PACKAGE) {
			
			System.out.println("Tekstiviestipaketin koko");
			System.out.println("1 = " + subscription.availableTextMessagePackages[0].messages + " kappaletta");
			System.out.println("2 = " + subscription.availableTextMessagePackages[1].messages + " kappaletta");
			System.out.println("3 = " + subscription.availableTextMessagePackages[2].messages + " kappaletta");
			
			do {
				inputError = false ;
				input = scanner.nextInt() ;
				
				switch (input) {
					case 1:
					case 2:
					case 3:
						subscription.selectedTextMessagePackage = subscription.availableTextMessagePackages[input-1] ;
						break;
					default:
						inputError = true ;
						System.out.println("Virheellinen syöte");	
				}
				
			} while (inputError) ;
			
		}
		
		
	
		
		/*
		 * Datapaketin valinta
		 */
		
		System.out.println("Mobiilidatapaketti");
		System.out.println("1 = kyllä");
		System.out.println("2 = ei");
		
		do {
			inputError = false ;
			input = scanner.nextInt() ;
			
			switch (input) {
				case 1:
					subscription.mobileDataEnabled = true ;
					break ;
				case 2:
					subscription.mobileDataEnabled = false ;
					break;
				default:
					inputError = true ;
					System.out.println("Virheellinen syöte");	
			}
			
		} while (inputError) ;
		
		
		
		/*
		 * Datapaketin tyypin valinta
		 */
		
		if (subscription.mobileDataEnabled) {
			
			System.out.println("Mobiilidatapaketin tyyppi");
			System.out.println("1 = laskutus käytön mukaan (" + subscription.mobileDataPricePerMegabyte + " euroa/Mt)");
			System.out.println("2 = kk-maksu (" + subscription.mobileDataPriceMonthly +" euroa/kk)");
			
			do {
				inputError = false ;
				input = scanner.nextInt() ;
				
				switch (input) {
					case 1:
						subscription.selectedMobileDataBillingType = MobilePhoneSubscription.MOBILE_DATA_BILLING_TYPE_PER_MEGABYTE ;
						break;
					case 2:
						subscription.selectedMobileDataBillingType = MobilePhoneSubscription.MOBILE_DATA_BILLING_TYPE_MONTHLY ;
						break;
					default:
						inputError = true ;
						System.out.println("Virheellinen syöte");	
				}
				
			} while (inputError) ;
			
		}
				
		
		
		
		

		
		
		
		System.out.println("Liitymän tiedot");
		System.out.println("---------------");
		
		System.out.println("Puhelut");
		if (subscription.selectedPhoneCallBillingType == MobilePhoneSubscription.PHONE_CALL_BILLING_TYPE_PER_MINUTE) {
			System.out.println("- minuuttiveloitus: " + subscription.phoneCallPricePerMinute + " euroa/minuutti");
		} else {
			System.out.println("- puhepaketti: " 
					+ subscription.selectedPhoneCallPackage.minutes + " minuuttia (" 
					+ subscription.selectedPhoneCallPackage.price + "e)");
		}
		
		System.out.println("Tekstiviestit");
		if (subscription.selectedTextMessageBillingType == MobilePhoneSubscription.TEXT_MESSAGE_BILLING_TYPE_PER_MESSAGE) {
			System.out.println("- viestit " + subscription.textMessagePrice + " euroa/kappale");
		} else {
			System.out.println("- viestipaketti: " 
					+ subscription.selectedTextMessagePackage.messages + " viestiä (" 
					+ subscription.selectedTextMessagePackage.price + "e)");
			
		}
		
		if (subscription.mobileDataEnabled) {
			System.out.println("Mobiilidata");
			if (subscription.selectedMobileDataBillingType == MobilePhoneSubscription.MOBILE_DATA_BILLING_TYPE_PER_MEGABYTE) {
				System.out.println("- data " + subscription.mobileDataPricePerMegabyte + " euroa/Mt");
			} else {
				System.out.println("- data " + subscription.mobileDataPriceMonthly + " euroa/kk"); 
			}
		}

		
		scanner.close();
	}
}


