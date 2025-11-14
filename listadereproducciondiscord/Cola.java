package pilas.listadereproducciondiscord;

public class Cola {
    private int[] elementos;
    private int frente, fin;
    private int max;

    public Cola(int max) {
        this.max = max;
        elementos = new int[max];
        frente = 0;
        fin = -1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    public boolean estaLlena() {
        return fin == max - 1;
    }

    public void insertar(int elem) {
        if (!estaLlena()) {
            fin++;
            elementos[fin] = elem;
        } else {
            System.out.println("La cola está llena.");
        }
    }

    public int sacar() {
        if (!estaVacia()) {
            int elem = elementos[frente];
            frente++;
            return elem;
        } else {
            System.out.println("La cola está vacía.");
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elementos en la cola:");
            for (int i = frente; i <= fin; i++) {
                System.out.println(elementos[i]);
            }
        }
    }    
}   
