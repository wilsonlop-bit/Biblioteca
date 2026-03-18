package org.example.biblioteca;

public class Main {
    public static void main(String[] args) {

        // Arreglo de tipo base
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        // Guardamos diferentes objetos
        materiales[0] = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Novela");
        materiales[1] = new Revista("National Geographic", "Varios", 2023, 150);
        materiales[2] = new Tesis("Inteligencia Artificial", "Juan Pérez", 2022, "Universidad Nacional");

        // Recorrido con polimorfismo
        for (MaterialBiblioteca material : materiales) {
            material.mostrarInfo(); // cada uno ejecuta su propia versión
        }
    }
}