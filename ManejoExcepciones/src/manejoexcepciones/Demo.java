/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

import java.util.Scanner;

/**
 *
 * @author lisber
 */
public class Demo {

    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad ");
        edad = entrada.nextInt();
        System.out.print("Ingrese un nombre ");
        nombre = entrada.nextLine();

        System.out.printf("Su nombre es %s\n", nombre);
        System.out.printf("Su edad es %d\n", edad);
    }

}
