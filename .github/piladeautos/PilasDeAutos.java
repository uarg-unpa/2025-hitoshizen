package pilas.piladeautos;
/*
Implementar una pila de autos, la cual puede guardar hasta 10 autos. En un main permitir al usuario
ingresar autos y buscar un auto por número de patente y si se encuentra en la pila sacarlo y mostrar la
información del mismo
 */
public class PilasDeAutos {
    final int maxpila=10;
	int [] elementos;
	int cima;
	
	public PilasDeAutos() {
		elementos = new int[maxpila];
		cima = -1;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
	
	public void meter(int e) {     
		elementos[cima]=e;           			
        cima = cima+1;	
    }
	
	public int sacar() {		      
		int aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}
}
