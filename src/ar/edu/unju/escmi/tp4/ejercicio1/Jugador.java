package ar.edu.unju.escmi.tp4.ejercicio1;

public class Jugador {
    private int dni;
    private String nombre;
    private String equipo;
    private String nacionalidad;
    private float estatura;

    public Jugador(int dni, String nombre, String equipo, String nacionalidad, float estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.equipo = equipo;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
    }

    public void mostrarDatos() {
        System.out.println("--------------------------------------------------");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Equipo: " + equipo);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Estatura: " + estatura);
        System.out.println("--------------------------------------------------");
    }

    // Getters: Métodos para obtener los valores de los atributos
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public float getEstatura() {
        return estatura;
    }

    // Setters: Métodos para modificar los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}

// DNI
// Nombre
// Equipo
// Nacionalidad
// Estatura