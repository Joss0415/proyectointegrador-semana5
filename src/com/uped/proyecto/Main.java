package com.uped.proyecto;

import com.uped.proyecto.modelo.*;


public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ana López", "04512378-9", "7777-1234");
        System.out.println(cliente.presentarse());

        Visitante v = new Visitante("Kevin");
        System.out.println(v);

        Empleado empleado = new Empleado("Luis Pérez", "06223456-1", 850.0);
        System.out.println(empleado.presentarse());
        empleado.actualizarNombre("Luis Pérez Martínez");
        System.out.println(empleado.presentarse());

        Persona[] personas = {
                new Cliente("Ana López", "04512378-9", "7777-1234"),
                new Empleado("Luis Pérez", "06223456-1", 850.0),
                new Visitante("Kevin")
        };

        for (Persona p : personas) {
            System.out.println(p.presentarse());
        }

        Estudiante e = new Estudiante("Carlos Ramírez", "06123456-7",
                "UPED-2026-045", "Ing. en Sistemas");
        System.out.println(e);
        e.matricular("Programación III");

        Docente docente = new Docente("María Hernández", "05987654-3", "Ingeniería de Software", 8);
        System.out.println(docente);
        docente.impartirClase("Programación III");
    }
}