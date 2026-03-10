package com.biblioteca;

public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;
    //constructor vacio 
    public LibroTextoUNIAC() {
        super();
        this.facultad = "";
    }   
    //constructor con parámetros
    public LibroTextoUNIAC(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, ejemplares, ejemplaresPrestados, curso);
        this.facultad = facultad;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    //sobrescribir el método toString para mostrar la información del libro de texto UNIAC
    @Override   
    public String toString() {
        return "LibroTextoUNIAC{" +
                "facultad='" + facultad + '\'' +
                ", " + super.toString() +
                '}';
    }   
    

    
}
