package pilas.libreria;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;
    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;  
    }
    public int getPaginas(){
        return this.paginas;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){ 
        this.autor = autor;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }            
    public String toString(){
        return "Titulo: " + this.titulo + ", Autor: " + this.autor + ", Paginas: " + this.paginas;
    }

}
