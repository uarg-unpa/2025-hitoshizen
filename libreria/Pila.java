package pilas.libreria;
public class Pila {
    public int maxpila;
    public Libro[] elementos;
    public int cima;

    public Pila(int maxpila){
        this.maxpila = maxpila;
        this.elementos = new Libro[maxpila];
        this.cima = -1;  
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == maxpila - 1;
    }

    public void meter(Libro libro) {
        if (!estaLlena()) {
            elementos[++cima] = libro; 
        }
    }

    public Libro sacar() {
        if (!estaVacia()) {
            return elementos[cima--];   
        } 
        return null;
    }
    public Pila filtrarPorAutor(String autorBuscado) {
        Pila resultado = new Pila(maxpila);
        Pila aux = new Pila(maxpila);

        // 1) Sacar todo a aux (invierte la pila)
        while (!this.estaVacia()) {
            aux.meter(this.sacar());
        }

        // 2) Volver a pasar a this y filtrar a resultado SIN invertir el orden final
        while (!aux.estaVacia()) {
            Libro libro = aux.sacar();
            this.meter(libro); // restauro la pila original
            if (libro.getAutor().equals(autorBuscado)) {
                resultado.meter(libro);
            }
        }

        return resultado;
    }
    
    public static void mostrarPila(Pila p) {
        Pila aux = new Pila(p.maxpila);

        while (!p.estaVacia()) {
            Libro libro = p.sacar();
            System.out.println(libro);
            aux.meter(libro);
        }

        while (!aux.estaVacia()) {
            p.meter(aux.sacar());
        }
    }

    /* 
     public Pila filtrarPorAutor(String autor){
        Pila pilaFiltrada2 = new Pila(maxpila);
        Pila pilaFiltrada = new Pila(maxpila);
        while (!estaVacia()) {
        Libro libroSacado = sacar();
            if (libroSacado.getAutor().equals(autor)) {
                pilaFiltrada.meter(libroSacado);
            }   
            pilaFiltrada2.meter(libroSacado);
        }
        while (!pilaFiltrada2.estaVacia()) {
            meter(pilaFiltrada2.sacar());
        }
        return pilaFiltrada;
    */
     
}


    
   
       


