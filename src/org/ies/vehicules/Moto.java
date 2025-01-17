package org.ies.vehicules;

 public class Moto extends Vehicule {
    private int cilindrada;

    public Moto(String matricula, int cilindrada) {
        super(matricula);
        this.cilindrada = cilindrada;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
