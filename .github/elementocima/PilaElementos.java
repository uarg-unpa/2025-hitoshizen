package pilas.elementocima;
/*
Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal
 */
public class PilaElementos {
    final int maxpila=5;
	char[] elementos;
    int cima;

	public PilaElementos() {
		elementos = new char[maxpila];
        cima = 0;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
	public void apilar(char x) {
        if (!estaLlena()) {
            elementos[cima] = x;
            cima++;
        } else {
            System.out.println("Pila llena");
        }
    }

    public char desapilar() {
        if (!estaVacia()) {
            cima--;
            return elementos[cima];
        } else {
            System.out.println("Pila vacía");
            return '\0';
        }
    }
    public char elementoCima() {
        if (!estaVacia()) {
            return elementos[cima - 1];
        } else {
            System.out.println("La pila está vacía, no hay elemento en la cima");
            return '\0';
        }
    }
    
	
}
