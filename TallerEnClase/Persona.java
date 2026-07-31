package TallerEnClase;

public abstract class Persona {
    private String nombre;
    private int documento;
    private int edad;

    Public Persona(String entradaNombre, int entradaDocumento, int entradaEdad) {
        this.nombre = entradaNombre;
        this.documento = entradaDocumento;
        this.edad = entradaEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}



