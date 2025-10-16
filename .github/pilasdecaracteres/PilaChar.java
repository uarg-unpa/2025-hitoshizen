package pilas.pilasdecaracteres;
/*
Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
en forma inversa.
 */

public class PilaChar {
    final int maxpila = 50;
    char[] elementos;
    int cima;

    public PilaChar() {
        elementos = new char[maxpila];
        cima = -1; 
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == maxpila - 1);
    }

    public void meter(char e) {
        if (!estaLlena()) {
            elementos[cima] = e;
            cima++;
        } else {
            System.out.println("Pila llena, no se puede insertar más elementos.");
        }
    }

    public char sacar() {
        if (!estaVacia()) {
            char aux = elementos[cima];
            cima--;
            return aux;
        } else {
            System.out.println("Pila vacía, no se puede sacar elemento.");
            return '\0';
        }
    }
}
