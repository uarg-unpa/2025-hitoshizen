package pilas.pilasincima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilaint p = new Pilaint();
        
        for(int i=0; i<p.maximo(); i++){
            System.out.print("ingrese un numero");
            int num; 
            num = scanner.nextInt();
            p.meter(num);
        }
        for(int i=0; i<p.maximo(); i++){
            System.out.println("Se sacara algun numero");
            p.sacar();
        }

    }
} 
