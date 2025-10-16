package pilas.pilasincima;
/*Utilizando la clase Pila implementada con arreglo únicamente (no utiliza índice cima), escribir un
programa que permita meter y sacar elementos de la pila. Cada vez que se realice una operación deberá
informar cuantos elementos hay en la pila y cuantos elementos le faltan para llegar al máximo. */
public class Pilaint {
    final int maxpila=5;
	int [] elementos;
	//int cima;
	int cont = 0;
	public Pilaint() {
		elementos = new int[maxpila];
		//cima = -1;
        cont = 0; 
    }
	
	public boolean estaVacia() {
		return (cont == -1); // cont == 0;
	}

    public int maximo(){
        return maxpila;
    }
	
	public boolean estaLlena() {
		return (cont > maxpila); 
	}
	
	public void meter(int e) {     
		elementos[cont] = e; 
        cont = cont+1;       			
	}
	
	public int sacar() {		      
		int aux = elementos[cont];
		cont--;     
		return aux;
	}

    /*public int length() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }*/
}
