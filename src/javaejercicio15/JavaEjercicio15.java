/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio15;

import java.util.Scanner;

public class JavaEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double PESOA, PESOB, PESOC, PESOD;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el peso que tiene la esfera A: ");
        PESOA = scanner.nextDouble();
        System.out.println("Ingrese el peso que tiene la esfera B: ");
        PESOB = scanner.nextDouble();
        System.out.println("Ingrese el peso que tiene la esfera C: ");
        PESOC = scanner.nextDouble();
        System.out.println("Ingrese el peso que tiene la esfera D: ");
        PESOD = scanner.nextDouble();

        // Proceso
        if ((PESOA == PESOB) && (PESOA == PESOC)) {
            // D es la diferente
            if (PESOD > PESOA) {
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } else if ((PESOA == PESOB) && (PESOA == PESOD)) {
            // C es la diferente
            System.out.println("La esfera C es la diferente");
            if (PESOC > PESOA) {
                System.out.println("y es de mayor peso.");
            } else {
                System.out.println("y es de menor peso.");
            }
        } else if ((PESOA == PESOC) && (PESOA == PESOD)) {
            // B es la diferente
            System.out.println("La esfera B es la diferente");
            if (PESOB > PESOD) {
                System.out.println("y es de mayor peso.");
            } else {
                System.out.println("y es de menor peso.");
            }
        } else {
            // A es la diferente
            System.out.println("La esfera A es la diferente");
            if (PESOA > PESOB) {
                System.out.println("y es de mayor peso.");
            } else {
                System.out.println("y es de menor peso.");
            }
        }
    }
    
}
