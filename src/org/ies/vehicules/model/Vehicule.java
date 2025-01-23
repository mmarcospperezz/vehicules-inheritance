package org.ies.vehicules.model;

import java.util.Objects;

public  abstract class Vehicule {
    protected int kmRealizados;
    protected String matricula;

    public Vehicule(int kmRealizados, String matricula) {
        this.kmRealizados = kmRealizados;
        this.matricula = matricula;
    }

    public void move(int distancia) {
        if (distancia > 0) {
            kmRealizados += distancia;
            System.out.println("Recorridos " + distancia + " kilometros más.");
        } else {
            System.out.println("La distancia debe ser positiva.");
        }
    }

    public void showInfo() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Kilómetros realizados: " + kmRealizados);
        showEspecificInfo();

    }

    public abstract void showEspecificInfo();

    public int getKmRealizados() {
        return kmRealizados;
    }

    public void setKmRealizados(int kmRealizados) {
        this.kmRealizados = kmRealizados;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return kmRealizados == vehicule.kmRealizados && Objects.equals(matricula, vehicule.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmRealizados, matricula);
    }
}

