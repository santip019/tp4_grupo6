package ar.edu.unju.escmi.tp4.ejercicio6;

public class Libro implements Comparable<Libro> { 
    private String isbn;
    private String titulo;
    private int paginas;
    private String autor;

    public Libro() {
        // Constructor por defecto
    }

    // Getters y Setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getPaginas() { return paginas; }
    public void setPaginas(int paginas) { this.paginas = paginas; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    // Metodo para mostrar datos
    public void mostrarDatos() {
        System.out.println("Libro{isbn='" + isbn + "', título='" + titulo + "', páginas=" + paginas + ", autor='" + autor + "'}");
    }

    // Implementacion de Comparable (ordenar por titulo)
    public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }
}


/*/
Ejercicio 6:
Dentro del paquete correspondiente al ejercicio 6, cree una clase java denominada Libro con los
siguientes atributos:
 isbn
 título
 cantidad de páginas
 autor
Dentro de la clase Libro crear un método para mostrar los datos del objeto libro.
Agregue una clase con nombre Ejercicio6 que incluya el método main(), dentro de este método
declare y cree un ArrayList donde se guardarán los diferentes objetos de la clase Libro.
Cree un menú de opciones que muestre las siguientes opciones:
1 – Alta de Libro.
2 – Mostrar libros.
3 – Buscar y mostrar un libro
4 – Ordenar libros.
5 – Modificar datos de un libro.
6 – Eliminar un libro.
7 – Salir.
En la opción 1 utilice el constructor por defecto para crear los objetos.
En la opción 2 utilizar el método mostrarDatos() declarado en la clase Libro.
En la opción 3 solicitar al usuario que ingrese el isbn para buscar el libro, si se encuentra mostrar
los datos del libro, si no está incluido en el arrayList mostrar un mensaje “libro no encontrado”.
En la opción 4 ordenar por el título del libro. La clase Libro debe implementar la interfaz
Comparable. Utilizar el método sort() de la clase Collections para realizar el ordenamiento.
En la opción 5 solicitar al usuario que ingrese un isbn, buscar el libro, mostrar sus datos y pedir
al usuario que ingrese los nuevos datos excepto el isbn.
En la opción 6 solicitar al usuario que ingrese un isbn, buscar el libro y eliminarlo del arrayList.
/*/