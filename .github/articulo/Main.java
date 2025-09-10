package articulo;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teatro teatro1 = new Teatro("Una buena obre", 5000, "ASFDWQER", "Cincuenta");
        System.out.println("Se actualiza el precio de la obra : ");
        teatro1.setprecio(500000);
    
        System.out.println("crementa el código");
        System.out.println(teatro1.crementar());
        teatro1.crementar();

    } 
}
