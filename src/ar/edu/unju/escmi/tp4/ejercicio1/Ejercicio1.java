package ar.edu.unju.escmi.tp4.ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {
        // Se agrega la excepción InterruptedException para manejar las pausas
        Scanner sc = new Scanner(System.in);
        byte op;
        ArrayList<Jugador> jugadores = new ArrayList<>();

        do {

            System.out.println("\n **** Menu de Opciones ****");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Modificar los datos de un jugador");
            System.out.println("3 - Eliminar un jugador");
            System.out.println("4 - Mostrar todos los jugadores");
            System.out.println("5 - Mostrar la cantidad de jugadores en la lista");
            System.out.println("6 - Limpiar toda la lista de jugadores");
            System.out.println("7 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); // Para limpiar el buffer del scanner

            switch (op) {
                case 1:
                    System.out.print("Ingrese el DNI del jugador: ");
                    int dni = sc.nextInt();

                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombre = sc.next();

                    System.out.print("Ingrese el equipo del jugador: ");
                    String equipo = sc.next();

                    System.out.print("Ingrese la nacionalidad del jugador: ");
                    String nacionalidad = sc.next();

                    System.out.print("Ingrese la estatura del jugador: ");
                    float estatura = sc.nextFloat();

                    sc.nextLine(); // Consumir la nueva línea después de nextFloat()

                    Jugador j = new Jugador(dni, nombre, equipo, nacionalidad, estatura);
                    jugadores.add(j);

                    System.out.println("El jugador fue agregado exitosamente.");
                    Thread.sleep(2000); // Pausa de 2 segundos para que el usuario vea el mensaje
                    break;

                case 2:
                    System.out.print("Ingrese el DNI del Jugador a modificar: ");
                    int dniModificar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;

                    for (Jugador jugador : jugadores) { // Recorre la lista de jugadores
                        if (jugador.getDni() == dniModificar) { // Verifica si el jugador existe
                            encontrado = true;
                            System.out.println("****Jugador encontrado****");

                            System.out.print("Ingrese el nuevo nombre del jugador: ");
                            jugador.setNombre(sc.next());

                            System.out.print("Ingrese el nuevo equipo del jugador: ");
                            jugador.setEquipo(sc.next());

                            System.out.print("Ingrese la nueva nacionalidad del jugador: ");
                            jugador.setNacionalidad(sc.next());

                            System.out.print("Ingrese la nueva estatura del jugador: ");
                            jugador.setEstatura(sc.nextFloat());

                            sc.nextLine(); // Consumir la nueva línea después de nextFloat()

                            System.out.println("Los datos del jugador fueron modificados exitosamente.");
                            Thread.sleep(2000);
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el Jugador con ese DNI.");
                    }
                    Thread.sleep(2000);
                    break;

                case 3:
                    boolean eliminado = false;

                    System.out.print("Ingrese el DNI del Jugador a eliminar: ");
                    int dniEliminar = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < jugadores.size(); i++) { // Recorre la lista de jugadores por índice
                        if (jugadores.get(i).getDni() == dniEliminar) { // Verifica si el jugador existe
                            jugadores.remove(i); // Elimina el jugador de la lista
                            eliminado = true;
                            System.out.println("El jugador fue eliminado exitosamente.");
                            Thread.sleep(2000);
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("No se encontró el Jugador con ese DNI.");
                    }
                    Thread.sleep(2000);
                    break;

                case 4:
                    System.out.println("*****Lista de Jugadores*****");
                    for (Jugador jugador : jugadores) {
                        if (jugador != null) {
                            jugador.mostrarDatos(); // Llama al método para mostrar los datos del jugador
                        }
                    }
                    Thread.sleep(2000);
                    break;

                case 5:
                    System.out.println("Cantidad de jugadores en la lista: " + jugadores.size());
                    // Muestra la cantidad de jugadores en la lista con el metodo size()
                    Thread.sleep(2000);
                    break;

                case 6:
                    jugadores.clear(); // Limpia toda la lista de jugadores con el metodo clear()
                    System.out.println("La lista de jugadores ha sido limpiada.");
                    Thread.sleep(2000);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    Thread.sleep(2000);
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        } while (op != 7);

    }
}

// Luego agregue una nueva clase Java dentro del paquete
// ar.edu.unju.escmi.tp4.ejercicio1 denominada Ejercicio1 e incluya en ella el
// método main(). Desde ese método realice la construcción de un menú de
// opciones. Todos los objetos creados deben ser almacenados en un
// ArrayList.
// 1 – Alta de jugador.
// 2 – Modificar los datos de un jugador.
// 3 – Eliminar un jugador.
// 4 – Mostrar todos los jugadores.
// 5 – Mostrar la cantidad de jugadores en la lista.
// 6 – Limpiar toda la lista de jugadores.
// 7 - Salir
// En la opción 1 utilizar el constructor por defecto para crear los objetos.
// En la opción 2 solicitar al usuario que ingrese el dni de un usuario, si lo
// encuentra mostrar los datos del jugador y luego solicitar los nuevos datos
// excepto el dni.
// En la opción 3 solicitar al usuario que ingrese un dni, buscar el jugador, si
// lo encuentra eliminarlo.
// Si no se encuentra el dni mostrar “No se encuentra el dni”.
// En la opción 4 mostrar los datos de todos los jugadores, utilizar un método
// que debe estar dentro de la clase Jugador para mostrar todos los datos del
// jugador.
// En la opción 5 utilizar el método size() para mostrar la cantidad de
// jugadores que se almacenaron en el arrayList.
// En la opción 6 utilizar el método clear().