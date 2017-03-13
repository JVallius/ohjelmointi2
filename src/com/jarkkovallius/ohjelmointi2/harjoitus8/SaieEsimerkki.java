package com.jarkkovallius.ohjelmointi2.harjoitus8;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.jarkkovallius.ohjelmointi2.harjoitus8.SaieEsimerkki.lock;

/**
 * Teht‰v‰	1
 Luennoilla	oli	esill‰ ohjelma	joka	tulosti	kolmella	eri	s‰ikeell‰	kirjaimia	tai	lukuja.	Lis‰‰
 ohjelmaa	viel‰	yksi	s‰ie	joka	tarkkailee	edellisten s‰ikeiden	toimintaa	ja	tulostaa	"Kaikki
 valmista" kun	muut	s‰ikeet ovat	valmiit.	Vihje:	Thread.join().		Esimerkkiohjelma	on
 Moodlessa	nimell‰	SaieEsimerkki.java.	T‰m‰n	toteuttaminen	ei	v‰ltt‰m‰tt‰ tarvitsisi
 uutta	s‰iett‰,	mutta	nyt	halutaan	harjoitella	s‰ikeen	perustamista
 *
 *
 * @author
 * @version 1.00 2011/4/26
 */
public class SaieEsimerkki {

    public static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        /**
         * Teht‰v‰	2
         Jatketaan	edelleen	samaa	kolmea	tulostamiss‰iett‰.	Samanaikaisuus aiheutti	tulostusten
         tulemisen	kesken‰‰n	sekaisin.	Lis‰‰	ohjelmaan s‰ikeiden	v‰linen	lukitus	siten,	ett‰
         kukin	s‰ie	tulostaa	kerralla kymmenen	kirjainta/lukua	ilman,	ett‰	muut	s‰ikeet
         p‰‰sev‰t	v‰lill‰ tulostamaan	sekaan.	Numerot/kirjaimet	on	edelleen tulostettava	yksi
         kerrallaan,	eli	pidemm‰n	merkkijonon	rakentaminen	ja	sen	tulostaminen kerralla	ei
         kelpaa	ratkaisuksi.
         */





        // TEHTAVA 1



        Runnable tulostaA = new TulostaMerkki('a', 100);
        Runnable tulostaB = new TulostaMerkki('b', 100);
        Runnable tulosta100 = new TulostaNumero(100);

        Thread saie1 = new Thread(tulostaA);
        Thread saie2 = new Thread(tulostaB);
        Thread saie3 = new Thread(tulosta100);

        Runnable nuuskija = new Nuuskija(new Thread[]{saie1, saie2, saie3});
        Thread saie4 = new Thread(nuuskija);
        saie4.start();
        saie3.start();
        saie1.start();
        saie2.start();



    }
}

class Nuuskija implements Runnable {
    Thread [] threads;
    public Nuuskija(Thread [] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nall done");
    }
}

// Teht‰v‰ joka tulostaa tietyn kirjaimen annetun m‰‰r‰n kertoja
class TulostaMerkki implements Runnable {
    private char tulostettavaMerkki;
    private int kertaa;


    /** Luodaan teht‰v‰ tietyll‰ merkill‰ ja kerroilla */
    public TulostaMerkki(char m, int k) {
        tulostettavaMerkki = m;
        kertaa = k;

    }

    /** Syrj‰ytet‰‰n run() metodi ja kerrotaan mit‰ pit‰‰ tehd‰ */
    public void run() {
        int count = 0 ;
        for (int i = 0; i < kertaa; i++) {

            if (count == 0) {
                do {
                    try {
                        if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
                            //System.out.println("locked!");

                        } else {
                            //System.out.println("locked up!");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (!lock.isHeldByCurrentThread());
            }


            count++ ;
            System.out.print(tulostettavaMerkki);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (count > 9) {
                count = 0 ;
                lock.unlock();

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

// Teht‰v‰ joka tulostaa numerot 1 annettuun n:‰‰n saakka
class TulostaNumero implements Runnable {
    private int viimeinen;

    /** Luodaan teht‰v‰ numeroiden tulostukseen */
    public TulostaNumero(int n) {
        viimeinen = n;
    }

    /** Kerrotaan kuinta s‰ie suoritetaan */
    public void run() {
        int count = 0 ;

        for (int i = 1; i <= viimeinen; i++) {

            if (count == 0) {
                do {

                    try {
                        if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
                            //System.out.println("locked!");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (!lock.isHeldByCurrentThread());
            }


            count++ ;
            System.out.print(" " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (count > 9) {
                count = 0 ;
                lock.unlock();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }




        }
    }
    /** Kerrotaan kuinka s‰ie suoritetaan + yield */
	/*public void run() {
		for (int i = 1; i <= viimeinen; i++) {
			System.out.print(" " + i);
			Thread.yield();
		}
	} */
    /** Kerrotaan kuinta s‰ie suoritetaan + sleep */
	/*public void run() {
		try {
			for (int i = 1; i <= viimeinen; i++) {
				System.out.print(" " + i);
				// if (i >= 50)
					Thread.sleep(10);
			}
		}
		catch (InterruptedException ex) {}
	} */

    //	 Kerrotaan kuinta s‰ie suoritetaan + join
	/*public void run() {
		Thread saie4 = new Thread(
			new TulostaMerkki('c', 40));
		saie4.start();
		try {
			for (int i = 1; i <= viimeinen; i++) {
				System.out.print(" " + i);
				if (i >= 50) saie4.join();
				// saie4.join();
			}
		}
			catch (InterruptedException ex) {}
	} */

}
