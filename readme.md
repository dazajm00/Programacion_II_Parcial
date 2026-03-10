# Parcial programacion 
## Juan Manuel Daza 

### Diagrama de clases 
classDiagrama
    class Libro {
        -String titulo
        -String autor
        -int numEjemplares
        -int numEjemplaresPrestados
        +Libro()
        +Libro(titulo, autor, nEj, nEjPrest)
        +getEjemplaresDisponibles() int
        +prestamo() boolean
        +devolucion() boolean
        +toString() String
    }

    class LibroTexto {
        -String curso
        +LibroTexto()
        +LibroTexto(titulo, autor, nEj, nEjPrest, curso)
        +getCurso() String
        +setCurso(curso)
        +toString() String
    }

    class LibroTextoUNIAC {
        -String facultad
        +LibroTextoUNIAC()
        +LibroTextoUNIAC(titulo, autor, nEj, nEjPrest, curso, facultad)
        +getFacultad() String
        +setFacultad(facultad)
        +toString() String
    }

    class Novela {
        -TipoNovela tipo
        +Novela()
        +Novela(titulo, autor, nEj, nEjPrest, tipo)
        +getTipo() TipoNovela
        +setTipo(tipo)
        +toString() String
    }

    class TipoNovela {
        <<enumeration>>
        HISTORICA
        ROMANTICA
        POLICIACA
        REALISTA
        CIENCIA_FICCION
        AVENTURAS
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAC
    Libro <|-- Novela
    Novela --> TipoNovela