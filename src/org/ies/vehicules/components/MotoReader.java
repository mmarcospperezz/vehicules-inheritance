package org.ies.vehicules.components;

import org.ies.vehicules.model.Moto;

import java.util.Scanner;

public class MotoReader {
    private final Scanner scanner;

    public MotoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Moto read () {
        System.out.println("Ingrese los KM realizados con la moto:");
        int km = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la matricula de la moto:");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese los centimetros cubicos de la moto:");
        int cc = scanner.nextInt();
        scanner.nextLine();

        return new Moto(
                km,
                matricula,
                cc
        );
    }
}
