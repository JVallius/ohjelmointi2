package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 Tehtävä	1
 Luennoilla	oli	kaksi	esimerkkiä	BMI:n	laskemisesta.	BMI:n	laskemisen	voisi	tehdä	myös	ilman
 olioita	kirjoittamalla	luokan,	jossa	on	staattinen	metodi	BMI:n	laskemista	varten.	Kirjoita
 tällainen	luokka	ja	tee	myös	pääohjelma,	joka	käyttää	luokan	staattista	metodia.

 * Created by Jarkko on 7.2.2017.
 */
public class Tehtava1 {
    public static void main(String[] args) {

        float height = 150 ;
        float weight = 100 ;
        float bmi = Tehtava1Helper.calculateBMI(height, weight);

        System.out.println("weight = " + weight);
        System.out.println("height = " + height);
        System.out.println("bmi = " + bmi);

    }


}
