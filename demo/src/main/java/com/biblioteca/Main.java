package com.biblioteca;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

        // --- Libro 1: constructor con parámetros ---
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 5, 1);
        System.out.println("Libro1: " + libro1);

        //Libro 2: constructor por defecto + datos por consola ---
        Libro libro2 = new Libro();
        System.out.print("Titulo libro2: ");
        libro2.setTitulo(teclado.nextLine());
        System.out.print("Autor libro2: ");
        libro2.setAutor(teclado.nextLine());
        System.out.print("ejemplares: ");
        libro2.setEjemplares(Integer.parseInt(teclado.nextLine()));
        System.out.print("ejemplares prestados: ");
        libro2.setEjemplaresPrestados(Integer.parseInt(teclado.nextLine()));
        System.out.println("Libro2: " + libro2);

        // LibroTextoUNIAC: con todos sus atributos ---
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programación", "Deitel & Deitel",
                10, 3, "Programación II", "Facultad de Ingeniería de Sistemas");
        System.out.println("LibroTextoUNIAC: " + libroTextoUNIAC);

        //Novela: indicando su tipo
        Novela novela = new Novela("Cien Años de Soledad", "García Márquez",
                8, 2, Novela.TipoNovela.REALISTA);
        System.out.println("Novela: " + novela);

        //Préstamo y devolución
        

// intentar un préstamo
boolean ok = libro1.prestamo();      // true si había ejemplares disponibles
System.out.println("Préstamo ejecutado: " + ok);
System.out.println("estado tras préstamo: " + libro1);

// intentar otra devolución
if (libro1.devolucion()) {          // true si había algún ejemplar en préstamo
    System.out.println("Devolución correcta");
} else {
    System.out.println("No había préstamos que devolver");
}
System.out.println("estado final: " + libro1);
        }

}
}
// DOS SITUACIONES DONDE NO SE PUEDE APLICAR HERENCIA:

//  SITUACIÓN 1 - Atributos private:
  //  Los atributos de Libro (titulo, autor, etc.) son private, por lo que
 //   las subclases NO pueden acceder a ellos directamente. Esto causaría error:
 //       public class LibroTexto extends Libro {
 //           public void ejemplo() {
 //               this.titulo = "Java";       // ERROR: titulo has private access in Libro
 //               this.numEjemplares = 5;     // ERROR: numEjemplares has private access in Libro
 //           }
 //       }
//    Por eso se deben usar los métodos get/set heredados.

 // SITUACIÓN 2 - Clases final:
 //   Si una clase se declara como final, ninguna otra clase puede extenderla:
 //       public final class Libro { ... }
 //       public class LibroTexto extends Libro { ... } // ERROR: cannot inherit from final Libro
 //   Lo mismo aplica si LibroTexto fuera final: LibroTextoUNIAC no podría heredar de ella.
//
//Atributo 1: String isbn
 //   Código único internacional del libro. Permite identificación universal.
 //
 // Atributo 2: double precio
 //   Valor monetario del libro, útil para calcular multas por pérdida o daño.
 
 // Método adicional: calcularMulta(int diasRetraso)
 //   Calcula multa por retraso en devolución: precio * 0.01 * diasRetraso
 //   public double calcularMulta(int diasRetraso) {
 //       return precio * 0.01 * diasRetraso; }
 // 