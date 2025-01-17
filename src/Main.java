import org.ies.vehicules.Camion;
import org.ies.vehicules.Coche;
import org.ies.vehicules.Moto;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("ABC123", 4);
        Coche coche = new Coche("DEF456", 4, 120);
        Moto moto = new Moto("GHI789", 250);

        camion.move(100);
        coche.move(50);
        moto.move(30);

        System.out.println("\nInformación de los vehículos:");
        camion.showInfo();
        System.out.println();
        coche.showInfo();
        System.out.println();
        moto.showInfo();
    }
}