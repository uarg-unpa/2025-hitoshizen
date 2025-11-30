package estacion;

public class Main {
    public static void main(String[] args) {
        Estacion estacion  = new Estacion(1000);
        estacion.cargarCombustible(10000);
        System.out.println(estacion.litros);
    }
}
