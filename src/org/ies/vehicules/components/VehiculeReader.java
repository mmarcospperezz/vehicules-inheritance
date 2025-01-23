package org.ies.vehicules.components;

import org.ies.vehicules.model.Vehicule;

import java.util.Scanner;

public class VehiculeReader{
    private final Scanner scanner;
    private final CocheReader cocheReader;
    private final MotoReader motoReader;
    private final CamionReader camionReader;

    public VehiculeReader(Scanner scanner, CocheReader cocheReader, MotoReader motoReader, CamionReader camionReader) {
        this.scanner = scanner;
        this.cocheReader = cocheReader;
        this.motoReader = motoReader;
        this.camionReader = camionReader;
    }

    public Vehicule read() {
        int option = chooseOption();
        do{
            if(option == 1){
                return cocheReader.read();
            }
            if(option == 2){
                return motoReader.read();
            }
            if(option == 3){
                return camionReader.read();
            }
        }while (option != 4);

        return null;
    }

    public int chooseOption(){
        int option;

        System.out.println("Eliga una opcion del menu:");
        System.out.println("1.Informacion del coche:");
        System.out.println("2.Informacion de la moto :");
        System.out.println("3. Informacion del camion:");

        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}

