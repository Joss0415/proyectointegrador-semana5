package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int anosExperiencia; // Usamos 'anos' para evitar caracteres especiales en el código

    // Constructor que invoca a la superclase
    public Docente(String nombre, String dui, String especialidad, int anosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    // Método propio del docente
    public void impartirClase(String materia) {
        System.out.println(nombre + " imparte: " + materia);
    }

    // Reutilización de presentarse() en toString()
    @Override
    public String toString() {
        return presentarse() + " | " + especialidad + " (" + anosExperiencia + " años)";
    }
}