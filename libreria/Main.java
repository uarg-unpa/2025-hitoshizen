package pilas.libreria;

public class Main {
    public static void main(String[] args) {
        Pila pilaDeLibros = new Pila(5);
        Pila pilaAux = new Pila(5);

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 565);
        Libro libro4 = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 348);
        pilaDeLibros.meter(libro1);
        pilaDeLibros.meter(libro2);
        pilaDeLibros.meter(libro3);
        pilaDeLibros.meter(libro4);
        pilaAux = pilaDeLibros;
        
        pilaDeLibros = pilaDeLibros.filtrarPorAutor("Gabriel García Márquez");
        while (!pilaDeLibros.estaVacia()) {
            Libro aux = pilaDeLibros.sacar();
            System.out.println(aux);
        }
    /*
        Autor = "x";
        PilaDeLibros.filtrarPorAutor(Autor);
        While (!pilaResultante.estaVacia){
        Libro aux=pilaResultante.sacar();
        System.out.println(aux)
        }
    */

        
        
    }

   
}
