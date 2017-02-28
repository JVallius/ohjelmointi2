package com.jarkkovallius.ohjelmointi2.harjoitus6;



/**
 * Kirjoita/muokkaa	seuraavat	ohjelmat.
 a)	Muokkaa	tehta? va?n	3 luokkaa	Suunnikas	siten,	etta?	kirjoitat	luokalle	equals-metodin,
 joka	syrja? ytta?a?(overwrite) luokan	Object	equals-metodin.
 b)	Kirjoita	pa?a? ohjelma,	joka	luo	seuraavat	oliot	seuraavista	luokista:	GeometrinenOlio,
 Ympyra,	Suorakulmio	ja	Suunnikas.
 Luo	oliot	Object[]	taulukkoon.	Sitten	ohjelma	tulostaa	olioiden	tietoja	seuraavasti
 tutkittuaan	ensin	minka?	luokan	oliosta	on	kyse:
 i.	jos	olio	on	GeometrinenOlio	tai	sen	aliluokan	olio,	niin	sen	va? ri	tulostetaan
 ii.	jos	olio	on	GeometrinenOlio	aliluokan	olio,	niin	sen	pinta-ala	tulostetaan
 *
 * Created by Jarkko on 23.2.2017.
 */
public class Tehtava4 {
    public static void main(String[] args) {
        final int OBJECT_COUNT = 4 ;
        Object [] objects = new Object[OBJECT_COUNT];

        objects[0] = new GeometrinenOlio("musta", false);
        objects[1] = new Ympyra(40f, "keltainen", true);
        objects[2] = new Suorakulmio(13f,62f,"sininen",false);
        objects[3] = new Suunnikas("harmaa", true, 5.2f, 2.7f, 8.2f);

        for (Object o : objects) {
            if (o instanceof GeometrinenOlio) {
                System.out.println("GeometrinenOlio: väri: " + ((GeometrinenOlio) o).getVari());
            }

            if (o instanceof GeometrinenOlio && o.getClass() != GeometrinenOlio.class) {
                if (o.getClass() == Ympyra.class) {
                    System.out.println("Ympyrän pinta-ala=" + ((Ympyra)o).getAla());
                } else if (o.getClass() == Suorakulmio.class) {
                    System.out.println("Suorakulmion pinta-ala=" + ((Suorakulmio)o).getAla());
                } else if (o.getClass() == Suunnikas.class) {
                    System.out.println("Suunnikkaan pinta-ala=" + ((Suunnikas)o).laskePintaAla());
                }
            }
        }
    }
}
