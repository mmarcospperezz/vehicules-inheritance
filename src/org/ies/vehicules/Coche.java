package org.ies.vehicules;

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
}
