/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica_cliente;

/**
 *
 * @author perfil
 */
public class Biblioteca {


    static class Libro {

        String titulo;
        String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        @Override
        public String toString() {
            return titulo + " - " + autor;
        }
    }

    static void ordenarLibros(Libro[] libros) {
        for (int i = 1; i < libros.length; i++) {
            Libro actual = libros[i];
            int j = i - 1;
            while (j >= 0 && libros[j].titulo.compareTo(actual.titulo) > 0) {
                libros[j + 1] = libros[j];
                j--;
            }
            libros[j + 1] = actual;
        }
    }

    public static void main(String[] args) {

        Libro[] libros = {
            new Libro("Fausto", "Johann Wolfgang von Goethe"),
            new Libro("Cien años de soledad", "Gabriel García Márquez"),
            new Libro("Decamerón", "Giovanni Boccaccio"),
            new Libro("Almas muertas", "Nikolai Gogol")
        };

        ordenarLibros(libros);

        System.out.println("Libros ordenados por título:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}


    

