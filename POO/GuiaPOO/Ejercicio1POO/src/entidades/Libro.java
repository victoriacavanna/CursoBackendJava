/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package entidades;

import java.util.Scanner;


public class Libro {
    Scanner read = new Scanner(System.in);
    
    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(){
        
    }
    public void cargarLibro(){
        System.out.println("Ingresar ISBN: ");
        this.isbn = read.next();
        
        System.out.println("Ingresar título: ");
        this.titulo = read.next();
     
        System.out.println("Ingresar autor: ");
        this.autor = read.next();
        
        System.out.println("Ingresar cantidad de páginas: ");
        this.paginas = read.nextInt();
        
        
    }
    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void mostrarLibro(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("N° de páginas: " + paginas);
              
    }
    
}
