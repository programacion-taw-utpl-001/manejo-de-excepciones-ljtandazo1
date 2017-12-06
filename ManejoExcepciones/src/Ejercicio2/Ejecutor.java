/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author lisber
 */
public class Ejecutor {

    public static void main(String[] args) {
        boolean continuarCiclo = true;
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        Estudiante[] lista_estudiantes = new Estudiante[4];
        double[] notas_matematicas = new double[4];
        double[] notas_sociales = new double[4];
        double notasm = 0, notass = 0;

        while (i < 4) {
            try {
                System.out.println("Ingrese Nombre:");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese Apellido:");
                String apellido = entrada.nextLine();

                System.out.println("Ingrese Nota Matematicas");
                String matematicas = entrada.nextLine();

                System.out.println("Ingrese Nota Sociales");
                String sociales = entrada.nextLine();

                notasm = Double.parseDouble(matematicas);
                notass = Double.parseDouble(sociales);
                
                Estudiante es = new Estudiante(nombre, apellido);
                Asignacion as = new Asignacion(lista_estudiantes, notas_matematicas, notas_sociales);

                System.out.println(as);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }

    }
}
