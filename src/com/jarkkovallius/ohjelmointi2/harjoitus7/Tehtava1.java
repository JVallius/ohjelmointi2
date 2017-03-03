package com.jarkkovallius.ohjelmointi2.harjoitus7;

import com.jarkkovallius.ohjelmointi2.harjoitus6.GeometrinenOlio;
import com.jarkkovallius.ohjelmointi2.harjoitus6.Suorakulmio;
import com.jarkkovallius.ohjelmointi2.harjoitus6.Suunnikas;
import com.jarkkovallius.ohjelmointi2.harjoitus6.Ympyra;

/**
 * Teht�v�	1
 Kirjoita	ohjelma,	joka	k�sittelee	geometristen	olioiden	taulukkoa.	Ohjelmassa	on	staattinen
 metodi	alaSumma,	joka	laskee	parametrina	saamansa	taulukon	olioiden	alojen	summan:
 public	static	double	alaSumma(GeometrinenOlio	[	]	a)
 Kirjoita	my�s	p��ohjelma,	joka	luo	taulukon	ja	siihen	nelj�	geometrista	oliota	(kaksi	ympyr��
 ja	kaksi	suorakulmiota)	sek�	laskee	niiden	alojen	summan	alaSumma	metodilla.	K�yt�
 luokkina	luennoilla	tai	harjoituksissa	k�ytettyj�	luokkia
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
