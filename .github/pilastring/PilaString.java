package pilas.pilastring;

public class PilaString {
    final int pila=30;
    private String [] elementos;
    private int cima;
    public PilaString(){
        elementos = new String[pila];
        cima = -1;
    }
    /*
     Dado el objeto pila P que contiene dos atributos: un arreglo de caracteres de dimensión 5 y CIMA un
    entero. C es una variable de tipo carácter. Para cada ejemplo de los que siguen, mostrar el resultado de la
    operación sobre la pila. Si ocurre desbordamiento o desbordamiento negativo, comprobar el caso
    correspondiente; si no mostrar el nuevo contenido del arreglo, CIMA y C
     */
    public boolean estaVacia(){
        return (cima == -1);
    }
    public boolean estaLlena() {
		return (cima == pila-1);
	}
    public void meter(String e) {     
		   cima = cima+1;	
         elementos[cima]=e;           			
	}
	public String sacar() {		      
		String aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}
    

}
