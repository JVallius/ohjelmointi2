package com.jarkkovallius.ohjelmointi2.harjoitus7;

import com.jarkkovallius.ohjelmointi2.harjoitus6.GeometrinenOlio;
import com.jarkkovallius.ohjelmointi2.harjoitus6.Suorakulmio;
import com.jarkkovallius.ohjelmointi2.harjoitus6.Suunnikas;
import com.jarkkovallius.ohjelmointi2.harjoitus6.Ympyra;

/**
 * Tehtävä	1
 Kirjoita	ohjelma,	joka	käsittelee	geometristen	olioiden	taulukkoa.	Ohjelmassa	on	staattinen
 metodi	alaSumma,	joka	laskee	parametrina	saamansa	taulukon	olioiden	alojen	summan:
 public	static	double	alaSumma(GeometrinenOlio	[	]	a)
 Kirjoita	myös	pääohjelma,	joka	luo	taulukon	ja	siihen	neljä	geometrista	oliota	(kaksi	ympyrää
 ja	kaksi	suorakulmiota)	sekä	laskee	niiden	alojen	summan	alaSumma	metodilla.	Käytä
 luokkina	luennoilla	tai	harjoituksissa	käytettyjä	luokkia
 *
 * Created by Jarkko on 3.3.2017.
 */
public class Tehtava1 {

    public static void main(String[] args) {
        GeometrinenOlio[] oliot = new GeometrinenOlio[4];
        oliot[0] = new Ympyra(100);
        oliot[1] = new Ympyra(200);
        oliot[2] = new Suorakulmio(99, 88);
        oliot[3] = new Suorakulmio(77, 66);

        System.out.println("alojen summa="+ alaSumma(oliot));


    }

    public static double alaSumma(GeometrinenOlio[] a) {
        double summa = 0 ;
        for (GeometrinenOlio o : a) {
            if (o.getClass() == Ympyra.class) {
                summa += ((Ympyra) o).getAla();
            } else if (o.getClass() == Suorakulmio.class) {
                summa += ((Suorakulmio)o).getAla();
            }
        }

        return summa;
    }


}
