package ar.edu.unju.escmi.tp4.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws InterruptedException {
        // Se agrega la excepción InterruptedException para manejar las pausas
        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();

        byte op;
        do {
            System.out.println("\n **** Menú de Opciones ****");
            System.out.println("1 - Alta de libro");
            System.out.println("2 - Mostrar libros");
            System.out.println("3 - Buscar y mostrar un libro");
            System.out.println("4 - Ordenar libros por titulo");
            System.out.println("5 - Modificar datos de un libro");
            System.out.println("6 - Eliminar un libro");
            System.out.println("7 - Salir");
            System.out.print("Ingrese una opción: ");
            op = sc.nextByte();
            sc.nextLine(); // limpiar buffer

            switch (op) {
                case 1: // Alta de libro
                    Libro nuevo = new Libro(); // usar constructor por defecto
                    System.out.print("Ingrese ISBN: ");
                    nuevo.setIsbn(sc.nextLine());
                    System.out.print("Ingrese título: ");
                    nuevo.setTitulo(sc.nextLine());
                    System.out.print("Ingrese cantidad de páginas: ");
                    nuevo.setPaginas(sc.nextInt());
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Ingrese autor: ");
                    nuevo.setAutor(sc.nextLine());

                    libros.add(nuevo);
                    System.out.println("Libro agregado.");
                    Thread.sleep(2000);
                    break;

                case 2: // Mostrar los libros
                    System.out.println("\n**** Lista de Libros ****");
                    for (Libro libro : libros) {
                        libro.mostrarDatos();
                    }
                    Thread.sleep(4000);
                    break;

                case 3: // Buscar libro
                    System.out.print("Ingrese ISBN a buscar: ");
                    String isbnBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Libro libro : libros) {
                        if (libro.getIsbn().equals(isbnBuscar)) {
                            libro.mostrarDatos();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Libro no encontrado.");
                    }
                    Thread.sleep(2000);
                    break;

                case 4: // Ordenar libros
                    Collections.sort(libros); // usa compareTo
                    System.out.println("Libros ordenados por título.");
                    Thread.sleep(2000);
                    break;

                case 5: // Modificar libro
                    System.out.print("Ingrese ISBN del libro a modificar: ");
                    String isbnModificar = sc.nextLine();
                    Libro libroModificar = null;
                    for (Libro libro : libros) {
                        if (libro.getIsbn().equals(isbnModificar)) {
                            libroModificar = libro;
                            break;
                        }
                    }
                    if (libroModificar != null) {
                        libroModificar.mostrarDatos();
                        System.out.print("Ingrese nuevo título: ");
                        libroModificar.setTitulo(sc.nextLine());
                        System.out.print("Ingrese nueva cantidad de páginas: ");
                        libroModificar.setPaginas(sc.nextInt());
                        sc.nextLine();
                        System.out.print("Ingrese nuevo autor: ");
                        libroModificar.setAutor(sc.nextLine());
                        System.out.println("Datos modificados.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    Thread.sleep(2000);
                    break;

                case 6: // Eliminar libro
                    System.out.print("Ingrese ISBN del libro a eliminar: ");
                    String isbnEliminar = sc.nextLine();
                    Libro libroEliminar = null;
                    for (Libro libro : libros) {
                        if (libro.getIsbn().equals(isbnEliminar)) {
                            libroEliminar = libro;
                            break;
                        }
                    }
                    if (libroEliminar != null) {
                        libros.remove(libroEliminar);
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    Thread.sleep(2000);
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    Thread.sleep(2000);
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 7);

        sc.close();
    }
}