package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 * Created by Jarkko on 19.2.2017.
 */
public class Suunnikas extends GeometrinenOlio1 {
    protected float sivu1 ;
    protected float sivu2 ;
    protected float korkeus ;

    public Suunnikas() {
    }

    public Suunnikas(String vari, boolean taytetty, float sivu1, float sivu2, float korkeus) {
        super(vari, taytetty);
        this.sivu1 = sivu1;
        this.sivu2 = sivu2;
        this.korkeus = korkeus;
    }

    public float laskePintaAla() {
        return sivu1 * korkeus;
    }

    public float laskePiiri() {
        return sivu1 * 2 + sivu2 * 2 ;
    }

    @Override
    public String toString() {
        return super.toString() + " Suunnikas{" +
                "sivu1=" + sivu1 +
                ", sivu2=" + sivu2 +
                ", korkeus=" + korkeus +
                '}';
    }
}
