import org.ies.vehicules.components.CamionReader;
import org.ies.vehicules.components.CocheReader;
import org.ies.vehicules.components.MotoReader;
import org.ies.vehicules.components.VehiculeReader;
import org.ies.vehicules.model.Vehicule;

import java.util.Scanner;


public class Main2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CocheReader cocheReader = new CocheReader(scanner);
            MotoReader motoReader = new MotoReader(scanner);
            CamionReader camionReader = new CamionReader(scanner);
            VehiculeReader vehiculeReader = new VehiculeReader(scanner,cocheReader,motoReader,camionReader);

            Vehicule vehicule = vehiculeReader.read();
            vehicule.showInfo();
        }
}
