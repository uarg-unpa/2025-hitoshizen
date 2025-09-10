package Auto;

public class Auto {
    private String marca;
    private String modelo;
    private int Ano;
    private double velocidadActual;
    public Auto(String marca, String modelo, int Ano, double velocidadActual){
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
    
    public double acelerar(){
        return (double) (this.velocidadActual = velocidadActual + 10000);
    }
    public int frenar(){
        return (int) (this.velocidadActual = 0);
    }
    @Override
    public String toString() {
        return "Auto [Marca=" + marca + ", Modelo=" + modelo + ", Año=" + Ano +
         ", Velocidad actual=" + velocidadActual + "]";
    }
}
