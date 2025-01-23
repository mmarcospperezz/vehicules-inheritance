package org.ies.vehicules.components;

import org.ies.vehicules.model.Camion;

import java.util.Scanner;

public class CamionReader {
    private final Scanner scanner;

    public CamionReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Camion read () {
        System.out.println("Ingrese los KM realizados con el camion:");
        int km = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la matricula del camion:");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese el numero de ejes del camion:");
        int ejes = scanner.nextInt();
        scanner.nextLine();

        return new Camion(
                km,
                matricula,
                ejes
        );
    }
}
