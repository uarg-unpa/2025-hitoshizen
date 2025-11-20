package pilas.pilaCima;
/*
Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal.
 */
public class PilaCima {
    private int[] elementos;
    private int cima;
    private final int MAX = 10;

    public PilaCima() {
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public void apilar(int dato) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = dato;
        } else {
            System.out.println("La pila está llena");
        }
    }

    public int desapilar() {
        if (!estaVacia()) {
            int dato = elementos[cima];
            cima--;
            return dato;
        } else {
            System.out.println("La pila está vacía");
            return -1;
        }
    }
}