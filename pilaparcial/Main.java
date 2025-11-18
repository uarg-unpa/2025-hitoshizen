package pilaparcial;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {  
        Cola cola1 = new Cola(7);
        Cola cola2 = new Cola(6);
        Pila pila = new Pila(); 
        Scanner sc = new Scanner(System.in);
        cola1.masElementos(cola1, cola2);
        cola2.masElementos(cola1, cola2);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        for(int i = 0; i < palabra.length(); i++){
            pila.meter(palabra.charAt(i));
        }
        int cont = 0;
        int max = pila.tope();
        char elem;
        while(!pila.estaVacia() && max > 0){
            elem = (char) pila.sacar();
            switch(elem){
                case 'A':
                    cont++;
                    break;
                case 'E':
                    cont++;
                    break;
                case 'I':
                    cont++;
                    break;
                case 'O':
                    cont++;
                    break;
                case 'U':
                    cont++;
                    break;
            }
            max--;
        }
        System.out.println("la cantidad de vocales dentro de la pila son: "+cont);
        if(cont > 0){
        }else{
            System.out.println("No hay vocales en la palabra!");
        }
    }
}