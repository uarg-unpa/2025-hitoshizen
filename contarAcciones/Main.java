package pilas.contarAcciones;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Ingrese cuantas acciones desea apilar: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Pila pila = new Pila(n);

        System.out.println("CARGAR ACCIONES EN LA PILA");
        for (int i = 0; i < n; i++) {
            System.out.print("Accion " + (i + 1) + ": ");
            String accion = sc.nextLine();
            pila.meter(accion);      
        }

        // Mostrar pila cargada
        System.out.println("Pila cargada:");
        pila.mostrar();

        // Pedir accion al usuario
        System.out.print("Ingrese la accion a buscar: ");
        String buscada = sc.nextLine();

        // Mostrar cuantas veces aparece
        int veces = pila.contarAcciones(buscada);

        System.out.println("La accion \"" + buscada + "\" aparece " + veces + " veces en la pila.");

        // Verificar que la pila no se modifico
        System.out.println("Pila final (debe ser igual a la original):");
        pila.mostrar();
    }
}
