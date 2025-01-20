package org.ies.vehicules;

import java.util.Objects;

public class Moto extends Vehicule {
    private int cilindrada;

    public Moto(int kmRealizados, String matricula, int cilindrada) {
        super(kmRealizados, matricula);
        this.cilindrada = cilindrada;
    }

    @Override
    public void showEspecificInfo() {
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }

     public int getCilindrada() {
         return cilindrada;
     }

     public void setCilindrada(int cilindrada) {
         this.cilindrada = cilindrada;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return cilindrada == moto.cilindrada;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cilindrada);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
