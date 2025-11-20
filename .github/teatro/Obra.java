package teatro;

public class Obra{
    private double precio;
    private String nombre;
    public Obra(double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}