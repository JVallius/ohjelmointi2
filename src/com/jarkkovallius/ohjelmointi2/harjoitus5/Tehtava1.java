package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 Teht�v�	1
 Luennoilla	oli	kaksi	esimerkki�	BMI:n	laskemisesta.	BMI:n	laskemisen	voisi	tehd�	my�s	ilman
 olioita	kirjoittamalla	luokan,	jossa	on	staattinen	metodi	BMI:n	laskemista	varten.	Kirjoita
 t�llainen	luokka	ja	tee	my�s	p��ohjelma,	joka	k�ytt��	luokan	staattista	metodia.

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
