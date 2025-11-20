package pilas.pilaCima;


public class Main {
    public static void main(String[] args) {
    PilaCima pila = new PilaCima();
    pila.apilar(10);
    pila.apilar(20);

    System.out.println("Elemento en la cima: " + pila.estaLlena()); 
    System.out.println("Desapilo: " + pila.desapilar());               
    System.out.println("Nueva cima: " + pila.estaLlena());          
}

}
