package ar.edu.unju.escmi.tp4.ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer datos desde la terminal
        byte op = 0; // Variable para la opcion del menú

        Set<Cliente> clientes = new HashSet<>(); // HashSet para almacenar los clientes

        do {
            System.out.println("");
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar todos los clientes");
            System.out.println("3 - Mostrar los datos de un cliente");
            System.out.println("4 - Mostrar todos los clientes ocasionales y la cantidad");
            System.out.println("5 - Mostrar todos los clientes frecuentes y la cantidad");
            System.out.println("6 - Salir \n");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            System.out.println("");

            switch (op) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    int dni1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre1 = sc.nextLine();
                    System.out.print("Ingrese tipo de ciente [ocasional o frecuente]: ");
                    String tipoCliente1 = sc.nextLine();

                    Cliente nuevo = new Cliente(dni1, nombre1, tipoCliente1); // Se crea un nuevo cliente mediante un constructor parametrizado
                    clientes.add(nuevo); // Se agregar al HashSet
                    System.out.println("**** Cliente agregado correctamente ****");
                    break;
                case 2:
                    // Convierte el HashSet en un stream e itera todos los elementos, imprimiendo cada cliente (utiliza el método toString)
                    clientes.stream().forEach(System.out::println);
                    break;
                case 3:
                    // Buscar y mostrar los datos de un cliente por DNI
                    System.out.print("Ingrese DNI a buscar: ");
                    int dniBuscar = sc.nextInt();
                    clientes.stream().filter(n -> n.getDni() == dniBuscar) // Filtra los clientes cuyo DNI sea igual al ingresado
                        .findFirst() // Busca el primer cliente que cumpla la condición
                        .ifPresentOrElse(
                            System.out::println, // Si se encontró un cliente lo muestra por pantalla
                            () -> System.out.println("No se encontró el dni") // Si no, muestra el mensaje de no encontrado
                    );
                    break;
                case 4:
                    long cantidadOcasional = clientes.stream().filter(n -> n.getTipoCliente().equalsIgnoreCase("ocasional")).count(); // Cuenta cuántos clientes cumplen la condición
                    System.out.println("Cantidad de clientes ocasionales: " + cantidadOcasional);
                    clientes.stream().filter(n -> n.getTipoCliente().equalsIgnoreCase("ocasional")).forEach(System.out::println);
                    break;
                case 5:
                    long cantidadFrecuente = clientes.stream().filter(n -> n.getTipoCliente().equalsIgnoreCase("frecuente")).count(); // Cuenta cuántos clientes cumplen la condición
                    System.out.println("Cantidad de clientes frecuentes: " + cantidadFrecuente);
                    clientes.stream().filter(n -> n.getTipoCliente().equalsIgnoreCase("frecuente")).forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("---- Fin del programa ---- \n");
                    break;
                default:
                    System.out.println("++++ Opcion invalida ++++");
                    break;
            }
        } while (op != 6);
        sc.close(); // Cierra el Scanner
    }
}
