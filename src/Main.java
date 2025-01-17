import org.ies.vehicules.Camion;
import org.ies.vehicules.Coche;
import org.ies.vehicules.Moto;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion(300000,"ABC123", 4);
        Coche coche = new Coche(100000,"DEF456", 4, 120);
        Moto moto = new Moto(12000,"GHI789", 250);

        camion.move(10000);
        coche.move(50000);
        moto.move(30000);

        System.out.println("Información de los vehículos:");
        camion.showInfo();
        System.out.println();
        coche.showInfo();
        System.out.println();
        moto.showInfo();
    }
}