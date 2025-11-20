package pilas.pilasejerciciostring;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilasString pila1 = new PilasString(8);
        String palabra;
        System.out.print("Ingrese una palabra:");
        palabra = scanner.nextLine();

        int i=0;
        while(!pila1.estaLlena()){
            pila1.meter(palabra.charAt(i));
            i++;
        }
        char a = pila1.sacar();
        System.out.println(a);

        
        System.out.println("La palabra ingresada es: "+palabra );
        
        for(i=0; i<palabra.length();i++){
            char x = pila1.sacar();
            switch (x){
                case '(':
                    System.out.println("Ingreso parentecis abierto"+palabra );
                    break;
                case ')':
                    System.out.println("ingreso parentecis cerrado"+palabra);
                    break;
                case '{':
                    System.out.println("ingreso llave abierta"+palabra);
                    break;
                case '}':
                    System.out.println("ingreso llave cerrada"+palabra);
                    break;
                case '[':
                    System.out.println("ingreso corchete abierto"+palabra);
                    break;
                case ']':
                    System.out.println("ingreso corchete cerrado"+palabra);
                    break;
                default:
                    System.out.println("No ingreso ninguno de los elementos necesarios.");
                    break;
            }
        }
    }
     
}
