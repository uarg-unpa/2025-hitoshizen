package Recursividad;
/*
  Escribe un método recursivo que encuentre el valor mínimo en un arreglo de enteros.
 */
public class ValorMin {
    public static void main(String args []){
        final int dim = 5;
        int resultado;
        int [] vector = new int [dim];
        for (int i=0; i<dim; i++){
            vector[i] = (int) (Math.random() * 100) + 1;  
        }
        for (int i=0; i<dim; i++){
            System.out.print(vector[i] + " | ");
        }
         
        resultado = encontrarMinimo(vector, dim-1, vector[dim-1]);
        System.out.println("");
        System.out.println("El valor mínimo en el arreglo es: " + resultado);
    }
    
    public static int encontrarMinimo(int v[], int n, int minimo){
        if (n < 0){   // caso base
            return minimo;
        }else{         // caso general
            if (v[n] < minimo)         
                return encontrarMinimo(v,n-1,v[n]);
            else
                return encontrarMinimo(v,n-1,minimo);
        }
    }   
}
