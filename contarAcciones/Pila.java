package pilas.contarAcciones;

public class Pila {
    private String[] vec;
    private int tope;
    public int max;

    public Pila(int max){
        this.max = max;
        vec = new String[max];
        tope = 0;
    }

    public boolean estaVacia(){
        return tope == 0;
    }

    public boolean estaLlena(){
        return tope == max;
    }

    public void meter(String x){
        if (!estaLlena()) {
            vec[tope] = x;
            tope++;
        }
    }

    public String sacar(){
        if (!estaVacia()) {
            tope--;
            return vec[tope];
        }
        return null;
    }

    public void mostrar() {
        System.out.println("Contenido de la pila (tope -> base):");
        for (int i = tope - 1; i >= 0; i--) {
            System.out.println(vec[i]);
        }
    }

    public int contarAcciones(String accionBuscada) {
        Pila aux = new Pila(max);
        int contador = 0;

        while (!this.estaVacia()) {
            String accion = this.sacar();

            if (accion.equalsIgnoreCase(accionBuscada)) {
                contador++;
            }
            aux.meter(accion);
        }
        while (!aux.estaVacia()) {
            this.meter(aux.sacar());
        }

        return contador;
    }
}
