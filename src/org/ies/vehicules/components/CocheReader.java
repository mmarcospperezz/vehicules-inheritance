package org.ies.vehicules.components;

import org.ies.vehicules.model.Coche;

import java.util.Scanner;

public class CocheReader {
    private final Scanner scanner;

    public CocheReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Coche read () {
        System.out.println("Ingrese los KM realizados con el coche:");
        int km = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la matricula del coche:");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese el numero de puertas del coche:");
        int puertas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese los caballos del coche");
        int cv = scanner.nextInt();
        scanner.nextLine();

        return new Coche(
                km,
                matricula,
                puertas,
                cv
        );
    }
}
