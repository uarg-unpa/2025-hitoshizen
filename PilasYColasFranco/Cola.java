package PilasYColasFranco;
public class Cola {

    private int[] elementos;
    private int frente;
    private int ultimo;
    private int max;

    public Cola(int max) {
        this.max = max;
        elementos = new int[max];
        frente = 0;
        ultimo = -1;
    }

    public boolean estaVacia() {
        return ultimo < frente;
    }

    public boolean estaLlena() {
        return ultimo == max - 1;
    }

    public void insertar(int elem) {
        if (!estaLlena()) {
            ultimo++;
            elementos[ultimo] = elem;
        } else {
        }
    }

    public int sacar() {
        if (!estaVacia()) {
            int elem = elementos[frente];
            frente++;
            return elem;
        } else {
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        Cola aux = new Cola(this.max);
        while (!this.estaVacia()) {
            int dato = this.sacar();
            System.out.print(dato + " ");
            aux.insertar(dato);        // Se guarda temporalmente
        }
        System.out.println();
        while (!aux.estaVacia()) {
            this.insertar(aux.sacar());
        }
    }


    private boolean contiene(Cola cola, int x) {
        Cola temp = new Cola(cola.max);
        boolean existe = false;

        while (!cola.estaVacia()) {
            int dato = cola.sacar();
            if (dato == x)
                existe = true;
            temp.insertar(dato);
        }
        Cola restaurada = new Cola(cola.max);
        while (!temp.estaVacia()) {
            restaurada.insertar(temp.sacar());
        }

        // Copiar restaurada a cola
        cola.elementos = restaurada.elementos;
        cola.frente = restaurada.frente;
        cola.ultimo = restaurada.ultimo;

        return existe;
    }

    public boolean contieneElemento(int x) {
        return contiene(this, x);
    }

    public int eliminarTodas(int x) {
        Cola aux = new Cola(this.max);
        int count = 0;

        while (!this.estaVacia()) {
            int dato = this.sacar();
            if (dato == x)
                count++;
            else
                aux.insertar(dato);
        }

        // Crear cola limpia y restaurar contenido
        Cola nueva = new Cola(this.max);
        while (!aux.estaVacia()) {
            nueva.insertar(aux.sacar());
        }

        this.elementos = nueva.elementos;
        this.frente = nueva.frente;
        this.ultimo = nueva.ultimo;

        return count;
    }

    public Cola invertir() {
        Cola aux1 = new Cola(this.max);
        Cola aux2 = new Cola(this.max);
        Cola invertida = new Cola(this.max);

        // Pasar a aux1
        while (!this.estaVacia()) {
            aux1.insertar(this.sacar());
        }

        // Invertir
        while (!aux1.estaVacia()) {
            int primero = aux1.sacar();

            while (!aux1.estaVacia()) {
                aux2.insertar(aux1.sacar());
            }

            invertida.insertar(primero);

            while (!aux2.estaVacia()) {
                aux1.insertar(aux2.sacar());
            }
        }

        return invertida;
    }
}
