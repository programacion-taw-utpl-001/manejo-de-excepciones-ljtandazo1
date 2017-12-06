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
public class Asignacion {

    Estudiante[] lista_estudiantes;
    double[] notas_matematicas;
    double[] notas_sociales;

    public Asignacion(Estudiante[] lista_e, double[] notas_m, double[] notas_s) {
        setLista_estudiantes(lista_e);
        setNotas_matematicas(notas_m);
        setNotas_sociales(notas_s);

    }

    public Estudiante[] getLista_estudiantes() {
        return lista_estudiantes;
    }

    public void setLista_estudiantes(Estudiante[] lista_e) {
        lista_estudiantes = lista_e;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] notas_m) {
        notas_matematicas = notas_m;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] notas_s) {
        notas_sociales = notas_s;
    }

    public String lista_estudiantes() {
        String estudiantes = "";
        Estudiante[] lista = getLista_estudiantes();
        for (int i = 0; i < lista.length; i++) {
            estudiantes += lista[i].toString();
        }
        return estudiantes;
    }

    public double promedio_estudiante() {
        double promedio, suma = 0;
        double notasm, notass;
        for (int i = 0; i < 4; i++) {
            notasm = notas_matematicas[i];
            notass = notas_sociales[i];
            suma = notasm + notass;
        }
        promedio = suma / 2;
        return promedio;
    }

    public String promedio_general() {
        double Matematicas = 0, promedioMatematicas = 0, promedioSociales = 0, Sociales = 0;
        for (int i = 0; i < notas_matematicas.length; i++) {
            Matematicas = Matematicas + notas_matematicas[i];
        }
        promedioMatematicas = Matematicas / 4;
        for (int i = 0; i < notas_sociales.length; i++) {
            Sociales = Sociales + notas_sociales[i];
        }
        promedioSociales = Sociales / 4;

        return String.format("Promedio Matematicas: %.2f\n"
                + "Promedio Sociales: %.2f", promedioMatematicas, promedioSociales);
    }

    @Override
    public String toString() {
        return String.format(
                "Lista de Estudiantes%s\n"
                + "Màtematicas %.2f\n"
                + "Sociales %.2f\n"
                + "Promedio %.2f\n"
                + "Promedio General %s\n", lista_estudiantes(), getNotas_matematicas(), getNotas_sociales(), promedio_estudiante(), promedio_general());
    }

}
