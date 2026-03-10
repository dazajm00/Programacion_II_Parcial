package com.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;
     //constructor vaciooo
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.ejemplaresPrestados = 0;
    }
       //constructor con parámetrosss
    public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    // getters y setters de cada atributo 
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }   
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }   
    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }  
    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    //metodo prestamo y devolucion
    public boolean prestamo() {
        if (getEjemplares() > getEjemplaresPrestados()) {
            setEjemplaresPrestados(getEjemplaresPrestados() + 1);
            return true;
        } else {
            return false;
        }
    } 

    public boolean devolucion() {
        if (getEjemplaresPrestados() > 0) {
            setEjemplaresPrestados(getEjemplaresPrestados() - 1);
            return true;
        } else {
            return false;
        }
    }
        //metodo toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + ejemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }

}
    

