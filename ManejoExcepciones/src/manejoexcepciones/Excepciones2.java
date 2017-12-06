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
public class Excepciones2 {

    public static void main(String[] args) {

        //int valor = 10 / 0;//No se puede Dividir para 0 Excepcion
        Scanner entrada = new Scanner(System.in);
        int numerador, denominador, division;
        boolean continuacion = true;
        do {
            try {
                System.out.println("Ingrese Numerador ");
                numerador = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese Denominador ");
                denominador = entrada.nextInt();
                entrada.nextLine();

                division = numerador / denominador;

                System.out.printf("Division: %d"
                        + "/%d\n"
                        + "Resultado: %d", numerador, denominador, division);
                continuacion = false;

            } catch (ArithmeticException e) {
                System.err.println(e);
            }

        } while (continuacion);

    }

}
