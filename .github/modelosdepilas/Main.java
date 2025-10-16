package pilas.modelosdepilas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila();
        int elemento = 0;
        System.out.println("Ingrese un elemento a la pila de ENTEROS -----------");
        elemento = scanner.nextInt();
        pila.meter(elemento);
        pila.estaLlena();
        
        scanner.close();
    }
}
