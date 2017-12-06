/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author lisber
 */
public class Estudiante {

    String nombre;
    String apellido;

    public Estudiante(String n, String ap) {
        setNombre(n);
        setApellido(ap);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ap) {
        apellido = ap;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nombre, apellido);
    }

}
