package Auto;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese el año: ");
        int ano = sc.nextInt();

        System.out.print("Ingrese la velocidad inicial: ");
        double velocidad = sc.nextDouble();

        Auto a1 = new Auto(marca, modelo, ano, velocidad);

        System.out.println("\nInformación del auto:");
        System.out.println(a1);
        System.out.println("\nEl auto acelera...");
        System.out.print("Ingrese cuánto acelerar: ");  
        int valor = sc.nextInt();
        a1.acelerar();

        System.out.println(a1);
        System.out.println("\nEl auto frena...");
        a1.frenar();
        System.out.println(a1);
        sc.close();
    }

}
