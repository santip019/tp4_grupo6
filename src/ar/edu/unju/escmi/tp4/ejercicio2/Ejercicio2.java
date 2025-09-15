package ar.edu.unju.escmi.tp4.ejercicio2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Empleado> empleados = new HashMap<>();

        int opcion;
        do {
            System.out.println("\n **** Menu de Opciones ****");
            System.out.println("1 - Alta de empleado");
            System.out.println("2 - Mostrar empleados");
            System.out.println("3 - Eliminar empleado");
            System.out.println("4 - Consultar empleado");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // Alta
                    System.out.print("Ingrese DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese sueldo: ");
                    double sueldo = sc.nextDouble();
                    System.out.print("Ingrese categoría (una letra): ");
                    char categoria = sc.next().charAt(0);

                    Empleado nuevo = new Empleado(dni, nombre, apellido, sueldo, categoria);
                    String clave = dni + categoria; // clave formada por dni+categoría
                    empleados.put(clave, nuevo);
                    System.out.println("Empleado agregado con clave: " + clave);
                    break;

                case 2: // Mostrar los empleados
                    System.out.println("****Empleados cargados*****");
                    Iterator<String> it = empleados.keySet().iterator();
                    while (it.hasNext()) {
                        String key = it.next();
                        System.out.println("Clave: " + key + " -> " + empleados.get(key));
                    }
                    break;

                case 3: // Eliminar un empleado
                    System.out.print("Ingrese la clave del empleado a eliminar: ");
                    String claveEliminar = sc.nextLine();
                    if (empleados.containsKey(claveEliminar)) {
                        empleados.remove(claveEliminar);
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("No existe esa clave.");
                    }
                    break;

                case 4: // Consultar
                    System.out.print("Ingrese la clave del empleado a consultar: ");
                    String claveBuscar = sc.nextLine();
                    if (empleados.containsKey(claveBuscar)) {
                        System.out.println("Datos: " + empleados.get(claveBuscar));
                    } else {
                        System.out.println("No existe esa clave.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
