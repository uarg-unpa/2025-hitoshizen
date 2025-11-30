package pa.persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apellido");
        String apellido = scanner.nextLine();
        System.out.println("ingrese la edad");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese el DNI");
        int dni = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese el Sexo");
        String sexo = scanner.nextLine();
        char charSexo = sexo.charAt(0);
        System.out.println("Ingrese el peso");
        double peso=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la altura");
        double altura=scanner.nextDouble();
        scanner.nextLine();
        Persona p1 = new Persona(apellido, edad, dni, sexo, peso, altura); 
        scanner.close();
        p1.calcularIMC(); 
        System.out.println(p1.calcularIMC());
        System.out.println(p1.esMayorDeEdad());
        System.out.println(p1.toString());
    }

}
