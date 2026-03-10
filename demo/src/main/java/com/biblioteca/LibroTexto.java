package com.biblioteca;

public class LibroTexto extends Libro {
    private String curso;
 //constructor vacio
    public LibroTexto() {
        super();
        this.curso = "";
    }
    //constructor con parámetros
    public LibroTexto(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String curso) {
        super(titulo, autor, ejemplares, ejemplaresPrestados);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    //sobrescribir el método toString para mostrar la información del libro de texto 
    @Override
    public String toString() {
        return "LibroTexto{" +
                "curso='" + curso + '\'' +
                ", " + super.toString() +
                '}';
    }

}