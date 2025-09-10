/*
Una estación de servicio cuenta con una capacidad máxima de 10000 litros. 
En la estación es posible cargar o reponer combustible. 
Cuando la capacidad de la estación está por debajo de los 10 litros se debe informar de tal situación. 
Implemente la clase.
*/
package estacion;

public class Estacion {
    // Atributos
    private final  double capacidadMaxima = 10000; 
    private double cantidadActual;
    public char[] litros;

    // Constructor
    public Estacion(double cantidadInicial){
        if (cantidadInicial <= capacidadMaxima){
            this.cantidadActual = cantidadInicial;
        } else {
            this.cantidadActual = capacidadMaxima;
        }
    }

    // Método para cargar combustible (restar de la estación)
    public void cargarCombustible(double litros){
        if (litros > 0 && litros <= cantidadActual){
            cantidadActual -= litros;
        } else {
            System.out.println("No hay suficiente combustible para cargar esa cantidad.");
        }
    }

    // Método para reponer combustible (sumar a la estación)
    public void reponerCombustible(double litros){
        if (litros > 0){
            if (cantidadActual + litros <= capacidadMaxima){
                cantidadActual += litros;
            }else{
                cantidadActual = capacidadMaxima; // No superar la capacidad máxima
            }
        }
    }

    // Método para verificar si está por debajo del nivel crítico
    public void verificarNivel(){
        if (cantidadActual < 10){
            System.out.println(" Atención: la estación está por debajo de 10 litros.");
        }
    }

    // Getter
    public double getCantidadActual(){
        return cantidadActual;
    }
}
