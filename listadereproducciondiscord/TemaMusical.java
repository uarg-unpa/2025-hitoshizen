package pilas.listadereproducciondiscord;

public class TemaMusical {
    private String nombre;
    private String interprete;
    private String genero;
    private int anioLanzamiento;

    public TemaMusical(String nombre, String interprete, String genero, int anioLanzamiento) {
        this.nombre = nombre;
        this.interprete = interprete;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    public String getInterprete() {
        return interprete;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public String toString() {
        return "TemaMusical{" +
                "interprete='" + interprete + '\'' +
                ", genero='" + genero + '\'' +
                ", anioLanzamiento=" + anioLanzamiento +
                '}';
    }
}
