package com.biblioteca;

public class Novela extends Libro {
   //atributo específico de la clase Novela para el tipo de novela
    public enum TipoNovela {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS
    }

    private TipoNovela tipo;
//constructor vacio
    public Novela() {
        super();
        this.tipo = TipoNovela.AVENTURAS;
    }
//constructor con parámetros
    public Novela(String titulo, String autor, int Ejemplares, int EjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, Ejemplares, EjemplaresPrestados);
        this.tipo = tipo;
    }
//getters y setters para el tipo de novela
    public TipoNovela getTipo() { return tipo; }
    public void setTipo(TipoNovela tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Novela{titulo='" + getTitulo() + "', autor='" + getAutor() +
               "', ejemplares=" + getEjemplares() +
               ", prestados=" + getEjemplaresPrestados() +
               ", disponibles=" + getEjemplares() +
               ", tipo=" + tipo + "}";
    }
    }
    

