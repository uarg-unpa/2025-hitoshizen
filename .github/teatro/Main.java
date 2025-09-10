package teatro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Seleccione opcion: ");
        String nombre;
        nombre = scanner.nextLine();
        double precionuevo;
        precionuevo = scanner.nextDouble();
        Obra o1 = new Obra(10000, "demon slayer");
        Obra o2 = new Obra(precionuevo, nombre);
        scanner.close();    

    }
    
}
