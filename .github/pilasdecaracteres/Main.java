package pilas.pilasdecaracteres;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaChar pila = new PilaChar();

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Meter los caracteres en la pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.meter(palabra.charAt(i));
        }

        // Sacar los caracteres para invertirla
        System.out.print("Palabra invertida: ");
        while (!pila.estaVacia()) {
            System.out.print(pila.sacar());
        }
    }
    
}
