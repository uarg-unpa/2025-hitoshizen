package pilaparcial;

public class Pila {
    final int maxpila = 10;
	private char []pila;
	private int cima;
	public Pila(){
		pila = new char[maxpila];
		cima = -1;
	}
	public boolean estaVacia(){
		return (cima == -1);
	}
	public boolean estaLlena(){
		return (cima == maxpila-1);
	}
	public void meter(int elem){
      if(!estaLlena()){
   	   cima++;	
       pila[cima] = (char) elem;
      }
      else
        System.out.println("La pila esta llena!");    			
	}
	public int sacar(){
	    int aux = 0;
        if(!estaVacia()){
            aux = pila[cima];
            cima--;
        }
        return aux;
	}
    public int maximo(){
      return this.maxpila;
    }
    public int tope(){
      return this.cima;
    }
	public void recorrer(){
      System.out.println("Elementos de la pila:");
      for(int i = this.cima; i >= 0; i--){
         System.out.println(pila[i]);
      }
   }
   
}