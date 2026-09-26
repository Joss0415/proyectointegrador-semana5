package com.uped.proyecto.modelo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;

    public Estudiante(String nombre, String dui, String carnet, String carrera) {
        super(nombre, dui);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public void matricular(String materia) {
        System.out.println(carnet + " matriculo: " + materia);
    }

    @Override
    public String toString() {
        // Observa cómo se reutiliza presentarse() en lugar de reescribir la lógica
        return presentarse() + " | " + carrera + " (" + carnet + ")";
    }
}