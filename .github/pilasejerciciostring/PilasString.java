package pilas.pilasejerciciostring;

/*
Realice un programa que lea una expresión aritmética y determine si tiene correctamente
colocados los separadores (),{},[]. Obtener la expresión como un String.
 */
public class PilasString {
    int maxpila;
    char []elementos;
	int cima;

	public PilasString(int maxpila){
        this.maxpila = maxpila;
		this.elementos = new char[maxpila];
		int cima = -1;
	}
	public boolean estaVacia() {
		return (cima == -1);
	}
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
    
	public void meter(char letra) {     
        if(!estaLlena()){
            elementos[cima++] = letra;
        }
    }

	public char sacar(){
        char e = ' ';    
		if(!estaVacia()){
            e = elementos[cima];
            cima--;
        }  
        return e;
    }
    
}