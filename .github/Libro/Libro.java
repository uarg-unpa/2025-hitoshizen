package Libro;
/* 
 Atributos: marca, modelo, año, velocidadActual.

Métodos:
acelerar(cantidad) → aumenta la velocidadActual.

frenar(cantidad) → disminuye la velocidadActual (sin que sea negativa).

mostrarInfo() → imprime la información del coche.
 */
public class Libro {
    private String marca;
    private String modelo;
    private int Ano;
    private double velocidadActual;
    public Libro(String marca, String modelo, int Ano, double velocidadActual){
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = Ano;
        this.velocidadActual = velocidadActual;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public String getmarca(){
        return this.marca;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    public String getmodelo(){
        return this.modelo;
    }
    public void setAno(int Ano){
        this.Ano = this.Ano;
    }
    public int getAno(){
        return Ano;
    }
    public void setvelocidadActual(double velocidadActual){
        this.velocidadActual = velocidadActual;
    }
    public double getvelocidadActual(){
        return this.velocidadActual;
    }
    
    public int acelerar(){
        return (int) (this.velocidadActual = velocidadActual + 10000);
    }
    public int frenar(){
        return (int) (this.velocidadActual = 0);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}   
