package PilasYColasFranco;

public class Main{
    public static void main(String[] args) {
        Cola c = new Cola(10);
        
        c.insertar(10);
        c.insertar(20);
        c.insertar(15);
        c.insertar(30);
        c.insertar(20);
        c.insertar(40);
        c.insertar(20);
        
        System.out.println("Contiene 25?: " + c.contieneElemento(25));
        
        int eliminados = c.eliminarTodas(20);
        
        System.out.println("Eliminados del numero 20: " + eliminados);

        System.out.print("Cola resultante: ");
        c.mostrar();
        // Crear e imprimir la cola invertida (40,30,15,10)
        Cola invertida = c.invertir();
        System.out.print("Cola invertida: ");
        invertida.mostrar();
    }

}   