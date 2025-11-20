package teatro;
/*
Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases.
 */
public class Teatro {
    private String nombre;
    private String direccion;
    
    public Teatro (String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
}
