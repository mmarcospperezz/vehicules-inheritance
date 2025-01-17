package org.ies.vehicules;

public  abstract class Vehicule {
    private int kmRealizados;
    private String matricula;

    public Vehicule(String matricula) {
        this.kmRealizados = 0;
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
    }
}

