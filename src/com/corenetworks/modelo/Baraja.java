package com.corenetworks.modelo;

import java.util.Arrays;

public class Baraja {
    private Carta[] barajas;

    @Override
    public String toString() {
        return "Baraja{" +
                "barajas=" + Arrays.toString(barajas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baraja baraja = (Baraja) o;
        return Arrays.equals(barajas, baraja.barajas);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(barajas);
    }

    public Baraja(){
        barajas = new Carta[52];
        int indice = 0;
        for (Palo elemento:
             Palo.values()) {
            for (Numeros elemento2:
                 Numeros.values()) {
                 barajas[indice] = new Carta(elemento,elemento2);
                 indice++;

            }
        }
    }


    public Carta[] getBarajas() {
        return barajas;
    }

    public void setBarajas(Carta[] barajas) {
        this.barajas = barajas;
    }
}
