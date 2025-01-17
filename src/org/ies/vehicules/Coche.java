package org.ies.vehicules;

import java.util.Objects;

public class Coche extends Vehicule {
    private int numPuertas;
    private int caballos;

    public Coche(String matricula, int numPuertas, int caballos) {
        super(matricula);
        this.numPuertas = numPuertas;
        this.caballos = caballos;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Caballos: " + caballos);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return numPuertas == coche.numPuertas && caballos == coche.caballos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPuertas, caballos);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numPuertas=" + numPuertas +
                ", caballos=" + caballos +
                '}';
    }
}
