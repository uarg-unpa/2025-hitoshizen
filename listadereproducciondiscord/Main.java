package pilas.listadereproducciondiscord;

import java.util.Scanner;

/*
Un tema musical se define por su intérprete, genero, año de lanzamiento 
Los temas se guardan en la mismo orden en que fuero agragados
Un reproductor musical 
Metodos
agregar nuevos temas
Reproducir la lista completa, mostrando en pantalla la información 
Definir las clases necesarias para modelar ejem tema musical y reproductor musical 
  
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola colaEnteros = new Cola(10);
        
        int opcion = 0;

        do {
            System.out.println("\n=== MENÚ DE COlA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1: // Meter elemento
                    if (colaEnteros.estaLlena()) {
                        System.out.println("Error: La cola está llena.");
                    } else {
                        System.out.print("Ingrese el nombre del tema: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el interprete: ");
                        String interprete = sc.nextLine();
                        System.out.print("Ingrese el genero: ");
                        String genero = sc.nextLine();
                        System.out.print("Ingrese el año de lanzamiento: ");
                        int anioLanzamiento = sc.nextInt();
                        sc.nextLine(); 
                        TemaMusical tema = new TemaMusical(nombre, interprete, genero, anioLanzamiento);
                        System.out.print("Ingrese un tema: ");
                        System.out.println("Elemento "+tema+" agregado.");
                    }
                    break;
                case 2: // Sacar elemento
                    if (colaEnteros.estaVacia()) {
                        System.out.println("Error: La cola está vacía.");
                    } else {
                        int elemento = colaEnteros.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;
                case 3: // Verificar estado
                    if(colaEnteros.estaVacia()){
                        System.out.println("La cola está vacía.");
                    } else if(colaEnteros.estaLlena()){
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.println("La cola tiene espacio disponible.");
                    }
                    break;
                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
