package articulo;
/*
Un artículo tiene una descripción, un precio, un código, y un stock (cantidad de unidades disponibles del
artículo). 
Implementar las operaciones que permitan decrementar e incrementar el stock. 
 */
public class Teatro {
    private String descripcion;
    private int precio;
    private String codigo;
    private String stock; 
    public Teatro(String descripcion, int precio, String codigo, String stock){
        this.descripcion = descripcion; 
        this.precio = precio;
        this.codigo = codigo; 
        this.stock = stock; 
    }    
    public void setdescipcion(String descripcion){
        this.descripcion = descripcion; 
    }
    public String getdescripcion(){
        return this.descripcion;
    }
    public void setprecio(int precio){
        this.precio = precio;
    }
    public int getprecio(){
        return this.precio;
    }

    public void setcodigo(String codigo){
        this.codigo = codigo;
    }
    public String getcodigo(){
        return this.codigo; 
    }
    public void setstock(String stock){
        this.stock = stock;
    }
    public String getstock(){
        return this.stock;
    }
    public int decrementar(){
        return precio = precio-10;
    }
    public int crementar(){
        return precio = precio+10;
    }

}
