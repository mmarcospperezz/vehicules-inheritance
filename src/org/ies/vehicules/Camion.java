package org.ies.vehicules;

 public class Camion extends Vehicule{
    private int numEjes;

    public Camion(String matricula, int numEjes) {
        super(matricula);
        this.numEjes = numEjes;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Número de ejes: " + numEjes);
    }
}