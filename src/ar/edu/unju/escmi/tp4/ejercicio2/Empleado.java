package ar.edu.unju.escmi.tp4.ejercicio2;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double sueldo;
    private char categoria;

    public Empleado() {
        // Constructor por defecto
    }

    public Empleado(String dni, String nombre, String apellido, double sueldo, char categoria) {
        // Constructor parametrizado
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.categoria = categoria;
    }
    // Setters y Getters de cada atributo
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){ 
        return apellido; 
    }
    public void setApellido(String apellido){ 
        this.apellido = apellido; 
    }

    public double getSueldo(){ 
        return sueldo; 
    }
    public void setSueldo(double sueldo){ 
        this.sueldo = sueldo; 
    }

    public char getCategoria(){ 
        return categoria; 
    }
    public void setCategoria(char categoria){ 
        this.categoria = categoria;
    }
    // tostring ---> va a ser la forma en la que se muestre el empleado
    public String toString() {
        return "Empleado{" +
        "dni='" + dni + '\'' +
        ", nombre='" + nombre + '\'' +
        ", apellido='" + apellido + '\'' +
        ", sueldo=" + sueldo +
        ", categoria=" + categoria +
        '}';
    }
}

/*/con los siguientes atributos:
 dni
 nombre
 apellido
 sueldo
 categoría (de tipo char)
Agregue una clase con nombre Ejercicio2 que incluya el método main(). Construya un HashMap
donde la clave es de tipo String y el valor es de tipo Empleado. 
La clave será formada por el número de dni y la categoría del empleado, por ejemplo:
El dni del empleado es 20310458 y su categoría es A, entonces la clave para almacenar los datos
de este empleado será “20310458A” y el valor corresponde al objeto empleado en sí. ----
Arme el siguiente menú de opciones:
1 – Alta de empleado.
2 – Mostrar empleados.
3 – Eliminar empleado.
4 – Consultar los datos de un empleado.
5 – Salir.
Para la opción 1 utilice el constructor parametrizado para construir los objetos empleados.
Para la opción 2 utilice la estructura de control repetitiva While() junto con Iterator para recorrer
el HashMap y mostrar todos los datos (la clave y el valor).
Para la opción 3 ingrese la clave que esté dentro del hashmap y elimine el objeto correspondiente.
Para la opción 4 solicitar al usuario que ingrese una clave, buscar la clave utilizando los métodos
constainsKey() y get() luego mostrar los datos del empleado./*/
