package org.ies.vehicules;

import java.util.Objects;

public class Camion extends Vehicule{
    private int numEjes;

    public Camion(int kmRealizados, String matricula, int numEjes) {
        super(kmRealizados, matricula);
        this.numEjes = numEjes;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Número de ejes: " + numEjes);
    }

     public int getNumEjes() {
         return numEjes;
     }

     public void setNumEjes(int numEjes) {
         this.numEjes = numEjes;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return numEjes == camion.numEjes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEjes);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "numEjes=" + numEjes +
                '}';
    }
}